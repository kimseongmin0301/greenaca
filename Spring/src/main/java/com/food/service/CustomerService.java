package com.food.service;

import com.food.model.CustomerVO;

public interface CustomerService {
    public void join(CustomerVO customerVO);

    public CustomerVO login(CustomerVO customerVO);

    public void cmModify(CustomerVO customerVO);
}
