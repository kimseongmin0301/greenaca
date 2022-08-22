package com.food.controller;

import com.food.model.ReplyVO;
import com.food.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@ResponseBody
public class ReplyController {

    @Autowired
    ReplyService replyService;

    // 댓글 쓰기
    @RequestMapping(value = "/replies", method = RequestMethod.POST)
    public ResponseEntity<String> replyWrite(@RequestBody ReplyVO replyVO) {
        int result = replyService.replyWrite(replyVO);
        if (result == 1) {
            return new ResponseEntity<>("success", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 댓글 목록
    @RequestMapping(value = "/replies/{bno}", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<ReplyVO>> getList(@PathVariable int bno) {
//        System.out.println(bno);

        return new ResponseEntity<>(replyService.list(bno), HttpStatus.OK);
    }

    // 댓글 수정
    @RequestMapping(value = "/replies/modify", method = RequestMethod.PUT)
    public ResponseEntity<String> replyModify(@RequestBody ReplyVO replyVO) {
        System.out.println(replyVO);
        int result = replyService.modify(replyVO);
        if (result == 1) {
            return new ResponseEntity<>("success", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/replies/remove", method = RequestMethod.DELETE)
    public void replyRemove(@RequestBody ReplyVO replyVO) {
        replyService.remove(replyVO);
    }
}