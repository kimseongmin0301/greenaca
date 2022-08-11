package com.food.mapper;

import com.food.model.CustomerVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {

    public void main();

    public void join(CustomerVO customerVO);
}
