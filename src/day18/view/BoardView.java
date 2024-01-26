package day18.view;

import day18.controller.BoardController;
import day18.controller.MemberController;
import day18.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    private BoardView(){}
    private static BoardView boardView = new BoardView();
    public static BoardView getInstantce(){return boardView;}

    // 입력객체
    Scanner scanner = MainView.getInstance().scanner;

    // 0. 로그인 성공시 출력되는 화면.
    public void run(){
        while (true){

            System.out.println("========== ezen 게시판 ==========");
            // 추후에 현재 게시물 출력 메소드가 들어갈 자리
            // 모든 글 출력 시작
            ArrayList<BoardDto> boardDtos = new ArrayList<>();  // 1.BoardDot 객체를 저장할 배열 생성
            boardDtos = BoardController.getInstantce().boardView(); // 2.BoardController에서 BoardView메소드 실행 --> BoardController 이동 ->
            System.out.printf("%5s \t %-10s \t %-10s \t %-15s \t %-10s \t %-10s\n","게시물번호","카테고리","작성자","작성일","조회수","제목");
            for(BoardDto i : boardDtos){    // 12. boardView()에서 호출한 배열을 향상된 포문으로 돌린다.
                String writer= BoardController.getInstantce().findId(i.getMno());   // 13. mno를 이용한 해당 아이디 찾기
                String category = BoardController.getInstantce().findCategory(i.getCno());  // 14. cno를 이용한 해당 카테고리 명찾기 찾기
                String date = i.getBdate().split(" ")[0];   // 15. datetime 타입은 시간도 같이 저장되서 시간을 짜르고 날짜만 불러오기
                System.out.printf("%-8d \t %-10s \t %-10s \t %-15s \t %-10d \t %-10s\n",i.getBno(),category,writer,date,i.getBview(),i.getBtitle());    // 16. 배열에서 한 객체씩 출력
            }
            // 모든 글 출력 끝
            System.out.println("--------------------------------");
            System.out.println("1.글쓰기 2.글보기 3.로그아웃");
            System.out.print("선택>"); int ch = scanner.nextInt();

            if(ch == 1){}
            else if(ch == 2) {}
            else if(ch == 3) {
                System.out.println("<안내> 로그아웃이 되었습니다.");
                MemberController.getInstance().logout(); // 회원컨드롤러에 로그아웃 처리 요청
                return; // 현제 메소드 종료
            }
        }
    }
}
