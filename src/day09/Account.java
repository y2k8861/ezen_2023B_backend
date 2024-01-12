package day09;

public class Account {

    // 클레스 맴버
    // 1. 필드
    String accountNumber;
    String accountName;
    int accountMoney;

    // 2. 생성자
    Account(){};
    Account(String accountNumber, String accountName, int accountMoney){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountMoney = accountMoney;
    }

    // 3. 메소드
    void accountPlus(String accountPlusMoney){
        this.accountMoney += Integer.parseInt(accountPlusMoney);
        System.out.println("결과 : 예금이 성공했습니다. 예금 후 금액 -> " + this.accountMoney);
    }

    void accountMinus(String accountMinustMoney){
        if(this.accountMoney < Integer.parseInt(accountMinustMoney)){
            System.out.println("출금할 수 없는 금액입니다.");
            return;
        }
        this.accountMoney -= Integer.parseInt(accountMinustMoney);
        System.out.println("결과 : 출금이 성공했습니다. 출금 후 금액 -> " + this.accountMoney);

    }
}
