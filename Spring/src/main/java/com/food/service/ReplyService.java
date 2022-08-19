package com.food.service;

import com.food.model.ReplyVO;
import org.springframework.http.ResponseEntity;

public interface ReplyService {
    public int replyWrite(ReplyVO replyVO);
}
