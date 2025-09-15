package com.ohgiraffers.request;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoardService {
    private final BoardMapper boardMapper;

    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

//    @Transactional
//    public void registNewPost(BoardDTO boardDTO) {
//        boardMapper.registNewPost(boardDTO);
//    }

    public List<BoardDTO> findAllPosts() {
        System.out.println("서비스1");
        System.out.println(boardMapper.findAllPosts());
        System.out.println("서비스2");
        System.out.println(boardMapper.findAllPosts());
        return boardMapper.findAllPosts();

    }

}
