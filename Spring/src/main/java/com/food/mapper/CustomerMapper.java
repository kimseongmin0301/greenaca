package com.food.mapper;

import com.food.model.CustomerVO;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CustomerMapper {

    // 로그인
    CustomerVO login(CustomerVO customerVO);

    //회원가입
    void join(CustomerVO customerVO) throws Exception;
    int idCheck(String id) throws Exception;

    //회원정보수정
    void cmModify(CustomerVO customerVO);

    //회원탈퇴
    void withDraw(CustomerVO customerVO);
}
