package day08;

import java.util.Scanner;

public class Step4 {    // class S
    public static void main(String[] args) {    // main S
        Phone[] phoneBook = new Phone[100];
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("============= 전화번호부 =============");
            System.out.printf("%-5s\t%-8s\t%-13s\n","순번","이름","전화번호");
            for(int i = 0; i<phoneBook.length; i++){
                if(phoneBook[i] == null){break;}
                System.out.printf("%-5s\t%-8s\t%-13s\n",i+1,phoneBook[i].name,phoneBook[i].number);
            }
            System.out.println("\n1.전화번호등록 2.전화번호삭제");
            int ch = scanner.nextInt();scanner.nextLine();

            if(ch==1){
                // 1. 입력받기
                System.out.print("이름> "); String name = scanner.nextLine();
                System.out.print("전화번호> "); String number = scanner.nextLine();
                // 2. 객체 생성한다.  [생성자 선택]
                    // 필드는 객체가 없으면 사용 불가능. [클래스는 설계도]
                    // 객체 생성할때 필드에 값을 넣을꺼야 말꺼야
                Phone newPhone = new Phone(name,number);
                // 3. phoneBook 배열내 빈공간을 찾아서 해당 인덱스에 객체 넣기
                for(int i =0; i<phoneBook.length; i++){
                    if(phoneBook[i] == null){
                        phoneBook[i] = newPhone;
                        break;  // !!! : 빈공간을 찾아서 대입은 1번만 대입했으면 반복 종료
                    }
                }
            } else if (ch==2){
                System.out.print("삭제할 순번>"); int dNo = scanner.nextInt();scanner.nextLine();
                phoneBook[dNo-1] = null;
                for(int i = dNo-1; i< phoneBook.length; i++){
                    if(i == phoneBook.length-1)break;
                    phoneBook[i] = phoneBook[i+1];
                }
            }
        }
    }   // main E
}   // class E

/*
    메모리 구성
        이름과 전화번호를 여러개 저장.
        예] '유재석''01012341234'   '강호동''010-4567-4567'

        1. 변수 : 여러개 변수를 만들어서 여러명 관리 [만일 100명 비효율]

        2. 배열 : 동일한 타입의 자료형을 순서(인덱스)대로 나열
            - 데이터 대신 인덱스 식별하기 때문에 구분 비효율

        3. 문자열 : 모든데이터를 문자형식으로 해서 하나의 문자열 저장
            // - 구분좌 : csv파일 다룰때 자주 사용

        4. 객체 : 클래스[미리 틀 잡기]/설계 기반으로 생성된 메모리 - 자료형 만들기
            - 필드를 이용한 데이터 구분
            - 생성자를 이용한 초기화 할 수 있다.
            - 메소드를 이용한 행위/이벤트 할 수 있다.

            1. 틀 만들기 [클래스 만들기]
            class Phone {?: 전화번호 1개 설계해서 -> new 여러번 -> 전화번호 여러개 -> 배열저장
                멤버 : 필드(객체 데이터를 저장하는 공간), 생성자, 메소드
            }

            2. 틀 기준으로 메모리 생성[객체 만들기]
            new Phone

*/

/*
       [1.조건]
        - 하나의 클래스(Phone)를 설계해서 여러개의 객체 생성하고 관리하시오.
        - 설계한 클래스(Phone)를 이용하여 배열(phoneBook)을 하나만 선언합니다. 단 배열에 최대 100개의 객체만 저장할수 있습니다.
        Phone[] phoneBook = new Phone[100];

    [2.기능구현]
        1.전화번호 등록
            - 이름 과 전화번호 를 입력받아 객체 생성후 배열에 순서대로 저장.
        2.전화번호 삭제
            - 출력된 전화번호 목록을 보고 순번을 입력받아 해당 순번의 전화번호 삭제
            - 삭제된 객체 뒤 로 객체가 있을경우 한칸씩 앞으로 이동하시오.
                예)
                    0(객체A) 1(객체B) 2(객체C) 3(객체D)  null
                        만일 2번 인덱스의 객체 삭제시
                    0(객체A) 1(객체B) 3(객체D)  null    null
        3.전화번호 출력
            - String 전화번호부 에 저장된 데이터를 아래 그림과 같이 출력
            - 단 배열 항목/요소내 객체가 없을경우에만 출력하지 마시오.

    [3.실행화면]
        ============= 전화번호부 =============
        순번     이름      전화번호
        1       김현수     010-3913-2072
        2       유재석     010-1234-1234
        3       강호동     010-7777-7777

        1.전화번호등록 2.전화번호삭제
        선택>

*/

