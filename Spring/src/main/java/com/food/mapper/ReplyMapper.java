package com.food.mapper;

import com.food.model.ReplyVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.http.ResponseEntity;

@Mapper
public interface ReplyMapper {
    public int replyWrite(ReplyVO replyVO);
}
