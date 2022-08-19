package com.food.controller;

import com.food.model.ReplyVO;
import com.food.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class ReplyController {

    @Autowired
    ReplyService replyService;

    // 댓글 쓰기
    @RequestMapping(value="/replies", method = RequestMethod.POST)
    public ResponseEntity<String> replyWrite(@RequestBody ReplyVO replyVO){
        int result = replyService.replyWrite(replyVO);
        if(result == 1){
            return new ResponseEntity<>("success", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 댓글 목록
    @RequestMapping(value = "/replies/{bno}", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<ReplyVO>> getList(@PathVariable int bno){
        System.out.println(bno);

        return new ResponseEntity<>(replyService.list(bno), HttpStatus.OK);
    }
}
