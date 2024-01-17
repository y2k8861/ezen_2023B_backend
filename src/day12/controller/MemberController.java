package day12.controller;

import day12.model.MemberDao;
import day12.model.MemberDto;

// CONTROLLER : VIEW 와 DAO 중계역할
public class MemberController {

    // 싱글톤
    private MemberController(){};
    private static MemberController memberController = new MemberController();
    public static MemberController getInstance(){return memberController;};

    // 1. 회원가입 메소드
    public boolean signup(MemberDto memberDto){
        System.out.println("[2]MemberController.signup");
        // 1. 유효성 검사처리
        // 2. view 받은 객체를 DAO에게 전달 후 처리 결과를 받기
        boolean result = MemberDao.getInstance().signup(memberDto);
        System.out.println("[4]result = " + result);
        return result;
    }

    // * 로그인 했다는 증거. - 로그아웃을 하기전까지. [아이디]
    String loginSession = null; // null이면 비로그인 null 대신에 아이디가 있으면

    // 2. 로그인 메소드
    public boolean login(MemberDto memberDto){
        System.out.println("[2]MemberController.login");
        boolean result = MemberDao.getInstance().login(memberDto);
        System.out.println("[4]result = " + result);
        if(result){
            loginSession = memberDto.getId();
        }
        return result;
    }

    public String findId(MemberDto memberDto){
        System.out.println("[2]MemberController.findId");
        String result = MemberDao.getInstance().findId(memberDto);
        System.out.println("[4]result = " + result);
        return result;
    }

    public String findPw(MemberDto memberDto) {
        System.out.println("[2]MemberController.findPw");
        String result = MemberDao.getInstance().findPw(memberDto);
        System.out.println("[4]result = " + result);
        return result;
    }

    public boolean idTest(MemberDto memberDto) {
        System.out.println("[2]MemberController.idTest");
        boolean result = MemberDao.getInstance().idTest(memberDto);
        System.out.println("[4]result = " + result);
        return result;
    }
}
