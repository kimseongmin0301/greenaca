package com.food.controller;

import com.food.model.AttachFileVO;
import net.coobird.thumbnailator.Thumbnailator;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Controller
public class UploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public void uploadForm() {

    }

    @RequestMapping(value = "/uploadFormAction", method = RequestMethod.POST)
    public void uploadFromPost(MultipartFile[] multipartFile) throws IOException {
        String uploadFolder = "C:\\img";

        for (MultipartFile file : multipartFile) {
//            System.out.println(file.getOriginalFilename());
//            System.out.println(file.getSize());

            File saveFile = new File(uploadFolder, file.getOriginalFilename());

            file.transferTo(saveFile);
        }
    }

    @RequestMapping(value = "/uploadajax", method = RequestMethod.GET)
    public void uploadAjax() {

    }

    // 년 월 일 폴더 생성하는 메서드
    private String getFolder() {
        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String str = simpleDateFormat.format(date);

        return str.replace("-", "\\");
    }

    // 이미지 구분 메서드
    private boolean checkImageType(File file) {
        try {
            String contentType = Files.probeContentType(file.toPath());
//            System.out.println("contentType= " + contentType);

            // 파일 타입이 image이면 true, 그 이외에는 false
            return contentType.startsWith("image");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @RequestMapping(value = "/uploadajaxAction", method = RequestMethod.POST)
    public ResponseEntity<ArrayList<AttachFileVO>> uploadAjaxPost(MultipartFile[] multipartFile) throws IOException {

        ArrayList<AttachFileVO> list = new ArrayList<>();

        String uploadFolder = "C:\\img";

        // 경로 + 날짜
        File uploadPath = new File(uploadFolder, getFolder());
        // 폴더 생성
        if (uploadPath.exists() == false) {
            uploadPath.mkdirs();
        }

//        System.out.println(uploadPath);
        for (MultipartFile file : multipartFile) {
            // AttachFileVO 클래스의 새로운 주소를 반복생성해 저장
            AttachFileVO attachFileVO = new AttachFileVO();

//            System.out.println(file.getOriginalFilename());
//            System.out.println(file.getSize());

            UUID uuid = UUID.randomUUID();
//            System.out.println("UUID=" + uuid.toString());

            // AttachFileVo의 uploadPath 변수에 저장
            attachFileVO.setUploadPath(getFolder());
            // AttachFileVo의 fileName 변수에 저장
            attachFileVO.setFileName(file.getOriginalFilename());
            // AttachFileVo의 uuid 변수에 저장
            attachFileVO.setUuid(uuid.toString());

            File saveFile = new File(uploadPath, uuid.toString() + "_" + file.getOriginalFilename());
            file.transferTo(saveFile);

            if (checkImageType(saveFile)) {
                // AttachFileVo의 image 변수에 저장
                attachFileVO.setImage(true);

                FileOutputStream thumnail = new FileOutputStream(new File(uploadPath, "s_" + uuid.toString() + "_" + file.getOriginalFilename()));
                Thumbnailator.createThumbnail(file.getInputStream(), thumnail, 100, 100);

                thumnail.close();
            }
            // AttachFileVO를 배열에 저장
            list.add(attachFileVO);
        }

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    // 이미지 주소 생성
    @RequestMapping(value = "/display", method = RequestMethod.GET)
    public ResponseEntity<byte[]> getFile(String fileName) {
//        System.out.println(fileName);
        File file = new File("C:\\img" + fileName);

        ResponseEntity<byte[]> result = null;

        HttpHeaders headers = new HttpHeaders();
        try {
            headers.add("Content-Type", Files.probeContentType(file.toPath()));
            result = new ResponseEntity<>(FileCopyUtils.copyToByteArray(file), headers, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(result);
        return result;
    }

        // 다운로드 주소 생성
    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public ResponseEntity<Resource> downloadFile(String fileName) {

        Resource resource = new FileSystemResource("D:\\01-STUDY\\upload\\" + fileName);

        // 다운로드 시 파일의 이름 처리
        String resourceFilename = resource.getFilename();
        HttpHeaders headers = new HttpHeaders();

        try{
            // 파일이름이 한글일 때, 깨지지 않게하기위함
            headers.add("Content-Disposition","attachment;filename="
                    + new String(resourceFilename.getBytes("utf-8"),"ISO-8859-1"));
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(resource,headers,HttpStatus.OK);
    }

}