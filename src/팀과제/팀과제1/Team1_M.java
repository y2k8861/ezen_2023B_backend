package 팀과제.팀과제1;

import java.util.Scanner;

public class Team1_M {//c s
    public static void main(String[] args) {//m s
        Scanner scanner=new Scanner(System.in);
        String 좌석1 = "빈자리1";      String 좌석2= "빈자리2";       String 좌석3="빈자리3";
        String 좌석1시 = "";      String 좌석2시 = "";      String 좌석3시 = "";
        String 좌석1분 = "";      String 좌석2분 = "";      String 좌석3분 = "";
        String 입퇴실="";     String 좌석선택="";          long totall=0;
        while (true){//w s
            System.out.printf("%s %s %s\n",좌석1, 좌석2, 좌석3);
            System.out.println("입퇴실을 선택해주세요 :");
            입퇴실=scanner.next();
            System.out.println("입실이면 좌석을\n퇴실이면 전화번호를 입력해주세요 :");
            좌석선택=scanner.next();

            //===========좌석1==========
            if(입퇴실.equals("입실")&&좌석선택.equals("좌석1")){//입실
                if(좌석1.equals("빈자리1")){
                    System.out.println("전화번호를 입력해주세요.");
                    좌석1 = scanner.next();
                    System.out.println("현재 시를 입력해주세요");
                    좌석1시= scanner.next();
                    System.out.println("현재 분을 입력해주세요");
                    좌석1분= scanner.next();
                    System.out.println("입실 완료");
                }else {
                    System.out.println("입실 불가");
                }
            } else if (입퇴실.equals("퇴실")&&좌석선택.equals(좌석1)) {//퇴실
                Integer time=Integer.parseInt(좌석1시)*60+Integer.parseInt(좌석1분);
                System.out.println("현재 시를 입력해주세요");
                좌석1시= scanner.next();
                System.out.println("현재 분을 입력해주세요");
                좌석1분= scanner.next();
                Integer time2=Integer.parseInt(좌석1시)*60+Integer.parseInt(좌석1분);
                if(time2>=time){
                    int total=time2-time;
                    totall+=total;
                    System.out.printf("총 사용 시간은 %d시간 %d분\n", total/60, total%60);
                    System.out.println("퇴실 되었습니다.");
                    좌석1="빈자리1";
                } else {
                    System.out.println("퇴실시간은 입실시간보다 빠를 수 없습니다.");
                }
            }

            //===========좌석2==========
            if(입퇴실.equals("입실")&&좌석선택.equals("좌석2")){//입실
                if(좌석2.equals("빈자리2")){
                    System.out.println("전화번호를 입력해주세요.");
                    좌석2 = scanner.next();
                    System.out.println("현재 시를 입력해주세요");
                    좌석2시= scanner.next();
                    System.out.println("현재 분을 입력해주세요");
                    좌석2분= scanner.next();
                    System.out.println("입실 완료");
                }else {
                    System.out.println("입실 불가");
                }
            } else if (입퇴실.equals("퇴실")&&좌석선택.equals(좌석2)) {//퇴실
                Integer time=Integer.parseInt(좌석2시)*60+Integer.parseInt(좌석2분);
                System.out.println("현재 시를 입력해주세요");
                좌석2시= scanner.next();
                System.out.println("현재 분을 입력해주세요");
                좌석2분= scanner.next();
                Integer time2=Integer.parseInt(좌석2시)*60+Integer.parseInt(좌석2분);
                if(time2>=time){
                    int total=time2-time;
                    totall+=total;
                    System.out.printf("총 사용 시간은 %d시간 %d분\n", total/60, total%60);
                    System.out.println("퇴실 되었습니다.");
                    좌석2="빈자리2";
                } else {
                    System.out.println("퇴실시간은 입실시간보다 빠를 수 없습니다.");
                }
            }


            //===========좌석3==========
            if(입퇴실.equals("입실")&&좌석선택.equals("좌석3")){//입실
                if(좌석3.equals("빈자리3")){
                    System.out.println("전화번호를 입력해주세요.");
                    좌석3 = scanner.next();
                    System.out.println("현재 시를 입력해주세요");
                    좌석3시= scanner.next();
                    System.out.println("현재 분을 입력해주세요");
                    좌석3분= scanner.next();
                    System.out.println("입실 완료");
                }else {
                    System.out.println("입실 불가");
                }
            } else if (입퇴실.equals("퇴실")&&좌석선택.equals(좌석3)) {//퇴실
                Integer time=Integer.parseInt(좌석3시)*60+Integer.parseInt(좌석3분);
                System.out.println("현재 시를 입력해주세요");
                좌석3시= scanner.next();
                System.out.println("현재 분을 입력해주세요");
                좌석3분= scanner.next();
                Integer time2=Integer.parseInt(좌석3시)*60+Integer.parseInt(좌석3분);
                if(time2>=time){
                    int total=time2-time;
                    totall+=total;
                    System.out.printf("총 사용 시간은 %d시간 %d분\n", total/60, total%60);
                    System.out.println("퇴실 되었습니다.");
                    좌석3="빈자리3";
                } else {
                    System.out.println("퇴실시간은 입실시간보다 빠를 수 없습니다.");
                }
            }
            System.out.println("총사용 누적 시간은: "+totall);
        }//w e
    }//m e
}//c e