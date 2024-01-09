package day06;  // 패키지 이름

import java.util.Scanner;

public class Step4 {    // class S
    public static void main(String[] args) {    // main S
        
        // 1.
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력(숫자형식으로 입력받기) : ");
        String money = scanner.nextLine();
        String result = "";
            // 입력받은 문자열타입의 금액을 천단위 쉼표 변환
        for(int i=0; i<money.length(); i++){
            //System.out.println(i + " : " + money.charAt(i)+"");
            //System.out.println(money.length()-i);
            if(i>0 && (money.length()-i)%3==0){
                result+=",";
            }
            result += money.charAt(i);
        }
        /*if(money.length() <= 3) {
            result = money;
        } else {

        } else if (money.length()%3 == 0){
            for(int i = 0; i<money.length(); i++){
                result += money.charAt(i);
                if(i%3 == 2 && i != money.length()-1){
                    result += ",";
                }
            }
        } else if (money.length()%3 == 1){
            for(int i = 0; i<money.length(); i++){
                result += money.charAt(i);
                if(i%3 == 0 && i != money.length()-1){
                    result += ",";
                }
            }

        } else if (money.length()%3 == 2){
            for(int i = 0; i<money.length(); i++){
                result += money.charAt(i);
                if(i%3 == 1 && i != money.length()-1){
                    result += ",";
                }
            }
        }*/

        System.out.println("result = " + result);
    }   // main E
}   // class E
