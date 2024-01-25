package day18.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
    protected Connection connection;  // 1. DB연동객체 , PreparedStatement 객체 생성
    protected PreparedStatement ps;    // 2. 작성된 SQL 가지고 있고, 실행 담당.
    protected ResultSet rs;    // 3. sql 실행 결과

    protected Dao(){
        try {
            // 1. MYSQL 회사의 JDBC관련된 (DRIBER)객체를 JVM에 로딩한다. 불러오기
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 연동된 결과의 (구현채)객체를 Connerction 인터페스에 대압한다.
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java",
                    "root","1234"
            );
            System.out.println("DB연동 성공");
        } catch (Exception e ){
            System.out.println("DB연동 실패>"+e);
        }
    }
}
