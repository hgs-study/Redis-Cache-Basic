package com.example.rediscashbasic.business.board.application;

import com.example.rediscashbasic.business.board.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardRepository {

    //DB 조회 횟수
    private static int dbCount = 0;
    //DB 조회를 했다고 가정하여 카운트를 올린다.
    public List<Board> createBySize(String size){
        System.out.println("11111");
        dbCount++;
        ArrayList<Board> boards = new ArrayList<Board>();
        int count = Integer.parseInt(size);
        System.out.println("count = " + count);

        for(int i = 0; i< count; i++){
            boards.add(new Board(i+ 0L, i+"번쨰 게시물" ,i+"번째 내용"));
        }
        return boards;
    }

    public static int getDbCount(){
        return dbCount;
    }
}
