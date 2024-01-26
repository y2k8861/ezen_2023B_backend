package day18.controller;

import day18.model.dao.BoardDao;
import day18.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {
    private BoardController(){}
    private static BoardController boardController = new BoardController();
    public static BoardController getInstantce(){return boardController;}

    public ArrayList<BoardDto> boardView(){
        ArrayList<BoardDto> result = new ArrayList<>(); // 3. 객체 담을 배열 생성
        result = BoardDao.getInstantce().boardView();   // 4. 배열에 BoardDao boardView 메소드 결과값 리턴
        return result;  // 11. boardView() 결과값 다시 리턴
    };

    public String findId(int num){
        return BoardDao.getInstantce().findId(num);
    }

    public String findCategory(int num){
        return BoardDao.getInstantce().findCategory(num);
    }
}
