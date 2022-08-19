package com.food.service;

import com.food.mapper.ReplyMapper;
import com.food.model.ReplyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceimpl implements ReplyService{
    @Autowired
    ReplyMapper replyMapper;

    public int replyWrite(ReplyVO replyVO){
       return replyMapper.replyWrite(replyVO);
    }
}
