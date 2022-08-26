package com.food.service;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
@Transactional
public class ImgService {
    public void checkImageMimeType(MultipartFile file) throws Exception{
        // TODO img 타입 검사
    }

    public void saveImg(MultipartFile file){
        try{
            this.checkImageMimeType(file);

            String fileName = file.getOriginalFilename();
            String originalName = fileName.substring(0, fileName.lastIndexOf("."));
            String extension = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();

            // TODO random 문자열
            String saveName = "random";


        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
