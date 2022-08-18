package com.food.controller;

import com.food.model.SampleVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {

    @RequestMapping(value="/sample/getText", produces = "text/plain; charset=UTF-8",method = RequestMethod.GET)
    public ResponseEntity<String> getText(){

        return new ResponseEntity<>("안녕", HttpStatus.OK);
    }
    @RequestMapping(value="/sample/getSample", method = RequestMethod.GET)
    public ResponseEntity<SampleVO> getSample(){
        SampleVO sampleVO = new SampleVO();
        sampleVO.setNo(1);
        sampleVO.setName("읏차");
        sampleVO.setGender("남");
        ResponseEntity<SampleVO> result = null;
        result = ResponseEntity.status(HttpStatus.OK).body(sampleVO);

        return result;
    }

    @RequestMapping(value="/sample/getSample1", method = RequestMethod.POST)
    public ResponseEntity<SampleVO> getSample1(@RequestBody SampleVO sampleVO){
        System.out.println("samplemvo data ="+sampleVO);
        ResponseEntity<SampleVO> result = null;
        result = ResponseEntity.status(HttpStatus.OK).body(sampleVO);

        return result;
    }

}
