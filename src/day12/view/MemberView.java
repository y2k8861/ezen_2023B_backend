package day12.view;

import day12.controller.MemberController;
import day12.model.MemberDao;
import day12.model.MemberDto;

import java.util.Scanner;

// VIEW : 화면구현(입출력)
public class MemberView {

    // 싱글톤
    private MemberView(){};
    private static MemberView memberView = new MemberView();
    public static MemberView getInstance(){return memberView;};

    // 1. 회원가입 메소드
    public void signup(){
        System.out.println("[1]MemberView.signup");
        Scanner scanner = MainView.getInstance().scanner;

        // 1. 입력받는다.
        //boolean run = true;
        String id = "";
        while (true){
            System.out.println("아이디 : ");   id = scanner.next();
            MemberDto memberDto = new MemberDto();
            memberDto.setId(id);
            boolean result = MemberController.getInstance().idTest(memberDto);
            if(result){
                break;
            } else {
                System.out.println("중복된 아이디입니다.");
            }

        }
        System.out.println("비밀번호 : ");  String pw = scanner.next();
        System.out.println("이름 : ");    String name = scanner.next();
        System.out.println("전화번호 : ");  String phone = scanner.next();

        // 유효성 검사

        // 2. 객체화
        MemberDto memberDto = new MemberDto(0, id, pw, name, phone);

        // 3. 객체를 컨트롤에게 전달(매개변수.회원가입 필요한 정보·객체) 후
            // 처리결과 (리턴/회원가입 처리 결과byte·boolean) 받기
        boolean result = MemberController.getInstance().signup(memberDto);
        System.out.println("[5]result = " + result);
        if(result){
            System.out.println("안내] 회원가입 성공");
        } else {System.out.println("안내] 회원가입 성공");}
    }

    // 2. 로그인메소드
    public void login(){
        System.out.println("[1]MemberView.login");
        // 1. 입력받기
        Scanner scanner = MainView.getInstance().scanner;
        System.out.println("아이디 : ");   String id = scanner.next();
        System.out.println("비밀번호 : ");  String pw = scanner.next();

        // 2. 객체 vs 2개 문자열
        MemberDto memberDto = new MemberDto();
        memberDto.setId(id);
        memberDto.setPw(pw);

        // 3. 컨트롤에게 전달 하고 결과 받기
        boolean result = MemberController.getInstance().login(memberDto);
        System.out.println("[5]result = " + result);
        if(result){
            System.out.println("안내] 로그인 성공");
            // 로그인 성공시 사용 할 서비스의 view로 이동
        } else {
            System.out.println("안내] 로그인 실패");
        }

    }

    public void findId(){
        System.out.println("[1]MemberView.findId");
        // 1. 입력받기
        Scanner scanner = MainView.getInstance().scanner;
        System.out.println("이름: ");   String name = scanner.next();
        System.out.println("번호: ");   String phone = scanner.next();
        MemberDto memberDto = new MemberDto();
        memberDto.setName(name);
        memberDto.setPhone(phone);

        String result = MemberController.getInstance().findId(memberDto);
        System.out.println("[5]result = " + result);
        if(result == null){
            System.out.println("찾으시는 아이디가 없습니다.");
        } else {
            System.out.println("찾으시는 아이디 : " + result);
        }
    }

    public void findPw(){
        System.out.println("[1]MemberView.findId");
        // 1. 입력받기
        Scanner scanner = MainView.getInstance().scanner;
        System.out.println("아이디: ");   String id = scanner.next();
        System.out.println("번호: ");   String phone = scanner.next();
        MemberDto memberDto = new MemberDto();
        memberDto.setId(id);
        memberDto.setPhone(phone);

        String result = MemberController.getInstance().findPw(memberDto);
        System.out.println("[5]result = " + result);
        if(result == null){
            System.out.println("찾으시는 정보가 없습니다.");
        } else {
            System.out.println("임시비밀번호 : " + result);
        }
    }
}
