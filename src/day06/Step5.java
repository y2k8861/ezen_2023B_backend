package day06;  // 패키지 이름

import java.sql.SQLOutput;
import java.util.Scanner;

public class Step5 {    // class S
    public static void main(String[] args) {    // main S
        Scanner scanner = new Scanner(System.in);
        System.out.print("시간(hhmmss형식) : ");
        String time = scanner.nextLine();

        System.out.print("시간(숫자) : ");
        String second = scanner.nextLine();

        String result = "";
        // 입력받은 time에서 second 만큼 지난 시간을 hhmmss 형식으로 출력
        int ss = Integer.parseInt(time.substring(4));
        ss += Integer.parseInt(second);

        int mm = Integer.parseInt(time.substring(2,4));
        mm += (ss/60);

        int hh = Integer.parseInt(time.substring(0,2));
        hh += (mm/60);

        System.out.printf("%02d:%02d:%02d\n", hh,mm%60,ss%60);

        /*int hour = Integer.parseInt(time.substring(0,2)) * 3600;
        int min = Integer.parseInt(time.substring(2,4)) *60;
        int sec = Integer.parseInt(time.substring(4));
        int timeValue = hour + min + sec + Integer.parseInt(second);
        result +=  (timeValue/3600< 10 ? "0"+timeValue/3600: timeValue/3600) + ":" + ((timeValue%3600)/60 < 10 ? "0"+(timeValue%3600)/60 : (timeValue%3600)/60) + ":" + ((timeValue%3600)%60 < 10 ? "0"+(timeValue%3600)%60 : (timeValue%3600)%60);
        System.out.println("result = " + result);*/
        /*
            예]
                time = 145930
                second = 70
                    result = 15:00:40
        */
    }   // main E
}   // class E
