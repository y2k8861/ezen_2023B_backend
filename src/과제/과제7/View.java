package 과제.과제7;

import java.util.Scanner;

public class View { // class S

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {    // main S
        View.getInstance().run();
    }   // main E

    private View(){}
    private static View view = new View();
    public static View getInstance(){return view;}

    public void run(){
        while (true){
            System.out.println("==== 메인페이지 ====");
            System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기");
            System.out.println("선택> ");
            int ch = scanner.nextInt();

            if(ch == 1){    // 회원가입 페이지 이동
                signUp();
            } else if(ch == 2){ // 로그인 페이지 이동
                login();
            } else if(ch == 3){
                findId();
            } else if(ch == 4){
                findPw();
            }
        }
    }

    public void signUp(){   // 회원가입 페이지
        System.out.println("[1]View.signUp");
        String id = idTest();
        System.out.println("비밀번호 : "); String pw = scanner.next();
        System.out.println("이름 : "); String name = scanner.next();
        System.out.println("전화번호 : "); String phone = scanner.next();
        System.out.println("나이 : "); int age = scanner.nextInt();

        MemberDto memberDto = new MemberDto(id,pw, name, phone, age);
        boolean result = Controller.getInstance().signUp(memberDto);
        System.out.println("[5]result = " + result);
        if(result){
            System.out.println("회원가입 성공");
        } else {
            System.out.println("회원가입 실패");
        }
    }

    public void login(){    // 로그인 페이지
        System.out.println("[1]View.login");
        System.out.println("아이디 : "); String id = scanner.next();
        System.out.println("비밀번호 : "); String pw = scanner.next();

        MemberDto memberDto = new MemberDto();
        memberDto.setId(id);
        memberDto.setPw(pw);
        boolean result = Controller.getInstance().login(memberDto);
        System.out.println("[5]result = " + result);
        if(result){
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }

    }

    public void findId(){   // 아이디 찾기 페이지
        System.out.println("[1]View.findId");
        System.out.println("이름 : "); String name = scanner.next();
        System.out.println("전화번호 : "); String phone = scanner.next();
        MemberDto memberDto = new MemberDto();
        memberDto.setName(name);
        memberDto.setPhone(phone);
        String result = Controller.getInstance().findId(memberDto);
        if(result == null){
            System.out.println("찾으시는 아이디가 없습니다.");
        } else {
            System.out.println("아이디 : " + result);
        }

    }

    public void findPw(){   // 비번 찾기 페이지
        System.out.println("[1]View.findPw");
        System.out.println("아이디 : "); String id = scanner.next();
        System.out.println("이름 : "); String name = scanner.next();
        MemberDto memberDto = new MemberDto();
        memberDto.setId(id);
        memberDto.setName(name);
        String result = Controller.getInstance().findPw(memberDto);
        if(result == null){
            System.out.println("찾으시는 비밀번호 정보가 없습니다.");
        } else {
            System.out.println("비밀번호 : " + result);
        }
    }

    public String idTest(){
        String id ="";
        while (true){
            System.out.println("아이디 : "); id = scanner.next();
            boolean result = Controller.getInstance().idTest(id);
            if(!result){
                System.out.println("중복된 아이디 입니다.");
            } else {
                break;
            }
        }
        return id;
    }


}   // class E
