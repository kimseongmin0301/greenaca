package com.food.mapper;

import com.food.model.ReplyVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ReplyMapper {
    public int replyWrite(ReplyVO replyVO);

    ArrayList<ReplyVO> list(int bno);
}
