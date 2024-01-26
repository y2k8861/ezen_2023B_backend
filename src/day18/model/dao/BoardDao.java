package day18.model.dao;

import day18.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardDao extends Dao {
    private BoardDao(){}
    private static BoardDao boardDao = new BoardDao();
    public static BoardDao getInstantce(){return boardDao;};

    public ArrayList<BoardDto> boardView(){
        ArrayList<BoardDto> result = new ArrayList<>(); // 5. 객체 담을 배열 생성
        try {
            String sql = "select * from board order by bno;";   // 6. bno순서대로 전체를 가져왔다.
            rs = conn.prepareStatement(sql).executeQuery();     // 7. (6)실행 후 결과값 rs저장
            while (rs.next()) { // 8. rs.next() -> 데이터베이스 테이블에서 한칸이동후 값이 있으면 true 없으면 false
                // true 일때
                BoardDto boardDto = new BoardDto();
                boardDto.setCno(rs.getInt("cno"));  // cno 가져와 객체에 넣어준다.
                boardDto.setMno(rs.getInt("mno"));  // mno 가져와 객체에 넣어준다.
                boardDto.setBno(rs.getInt("bno"));  // bno 가져와 객체에 넣어준다.
                boardDto.setBtitle(rs.getString("btitle")); // btitle 가져와 객체에 넣어준다.
                boardDto.setBdate(rs.getString("bdate"));   // bdate 가져와 객체에 넣어준다.
                boardDto.setBview(rs.getLong("bview")); // bview 가져와 객체에 넣어준다.
                result.add(boardDto); // 9.필요한 자료를 넣은 객체를 배열에 넣어준다.
            }   // false(다음께 없으면) 종료
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;  // 10.객체를 담음 배열 리턴;
    };

    public String findId(int num){ //가져온 cno를 기준으로 멤버 테이블에서 다시
        try {
            //1.sql작성
            String sql = "select mid from member where mno = ?;";
            //2.sql 기재
            ps = conn.prepareStatement(sql);
            //2-1 매개변수 대입
            ps.setInt(1, num);
            //3.sql 실행 //4.sql 결과
            rs = ps.executeQuery();
            if(rs.next()){ //검색결과 테이블에서 다음레코드 이동 존재하면 true 없으면 false
                return rs.getString("mid");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public String findCategory(int num){
        try {
            //1.sql작성
            String sql = "select cname from category where cno = ?;";
            //2.sql 기재
            ps = conn.prepareStatement(sql);
            //2-1 매개변수 대입
            ps.setInt(1, num);
            //3.sql 실행 //4.sql 결과
            rs = ps.executeQuery();
            if(rs.next()){ //검색결과 테이블에서 다음레코드 이동 존재하면 true 없으면 false
                return rs.getString("cname");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
