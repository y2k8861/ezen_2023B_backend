package day21;

public class InsufficientException extends Exception {  //extends 상속 키워드
    // 예외클래스 만들기
    // 1. Exception 클래스로 부터 상속받는다.
    // 2. Exception 클래스로 부터
    public InsufficientException(String massage){
        super(massage);    // super : 상위 객체 vs this : 본인객체
        /*
                        super       vs          this
            필드          X                       this.필드명
            생성자       super()                   X
            메소드       super.메소드명()           X
        */
    }
}
