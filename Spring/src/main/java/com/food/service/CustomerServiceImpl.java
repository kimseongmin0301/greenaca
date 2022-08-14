package com.food.service;

import com.food.mapper.CustomerMapper;
import com.food.model.CustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;

    public void join(CustomerVO customerVO) throws Exception{
        customerMapper.join(customerVO);
    }

    public CustomerVO login(CustomerVO customerVO){
        return customerMapper.login(customerVO);
    }

    public void cmModify(CustomerVO customerVO){
        customerMapper.cmModify(customerVO);
    }

    @Override
    public int idCheck(String id) throws Exception{
        return customerMapper.idCheck(id);
    }

    public void withDraw(CustomerVO customerVO){
        customerMapper.withDraw(customerVO);
    }
}
