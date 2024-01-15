package 팀과제.팀과제2;

import java.util.ArrayList;
import java.util.Scanner;

public class 팁별과제 {
    static ArrayList<Member> members = new ArrayList<Member>();
    static Member myMember = new Member();

    static ArrayList<Subscribe> ssList = new ArrayList<Subscribe>();
    static Scanner scanner = new Scanner(System.in);
    static void 회원가입(){
        System.out.print("회원 가입할 아이디를 입력하세요 : ");
        String id = scanner.next();

        for(Member i : members){
            if(i.id.equals(id)) {
                System.out.println("중복된 아이디입니다.");
                return;
            }
        }



        System.out.print("회원 가입할 비밀번호를 입력하세요 : ");
        String pw = scanner.next();

        System.out.print("회원 가입할 분의 이름을 입력하세요 : ");
        String name = scanner.next();

        members.add(new Member(name,id,pw));

        for(Member i : members){
                System.out.println(i);
        }

        run = false;
    }

    static boolean run = true;

    static boolean 로그인(){
        System.out.print("아이디를 입력하세요 : ");
        String id = scanner.next();
        System.out.print("비밀번호를 입력하세요 : ");
        String pw = scanner.next();

        for(Member i : members){
            if(i.id.equals(id) && i.id.equals(pw)) {
                System.out.println("로그인 성공");
                myMember = i;
                System.out.println("내 구독 번호 : " + i.ssno);
                return false;
            }
        }
        System.out.println("로그인 실패");
        return true;
    }

    static void 구독정보(){
        for(Subscribe i : ssList){
            if(i == null) {
                System.out.println("구독정보가 없습니다.");
                break;
            };
            if(i.ssno == myMember.ssno){
                System.out.println("구독 번호 : " + i.ssno);
                System.out.println("구독 타입 : " + i.type.type);
                System.out.println("구독한 개월 : " + i.month);
            }
        }
    }

    static void 구독하기(){
        System.out.print("구독개월수 : ");
        int month = scanner.nextInt();
        System.out.print("구독타입입력(1.베이직, 2.프리미엄 1,2만 입력하세요.) : ");
        int type = scanner.nextInt();

        Subscribe subscribe = new Subscribe();
    }

    static void 기간연장(){}
    public static void main(String[] args) {
        while (true){
            System.out.println("------------------------------");
            System.out.println("1. 로그인 2. 회원가입 ");
            String ch = scanner.next();

            if(ch.equals("1")){
                if(로그인()){
                    while (myMember != null){
                        System.out.println("------------------------------");
                        System.out.println("1. 로그아웃 2. 구독정보");
                        String ch2 = scanner.next();

                        if(ch2.equals("1")){
                            myMember = null;
                            break;
                        } else if(ch2.equals("2")){
                            구독정보();

                            System.out.println("------------------------------");
                            System.out.println("1.구독하기 2.기간연장");
                            String ch3 = scanner.next();
                            if(ch3.equals("1")){
                                구독하기();
                            } else if(ch3.equals("2")){
                                기간연장();
                            } else {
                                System.out.println("잘못된 입력입니다.");
                            }
                        } else {
                            System.out.println("잘못된 입력입니다.");
                        }
                    }
                } else {
                    continue;
                };

            } else if(ch.equals("2")) {
                run = true;
                while (run){
                    회원가입();
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}

class Member {
    String name;
    String id;
    String pw;
    int ssno;
    int mno;

    static int mnoIndex = 0;

    Member(){};
    Member(String name, String id, String pw){
        this.name = name;
        this.id = id;
        this.pw = pw;
        mnoIndex++;
        this.mno = mnoIndex;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", ssno=" + ssno +
                ", mno=" + mno +
                '}';
    }
}

class Subscribe {
    int ssno;
    Type type;
    int month;

    static int ssnoIndex = 0;

    Subscribe(){};
    Subscribe(int typeNo, int month){
        this.month = month;
        ssnoIndex++;
        this.ssno = ssnoIndex;
        type = new Type(typeNo);
    }
}
class Type {
    String type;
    int[] members;

    Type(){};
    Type(int x){
      if(x == 1){
          type = "베이직";
          members = new int[1];
      }
      else if(x == 2){
          type = "프리미엄";
          members = new int[4];
      }
    };
}