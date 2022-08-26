package com.food.controller;

import com.food.service.ImgService;
import lombok.RequiredArgsConstructor;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/img")
public class ImgController {
    private final ImgService imgService;

    @GetMapping("/")
    public void getImage(HttpServletResponse response){
        String imgName = "D:\\01-STUDY\\upload\\apple.png";
        try {
            response.setContentType("image/png");
            if(imgName != null && Files.exists(Paths.get(imgName))){
                FileCopyUtils.copy(Files.newInputStream(Paths.get(imgName)), response.getOutputStream());
            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
