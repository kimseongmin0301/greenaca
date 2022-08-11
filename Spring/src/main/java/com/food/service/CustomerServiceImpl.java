package com.food.service;

import com.food.mapper.CustomerMapper;
import com.food.model.CustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;

    public void join(CustomerVO customerVO){
        customerMapper.join(customerVO);
    }
}
