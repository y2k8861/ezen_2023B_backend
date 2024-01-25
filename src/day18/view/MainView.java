package day18.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainView { // class S
    private static MainView mainView = new MainView();
    private MainView(){};
    public static MainView getInstance(){return mainView;}

    Scanner scanner = new Scanner(System.in);

    public void run(){
        while (true){
            System.out.println("================ 메인페이지 ================");
            System.out.println("1.회원가입 2.로그인");
            try {
               int ch = scanner.nextInt();
               if (ch == 1){
                   MemberView.getInstantce().signUp();
               } else if (ch == 2) {
                   MemberView.getInstantce().login();
               }
            } catch (InputMismatchException e){ // input type오류
                System.out.println("<안내> 입력 할 수 없는 형식입니다."+e);  // !!! :
                scanner = new Scanner(System.in);   // 입력객체내 입력받은 필드/바이트 초기화
            } catch (Exception e){  // 그 외 : 테스트 하면서 오류 확인후 추후에 업데이트 예정
                System.out.println(e);
            }
        }
    }
}// class E