package com.food.service;

import com.food.model.ReplyVO;

import java.util.ArrayList;

public interface ReplyService {
    public int replyWrite(ReplyVO replyVO);
    ArrayList<ReplyVO> list(int bno);
}
