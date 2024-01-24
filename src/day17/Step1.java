package day17;

import java.sql.Connection;
import java.sql.DriverManager;

public class Step1 {    // class S
    public static void main(String[] args) {    // main S

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e ){
            System.out.println("[시스템 오류] : JDBC 드라이버를 찾지 못했습니다." + e);
        }

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test5",
                    "root",
                    "1234"
            );
            System.out.println("[시스템 정보] : DB서버와 연동이 성공했습니다.");
        } catch (java.sql.SQLException e){
            System.out.println("[시스템 오류] : MYSQL서버와 연동이 실패했습니다." + e);
        }


    }   // main E
}   // class E

/*
    예외/오류처리 : 1.일반예외 2.실행예외
        - 예외/오류가 발생했을때 대처 하기위해.
        1. 일반예외 : 컴파일시 예외 체크 = 컴파일시 예외/오류 발생
            - 자바 외부와 통신하는 클래스들(키보드,DB,파일처리)
            - 1. Scanner 클래스
            - 2. DAO (Date Access Object) : 주로 DB연동/조작 객체

        2. 실행예외 : 실행중에 예외 체크 = 실행중에 예외/오류 발생
            - 미리 대처하기 힘듬 - 미리 예외/오류 알고 있는 상태 = 경험에 대한 대처
            1. NullPointerException

    예외/오류 처리
        - 만약에 예외가 발생할 것 같은 코드에 처리
        - 문법
            try {} catch(예외클래스명 변수){}
*/


// 1. Class.forName() : 현재 프로젝트내 클래스 찾고 메모리로 로딩한다.
    // 1. MYSQL 회사 driver 클래스를 찾기 : com폴더 내 mysql폴더 내 cj폴더 내 jdbc폴더 내 Driver 클래스 존재
    // 2. 해당 폴더내 driver클래스를 찾는 과정에서 오류가 발생할 수도 있다.
        // - ClassNotFoundException : 클래스를 찾지 못했다는 뜻.
        // 예외

    // 2. Connection : DB연동 인터페이스
// 인터페이스 타입으로 변수선언
// Connection connection;
// 인터페이스는 스스로 객체를 만들 수 없다.[추상]
// !!! : 구현체(구현객체 - 구현클래스(implements)로 생성된 객체)
// DriverManager.getConnection("DB서버주소/DB명", "계정명","비밀번호")

