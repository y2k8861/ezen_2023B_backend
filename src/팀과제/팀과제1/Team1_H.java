package 팀과제.팀과제1;

import java.util.Scanner;

public class Team1_H {//class s

    public static void main(String[] args) {//main s

        Scanner scanner = new Scanner(System.in);

        String[] 좌석 = new String[3];
        String[] 시 = new String[3];
        String[] 분 = new String[3];
        boolean run = true;
        int total = 0;

        while (run){//w s
            System.out.println("-----------------------------------");
            System.out.println("좌석1 = ["+좌석[0]+"] | 좌석2 = ["+좌석[1]+"] | 좌석3 = ["+좌석[2]+"]");
            System.out.println("-----------------------------------");

            System.out.println("입실 혹은 퇴실 혹은 계산을 입력해주세요");
            String io = scanner.next();

            if(io.equals("입실")) {

                System.out.print("좌석을 선택해 주세요 : ");
                int num = scanner.nextInt() - 1;
                if(좌석[num] == null){
                    System.out.print("전화번호를 입력해주세요");
                    String ph1 = scanner.next();

                    System.out.print("입실 시를 입력해주세요");
                    String t1 = scanner.next();

                    System.out.print("입실 분을 입력해주세요");
                    String m1 = scanner.next();

                    좌석[num] = ph1;
                    시[num] = t1;
                    분[num] = m1;
                } else {
                    System.out.println("입실불가");
                }
            } else if (io.equals("퇴실")) {//if 퇴실 s
                System.out.print("좌석을 선택해 주세요 : ");
                int num = scanner.nextInt() - 1;
                if(좌석[num] == null){
                    System.out.println("입실이 없습니다.");
                } else {
                    System.out.print("퇴실 시를 입력해주세요");
                    int oT1 = scanner.nextInt();

                    System.out.print("퇴실 분을 입력해주세요");
                    int oM1 = scanner.nextInt();

                    int iT1 = Integer.parseInt(시[num]);
                    int iM1 = Integer.parseInt(분[num]);
                    int 총이용시간 = ((oT1-iT1)*60)+(oM1-iM1);
                    System.out.println("총이용시간은 "+총이용시간+"분 입니다.");

                    total+=총이용시간;

                    좌석[num]= null;
                    시[num]=null;
                    분[num]=null;
                }
            }//if 퇴실 s
            else if (io.equals("계산")) {
                System.out.println("총 이용시간은 "+total);
                break;
            }

        }//w e

    }//main e
}//class e
