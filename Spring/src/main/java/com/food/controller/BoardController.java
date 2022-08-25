package com.food.controller;

import com.food.model.AttachFileVO;
import com.food.model.BoardVO;
import com.food.model.CriteriaVO;
import com.food.model.PageVO;
import com.food.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;

    @RequestMapping(value = "/bread", method = RequestMethod.GET)
    public String list(Model model, CriteriaVO criteriaVO) {
        // boardList.jsp 실행할 때 select된 결과를 가져가라.
        model.addAttribute("list",boardService.list(criteriaVO));
        // boardList.jsp 실행할 때 PageVO에 저장되어 있는 데이터를 가져와라.
        model.addAttribute("paging", new PageVO(criteriaVO, boardService.total(criteriaVO)));
        return "/Board/BoardList";
    }

    @RequestMapping(value = "/boardWrite", method = RequestMethod.GET)
    public String boardWriteGet() {
        return "/Board/BoardWrite";
    }
    @RequestMapping(value = "/boardWrite", method = RequestMethod.POST)
    public String boardWritePost(BoardVO board, AttachFileVO attachFileVO) {
        //비지니스 영역 연결한 후 BoardService에 있는 write 메소드를 호출
        boardService.write(board);
        return "redirect:/bread";
    }

    @RequestMapping(value = "/boardDetail", method = RequestMethod.GET)
    public String detail(BoardVO board, Model model) {
//        System.out.println(board);
        model.addAttribute("detail", boardService.detail(board));
        return "/Board/BoardDetail";
    }

    @RequestMapping(value = "/boardModify", method = RequestMethod.POST)
    public String modify(BoardVO board, RedirectAttributes rttr) {
        boardService.modify(board);
        rttr.addAttribute("bno",board.getBno());
        return "redirect:/boardDetail";
    }

    @RequestMapping(value = "/boardRemove", method = RequestMethod.POST)
    public String remove(BoardVO board) {
        // 글삭제
        boardService.remove(board);

        return "redirect:/bread";
    }
}
