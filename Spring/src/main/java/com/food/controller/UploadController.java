package com.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {

    @RequestMapping(value="/upload", method = RequestMethod.GET)
    public void uploadForm(){

    }
    @RequestMapping(value="/uploadFormAction", method = RequestMethod.POST)
    public void uploadFromPost(MultipartFile[] multipartFile) throws IOException {
        String uploadFolder="D:\\01-STUDY\\upload";

        for (MultipartFile file : multipartFile) {
            System.out.println(file.getOriginalFilename());
            System.out.println(file.getSize());

            File saveFile = new File(uploadFolder,file.getOriginalFilename());

            file.transferTo(saveFile);
        }
    }

    @RequestMapping(value="/uploadajax", method = RequestMethod.GET)
    public void uploadAjax(){

    }
    @RequestMapping(value="/uploadajaxAction", method = RequestMethod.POST)
    public void uploadAjaxPost(MultipartFile[] multipartFile) throws IOException {
        String uploadFolder="D:\\01-STUDY\\upload";

        for (MultipartFile file : multipartFile) {
            System.out.println(file.getOriginalFilename());
            System.out.println(file.getSize());

            File saveFile = new File(uploadFolder,file.getOriginalFilename());

            file.transferTo(saveFile);
        }
    }

}
