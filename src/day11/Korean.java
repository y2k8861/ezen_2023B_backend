package day11;

public class Korean {   // class S
    // 멤버
    // 1. (정적static/인스턴스)필드
        // 1. 인스턴스 final 필드
        // - final : 프로그램 실행 도중에 수정 할 수 없게 만듬.
        // 1. 필드 선언시 초기값대입 // 2.생성자에서 초기값 대입
    final String nation = "대한민국";

        // 2. 인스턴스 필드
    String ssn;

    String name;

        // 3. 상수 필드 : 불변의 값
            // - static final;
            // 1. 상수명은 관례적으로 대문자 // 2. 상수선언시 초기값 대입 // 3. 정적블록 초기값 대입
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;
    static {
        EARTH_SURFACE_AREA = 4*Math.PI * EARTH_RADIUS*EARTH_RADIUS;
    }

    // 2. 생성자
    public Korean(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }

    // 3. (정적static/인스턴스)메소드
}   // class E
