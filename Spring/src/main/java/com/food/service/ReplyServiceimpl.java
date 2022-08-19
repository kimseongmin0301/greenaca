package com.food.service;

import com.food.mapper.ReplyMapper;
import com.food.model.ReplyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReplyServiceimpl implements ReplyService{
    @Autowired
    ReplyMapper replyMapper;

    public int replyWrite(ReplyVO replyVO){
       return replyMapper.replyWrite(replyVO);
    }

    public ArrayList<ReplyVO> list(int bno){
        return replyMapper.list(bno);
    }
}
