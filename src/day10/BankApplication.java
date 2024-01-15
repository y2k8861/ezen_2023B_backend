package day10;

import java.util.Scanner;

public class BankApplication {
    // 클래스 멤버
    // 1 필드
    static Account[] accounts = new Account[100];

    static Scanner scanner = new Scanner(System.in);
        // main() 함수 아닌 main()밖에 정적필드로 선언허는 이유 : 여럿 함수에서 사용할려고

    // 2. 생성자

    // 3. 메소드
    static void 계좌생성(){ // 2. 계좌생성
        System.out.println("계좌생성");
        // * Account 객체 만들어서 배열에 저장
        // 1. 입력받기
        System.out.println("계좌번호 : "); String 계좌번호 = scanner.next();
        System.out.println("계좌주 : "); String 계좌주 = scanner.next();
        System.out.println("초기입금액 : "); int 초기입금액 = scanner.nextInt();

        // 2. 객체 생성
            // 1. 풀생성자 사용했을떄
        Account account = new Account(계좌번호,계좌주,초기입금액);

        // 3. 객체를 배열에 넣는다.
            // 정적메소드에서는 인스턴스 필드를 호출 할 수 없다.
                // 1. 인스턴스필드를 static 한다.
        for(int i = 0; i<accounts.length; i++){
            if(accounts[i] == null){
                accounts[i] = account;
                break;
            }
        }
    }

    static void 계좌확인(){ // 3. 계좌확인
        System.out.println("계좌확인");

        // * 배열내 반복문을 이용한 모든 계좌를 호출
        for(int i= 0; i<accounts.length; i++){
            Account account = accounts[i];
            if(account == null) break;
            System.out.printf("%10s \t %5s \t %10d\n" ,account.계좌번호, account.계좌주, account.입금액);
        }
    }

    static void 예금(){ // 4. 예금
        System.out.println("예금");
        // * 입력받은 계좌번호가 계좌목록에 존재하면 입력한 예금액을 찾은 계좌객체에서 예금에 더한다.
        System.out.print("예금] 계좌번호 : "); String 계좌번호 = scanner.next();
        System.out.print("예금] 예금액 : "); int 예금액 = scanner.nextInt();
        // 2. 계좌목록/배열에서 입력한 계좌찾는다.
        for(int i = 0; i< accounts.length; i++){
            Account account = accounts[i];
            if(account == null)break;
            if(account.계좌번호.equals(계좌번호)){
                account.입금액 += 예금액;
                break;
            }
        }
    }

    static void 출금(){   // 5. 출금
        System.out.println("출금");

        System.out.println("예금");
        // * 입력받은 계좌번호가 계좌목록에 존재하면 입력한 예금액을 찾은 계좌객체에서 예금에 더한다.
        System.out.print("예금] 계좌번호 : "); String 계좌번호 = scanner.next();
        System.out.print("예금] 출금액 : "); int 출금액 = scanner.nextInt();
        // 2. 계좌목록/배열에서 입력한 계좌찾는다.
        for(int i = 0; i< accounts.length; i++){
            Account account = accounts[i];
            if(account == null)break;
            if(account.계좌번호.equals(계좌번호)){
                account.입금액 -= 출금액;
                break;
            }
        }
    }

    public static void main(String[] args) {    //1. 실행시
        while (true){
            System.out.println("-------------------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> "); int ch = scanner.nextInt();

            if(ch == 1){
                계좌생성();
            }
            else if (ch == 2){
                계좌확인();
            }
            else if (ch == 3){
                예금();
            }
            else if (ch == 4){
                출금();
            }
            else if (ch == 5){}
            else {}
        }
    }
}
