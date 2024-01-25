package day18.controller;


import day18.model.dao.MemberDao;
import day18.model.dto.MemberDto;

public class MemberController {
    private MemberController(){};
    private static MemberController memberController = new MemberController();
    public static MemberController getInstance(){return memberController;}

    // 1. 회원가입
    public int signUp(MemberDto memberDto){
        // 1. 반환함수
        int result = 0;

            // 3.가공처리/로직
                // 1. 만약에 입력받은 아이디의 길이가 8글자 미만이면 실패
//            if(memberDto.getMid().length() < 8){return 3;}
                // 2. 아이디 중복검사
        if(MemberDao.getInstantce().idCheck(memberDto.getMid())){return 2;}
                // 3. 회원가입 요청
        result = MemberDao.getInstantce().signUp(memberDto);

        // 2. 반환
        return result;
    }

    int loginMno = 0;

    // 2-1. 로그인
    public boolean login(MemberDto memberDto){
        boolean result = MemberDao.getInstantce().login(memberDto);
        //result = 다오 불러주기;
        if(result){
            loginMno = MemberDao.getInstantce().findMno(memberDto.getMid());
        }
        return result;
    }

    // 2-2. 로그아웃
    public void logout(){
        loginMno = 0;
    }
}
