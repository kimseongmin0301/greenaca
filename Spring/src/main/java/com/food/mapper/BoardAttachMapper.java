package com.food.mapper;

import com.food.model.AttachFileVO;

import java.util.ArrayList;

public interface BoardAttachMapper {
    // 첨부파일 db작업
    public void insert(AttachFileVO attachFileVO);
    // 게시물 첨부파일 조회
    ArrayList<AttachFileVO> attachlist(int bno);
}
