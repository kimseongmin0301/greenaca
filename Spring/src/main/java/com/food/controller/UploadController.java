package com.food.controller;

import net.coobird.thumbnailator.Thumbnailator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
public class UploadController {

    @RequestMapping(value="/upload", method = RequestMethod.GET)
    public void uploadForm(){

    }
    @RequestMapping(value="/uploadFormAction", method = RequestMethod.POST)
    public void uploadFromPost(MultipartFile[] multipartFile) throws IOException {
        String uploadFolder="D:\\01-STUDY\\upload";

        for (MultipartFile file : multipartFile) {
//            System.out.println(file.getOriginalFilename());
//            System.out.println(file.getSize());

            File saveFile = new File(uploadFolder,file.getOriginalFilename());

            file.transferTo(saveFile);
        }
    }

    @RequestMapping(value="/uploadajax", method = RequestMethod.GET)
    public void uploadAjax(){

    }
    // 년 월 일 폴더 생성하는 메서드
    private String getFolder(){
        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String str = simpleDateFormat.format(date);

        return str.replace("-","\\");
    }

    // 이미지 구분 메서드
    private boolean checkImageType(File file)  {
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

    @RequestMapping(value="/uploadajaxAction", method = RequestMethod.POST)
    public void uploadAjaxPost(MultipartFile[] multipartFile) throws IOException {
        String uploadFolder="D:\\01-STUDY\\upload";

        File uploadPath = new File(uploadFolder,getFolder());
        // 폴더 생성
        if(uploadPath.exists() == false){
            uploadPath.mkdirs();
        }

        System.out.println(uploadPath);
        for (MultipartFile file : multipartFile) {
//            System.out.println(file.getOriginalFilename());
//            System.out.println(file.getSize());

            UUID uuid = UUID.randomUUID();
//            System.out.println("UUID=" + uuid.toString());

            File saveFile = new File(uploadPath,uuid.toString()+"_"+file.getOriginalFilename());
            file.transferTo(saveFile);

            if(checkImageType(saveFile)){
                FileOutputStream thumnail = new FileOutputStream(new File(uploadPath,"s_"+uuid.toString()+"_"+file.getOriginalFilename()));
                Thumbnailator.createThumbnail(file.getInputStream(),thumnail,100,100);

                thumnail.close();
            }
        }
    }

}
