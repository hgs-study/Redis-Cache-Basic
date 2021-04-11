package com.example.rediscashbasic.business.board.application;

import com.example.rediscashbasic.business.board.domain.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class BoardService {

   @Autowired
   BoardRepository boardRepository;

   @Cacheable(key = "#size", value = "getBoards")
    public List<Board> getBoards(String size){
       System.out.println("BoardService.getBoards");
       return boardRepository.createBySize(size);
   }

   public static int getDbCount(){
       return BoardRepository.getDbCount();
   }
}
