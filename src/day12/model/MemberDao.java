package day12.model;

import day12.controller.MemberController;
import 과제.과제5.Member;

import java.util.ArrayList;
import java.util.Random;

// DAO : 데이터 베이스 접근 객체
public class MemberDao {

    // 싱글톤
    private MemberDao(){};
    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){return memberDao;};

    // DB대신 배열
        // 배열 사용시 불편한점 : 고정길이
        // 고정길이 배열을 가변길이 배열로 구현 => 제공하는 라이브러리/컬렉션(수집) 프레임워크(라이브러리집합)
        // 컬렉션 프레임워크 : ArrayList 가변길이 배열을 지원하는 클래스
        // ArrayList<저장할객체타입> 배열명 = new ArrayList<>();
        // 제공하는 함수
            //   ArrayList<타입> 변수명          vs          타입[] 변수명
            // 요소 저장 : .add(저장할 객체)                       배열명[인덱스] = 저장할 데이터
                // 회원가입
            // 요소 개수 : .size()                               배열명.length
            // 요소 호출 : .get(인덱스)                           배열명[인덱스]
                // 로그인
                // 아이디 찾기
            // 요소 삭제 : .remove(인덱스)                        배열명[인덱스]  = null
                // 회원탈퇴

    // MemberDto[] memberDtos = new MemberDto[100];
    ArrayList<MemberDto> memberDtos = new ArrayList<>();

    // 1. 회원가입 메소드
    public boolean signup(MemberDto memberDto){
        System.out.println("[3]MemberDao.signup");
        memberDtos.add(memberDto);
        return true;   // 회원가입 성공
    }

    // 2. 로그인 메소드
    public boolean login(MemberDto memberDto){
        System.out.println("[3]MemberDao.login");

        // 로그인 처리 : 전체 회원중에 입력받은 동일한 값이 있는지 확인
        for(int i =0; i<memberDtos.size(); i++){
            // i는 0부터 리스트 요소 개수 까지 1씩 증가
            if(memberDtos.get(i).getId().equals(memberDto.getId())){
                // 리스트내 i번째 객체의 아이디와 입력받은 아이디(매개변수) 같은면
                if(memberDtos.get(i).getPw().equals(memberDto.getPw())){
                    // 리스트내 i번째 객체의 비밀번호와 입력받은 비밀번호(매개변수) 같은면
                    return true;
                }
            }
        }
        return false;
    }

    public String findId(MemberDto memberDto){
        System.out.println("[3]MemberDao.findId");
        for(int i =0; i<memberDtos.size(); i++){
            if(memberDtos.get(i).getPw().equals(memberDto.getName()) && memberDtos.get(i).getPw().equals(memberDto.getName())){
                return memberDtos.get(i).getId();
            }
        }

        return  null;
    }
    
    public String findPw(MemberDto memberDto){
        System.out.println("[3]MemberDao.findPw");
        for(MemberDto i : memberDtos){
            if(i.getId().equals(memberDto.getId()) && i.getPhone().equals(memberDto.getPhone())){
                Random random = new Random();
                String result = "";
                for(int j = 0; j <6; j++){
                    result += random.nextInt(10);
                    i.setPw(result);
                }
                return result;
            }
        }
        return null;
    }

    public boolean idTest(MemberDto memberDto) {
        System.out.println("[3]MemberDao.idTest");
        for(MemberDto i : memberDtos){
            if(i.getId().equals(memberDto.getId())){
                return false;
            }
        }
        return true;
    }
}