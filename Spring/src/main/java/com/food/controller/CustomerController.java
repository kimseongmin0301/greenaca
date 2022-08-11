package com.food.controller;

import com.food.model.CustomerVO;
import com.food.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.ArrayList;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {

        return "/Main/Main";
    }
    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String joinGet() {

        return "/Main/CustomerJoin";
    }
    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public String joinPost(CustomerVO customerVO) {
        customerService.join(customerVO);
        return "redirect:/";
    }
}
