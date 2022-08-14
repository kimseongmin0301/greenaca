package com.food.controller;

import com.food.model.CustomerVO;
import com.food.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {

        return "/Main/Main";
    }

    // 로그인
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String login(CustomerVO customerVO, HttpServletRequest request, RedirectAttributes rttr) {
        HttpSession session = request.getSession();
        CustomerVO login = customerService.login(customerVO);
        if (login == null) {
            session.setAttribute("customer", null);
            rttr.addFlashAttribute("msg", false);
        } else {
            session.setAttribute("customer", login);
        }

        return "redirect:/";
    }

    // 로그아웃
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session){

        session.invalidate();

        return "redirect:/";
    }

    // 회원가입
    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String joinGet() {

        return "/Main/CustomerJoin";
    }

    @ResponseBody
    @RequestMapping(value="/idCheck", method=RequestMethod.POST)
    public int idCheck(String id) throws Exception{
        int result = customerService.idCheck(id);

        return result;
    }

    // 회원가입
    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public String joinPost(CustomerVO customerVO, String id) throws Exception {
        int idResult = customerService.idCheck(id);

        try {
            if (idResult == 1) {
                return "/Main/CustomerJoin";
            } else if(idResult == 0){
                customerService.join(customerVO);
                return "redirect:/";
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }

        return "/Main/CustomerJoin";
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
    public String cmModify(CustomerVO customerVO, RedirectAttributes rttr) {
        customerService.cmModify(customerVO);
        rttr.addAttribute("id", customerVO.getId());

        return "forward:/";
    }

    // 회원탈퇴
    @RequestMapping(value = "/withDraw", method = RequestMethod.POST)
    public String withDraw(CustomerVO customerVO, HttpSession session) {
        customerService.withDraw(customerVO);
        session.invalidate();

        return "redirect:/";
    }
}
