package com.food.service;

import com.food.model.AttachFileVO;
import com.food.model.BoardVO;
import com.food.model.CriteriaVO;

import java.util.ArrayList;


public interface BoardService {
    // 글쓰기 설계
    public void write(BoardVO board);

    // 글 목록 리스트 설계
    public ArrayList<BoardVO> list(CriteriaVO criteriaVO);

    // 글 상세 내용 보기 설계
    public BoardVO detail(BoardVO board);
    // 글 수정 설계
    public void modify(BoardVO board);

    // 글 삭제 설계
    public void remove(BoardVO board);

    int total(CriteriaVO criteriaVO);

    ArrayList<AttachFileVO> attachlist(int bno);
}
