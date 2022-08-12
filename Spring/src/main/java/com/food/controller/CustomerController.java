package com.food.controller;

import com.food.model.CustomerVO;
import com.food.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {

        return "/Main/Main";
    }

    // 로그인
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String login(CustomerVO customerVO, HttpServletRequest request, RedirectAttributes rttr) {
        HttpSession session = request.getSession();
        CustomerVO login = customerService.login(customerVO);
        if(login == null){
            session.setAttribute("customer", null);
            rttr.addFlashAttribute("msg", false);
        }else{
            session.setAttribute("customer", login);
        }

        return "redirect:/";
    }

    // 로그아웃
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) throws Exception{

        session.invalidate();

        return "redirect:/";
    }

    // 회원가입
    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String joinGet() {

        return "/Main/CustomerJoin";
    }

    // 회원가입
    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public String joinPost(CustomerVO customerVO) {
        customerService.join(customerVO);
        return "redirect:/";
    }

    // 회원정보
    @RequestMapping(value = "/cmDetail", method = RequestMethod.GET)
    public String cmDetail(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.getAttribute("customer");
        model.addAttribute("lg", session.getAttribute("customer"));

        return "/Main/CustomerDetail";
    }

    // 회원정보수정
    @RequestMapping(value = "/Modify", method = RequestMethod.POST)
    public String cmModify(CustomerVO customerVO,RedirectAttributes rttr) {
        customerService.cmModify(customerVO);
        rttr.addAttribute("id",customerVO.getId());

        return "forward:/";
    }
}
