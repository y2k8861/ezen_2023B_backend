package day10;

public class Account {
    // 클레스멤버
    // 1. 필드
    String 계좌번호;
    String 계좌주;
    int 입금액;

    // 2. 생성자
    Account(){};
    Account(String 계좌번호, String 계좌주, int 입금액){
        this.계좌번호 = 계좌번호;
        this.계좌주 = 계좌주;
        this.입금액 = 입금액;
    }

    // 3. 메소드
        // 1. 내 계좌의 입금액 반환.
    int get입금액(){
        return this.입금액;
    }
}
