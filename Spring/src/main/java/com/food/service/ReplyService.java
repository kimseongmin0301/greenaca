package com.food.service;

import com.food.model.ReplyVO;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

public interface ReplyService {
    public int replyWrite(ReplyVO replyVO);

    ArrayList<ReplyVO> list(int bno);

    int modify(ReplyVO replyVO);

    void remove(ReplyVO replyVO);
}
