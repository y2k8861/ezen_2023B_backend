package day09;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
//        Account[] account = new Account[100];
        Account[] account = {new Account("111-111","일승호",15000),new Account("222-222","이승호",30000),new Account("333-333","삼승호",10000)};
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("-------------------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> "); String ch = scanner.nextLine();

            if(ch.equals("1")){
                System.out.println("-------");
                System.out.println("계좌생성");
                System.out.println("-------");

                System.out.print("계좌번호 : "); String accountNumber = scanner.nextLine();
                System.out.print("계좌주 : "); String accountName = scanner.nextLine();
                System.out.print("초기입금액 : "); String accountMoney = scanner.nextLine();

                Account newAccount = new Account(accountNumber,accountName,Integer.parseInt(accountMoney));
                for(int i = 0; i<account.length; i++){
                    if(account[i] == null){
                        account[i] = newAccount;
                        System.out.println("결과 : 계좌가 생성되었습니다.");
                        break;
                    }

                    System.out.println("결과 : 계좌가 생성되지 않았습니다.");
                }

            } else if(ch.equals("2")){
                System.out.println("-------");
                System.out.println("계좌목록");
                System.out.println("-------");



                for(int i = 0; i<account.length; i++){
                    if(account[i] == null) break;
                    System.out.printf("%6s\t%5s\t %d\n",account[i].accountNumber,account[i].accountName,account[i].accountMoney );
                }

            } else if(ch.equals("3")){
                System.out.println("-------");
                System.out.println("예금");
                System.out.println("-------");

                System.out.print("계좌번호 : "); String accountNumber = scanner.nextLine();
                System.out.print("예금액 : "); String accountPlusMonney = scanner.nextLine();
                for(int i = 0; i<account.length; i++){
                    if(account[i].accountNumber.equals(accountNumber)){
                        account[i].accountPlus(accountPlusMonney);
                        break;
                    }
                }



            } else if(ch.equals("4")){
                System.out.println("-------");
                System.out.println("출금");
                System.out.println("-------");

                System.out.print("계좌번호 : "); String accountNumber = scanner.nextLine();
                System.out.print("출금액 : "); String accountMinustMoney = scanner.nextLine();
                for(int i = 0; i<account.length; i++){
                    if(account[i].accountNumber.equals(accountNumber)){
                        account[i].accountMinus(accountMinustMoney);
                        break;
                    }
                }

            } else if(ch.equals("5")){
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("다시 입력해주세요.");
            }
        }
    }
}
