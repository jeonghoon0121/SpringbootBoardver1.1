package com.ohgiraffers.request;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/board/*")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService){
        this.boardService =boardService;
    }

    @GetMapping("/list")
    public String findPostList(Model model){

        List<BoardDTO> boardDTOList = boardService.findAllPosts();
        System.out.println("컨트롤러1");
        System.out.println("boardDTOList = " + boardDTOList);

        for(BoardDTO boards : boardDTOList){
            System.out.println("boards = " + boards);
        }
        System.out.println(boardDTOList);
        System.out.println("컨트롤러2");
        model.addAttribute("boardDTOList",boardDTOList);
        return "board/list";
    }

}
