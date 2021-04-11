package com.example.rediscashbasic.business.board.api;

import com.example.rediscashbasic.business.board.application.BoardService;
import com.example.rediscashbasic.business.board.domain.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("cache")
    public List<Board> boards(String size){
        List<Board> boards = boardService.getBoards(size);
        return boards;
    }

    @GetMapping("count")
    public int count(){
        return BoardService.getDbCount();
    }
}
