package 팀과제.팀과제1;

import java.util.Scanner;

public class Team1_M {//c s
    public static void main(String[] args) {//m s
        Scanner scanner=new Scanner(System.in);
        String[] 좌석 = new String[3];
        String[] 시 = new String[3];
        String[] 분 = new String[3];
        String 입퇴실="";     String 좌석선택=""; int num = 0;          long totall=0;
        while (true){//w s
            System.out.printf("%s %s %s\n",좌석[0], 좌석[1], 좌석[2]);
            System.out.println("입퇴실을 선택해주세요 :");
            입퇴실=scanner.next();
            System.out.println("입실이면 좌석을\n퇴실이면 전화번호를 입력해주세요 :");
            좌석선택=scanner.next();
            if(좌석선택.equals("좌석1")){num = 0;}
            if(좌석선택.equals("좌석2")){num = 1;}
            if(좌석선택.equals("좌석3")){num = 2;}

            if(입퇴실.equals("입실")){//입실
                if(좌석[num] == null){
                    System.out.println("전화번호를 입력해주세요.");
                    좌석[num] = scanner.next();
                    System.out.println("현재 시를 입력해주세요");
                    시[num]= scanner.next();
                    System.out.println("현재 분을 입력해주세요");
                    분[num]= scanner.next();
                } else {
                    System.out.println("입실 불가");
                }
            } else if(입퇴실.equals("퇴실")){
                Integer time=Integer.parseInt(시[num])*60+Integer.parseInt(분[num]);
                System.out.println("현재 시를 입력해주세요");
                시[num]= scanner.next();
                System.out.println("현재 분을 입력해주세요");
                분[num] = scanner.next();
                Integer time2=Integer.parseInt(시[num])*60+Integer.parseInt(분[num]);
                if(time2>=time){
                    int total=time2-time;
                    totall+=total;
                    System.out.printf("총 사용 시간은 %d시간 %d분\n", total/60, total%60);
                    System.out.println("퇴실 되었습니다.");
                    좌석[num]=null;
                    시[num] = null;
                    분[num] = null;
                } else {
                    System.out.println("퇴실시간은 입실시간보다 빠를 수 없습니다.");
                }
            }

            System.out.println("총사용 누적 시간은: "+totall);
        }//w e
    }//m e
}//c e