package day18.model.dao;


import day18.model.dto.MemberDto;

import java.sql.*;

public class MemberDao extends Dao {
    // 1. 필드
        // DB연동 관련 인터페이스 준비물

    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstantce(){return memberDao;}

    // 1. 회원가입
    public int signUp(MemberDto memberDto){
        try {
            // 1. SQL 작성
            String sql = "insert into member(mid,mpw,mphone) values(?,?,?)";
            // 2. SQL 기재
            ps = connection.prepareStatement(sql);
            // ? 매개변수 대입
            ps.setString(1, memberDto.getMid());
            ps.setString(2, memberDto.getMpw());
            ps.setString(3, memberDto.getMphone());

            // 3. SQL 실행 // 4. SQL 결과
            int count = ps.executeUpdate();
            if(count == 1){return 0;}
        } catch (Exception e){
            System.out.println(e);
        }

        return 1;
    }

    public boolean idCheck(String mid){
        try {
            // 1. SQL 작성
            String sql = "select mid from member where mid = ?;";
            // 2. SQL 기재
            ps = connection.prepareStatement(sql);
            ps.setString(1,mid);    // sql문법내 첫번째 ?에 mid 변수 값 대입

            // 3. SQL 실행
            rs = ps.executeQuery(); // 질의/검색 (select) 결과를 rs 인터페이스 대입한다.

            // 4. SQL 결과
            if(rs.next()){  // rs.next() : 검색 결과 테이블에서 다음 레코드 이동 [다음 레코드가 존재하면 true 없으면 false]
                return true;
            }
            // 5. 함수종료;
        } catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

    // 3. 로그인
    public boolean login(MemberDto memberDto){
        try {
            // 1. SQL 작성한다
            String sql = "select * from member where mid = ? and mpw = ?;";
            ps = connection.prepareStatement(sql);

            // 2. SQL 기재한다.
            // ? 매개변수 대입
            ps.setString(1,memberDto.getMid());
            ps.setString(2,memberDto.getMpw());

            // 3. SQL 실행한다.
            rs = ps.executeQuery();

            // 4. SQL 결과처리
            if(rs.next()){
                return true;
            }
        } catch (Exception e){
            System.out.println(e);
        }

        // 5. 함수종료
        return false;
    };

    // 4. 회원번호 찾기
    public int findMno(String mid){
        try {
            // 1. SQL 작성한다.
            String sql = "select mno from member where mid = ?;";

            // 2. SQL 기재한다.
            ps = connection.prepareStatement(sql);
            ps.setString(1,mid);

            // 3. SQL 실행한다.
            rs = ps.executeQuery();

            // 4. SQL 결과처리
            if(rs.next()){
                return rs.getInt("mno");
            }
        } catch (Exception e){
            System.out.println(e);
        }

        // 5. 함수종료
        return 0;
    }
}
