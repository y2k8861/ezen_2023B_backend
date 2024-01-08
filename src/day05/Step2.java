package day05;  // 패키지 이름

public class Step2 {    // class S
    public static void main(String[] args) {    // main S
        
        // p.165 : 배열(array) 타입
            /*
                - 변수는 하나의 값만 저장.
                1. 배열 : 연속된 공간에 값을 나열하고 각 값에 인덱스 부여.
                    - 인덱스 : 각 항복(요소)의 값을 호출하거나 저장하는데 사용됨.
                        0 부터 시작
                2. 특징
                    1. 배열은 같은 타입의 값만 저장
                        int =[57,"가"] 불가능.
                    2. 배열의 길이는 선언된 이후 늘리거나 줄일 수 없다.
                        int = [57,62,97] : 항목/요소를 추가/삭제 할 수 없다.
                        - 새로운 배열을 다시 만들고 기존배열을 복사해서 새로운 값 대입.

                3. 선언
                    - 변수선언 : int 변수명;
                    - 배열선언 : int[] 변수명; or int 변수명[];

                4. 값 목록으로 배열 선언
                    - 배열생성1 : 타입[] 변수명 = {값0,값1,값2,값3};
                    - 배열생성2 : 타입[] 변수명 = new 타입[길이];
                        - 배열에 넣을 초기값을 모르고 배열의 길이(최대 저장 개수) 알고 있을때 사용.
                        - 초기값 : 정수 0, 실수 0.0, 논리 false, 클래스(String)/인터페이스 null

                5. 배열의 길이를 구하는 속성명
                    - 배열명.length        : 현재 배열의 길이를 알려준다.

                6. 배열 항목/요소 값 넣기.
                    - 배열명[인덱스] = 새로운 값;

                7. 배열 항목/요소 값 호출.
                    - 배열명[인덱스];

                8. 배열 항목/요소 값 수정.
                    - 배열명[인덱스] = 새로운 값;

                9. 배열 항목/요소 값 삭제 [항목.요소 위치 삭제는 없고 처음값으로 초기화]
                     - 배열명[인덱스] = 각 타입의 초기값

            */

        // 1. 배열 생성/선언 : 여러개 문자열을 저장하는 배열 선언.
                // 배열이 없다면. vs 배열 있다면
        String[] seanson = {"Spring", "Summer", "Fall", "Winter"};
        // 타입[] 변수명 = {값0,값1,값2,값3}
        //          인덱스 0   1   2   3

        // 2. 배열의 각 요소/값 호출
        System.out.println("seanson = " + seanson);
        // 기본타입(7가지 + String) 말고 참조타입 호출시 주소값이 나오는구나.

        // 1. 일반 호출
        System.out.println("seanson[0] = " + seanson[0]);       // 배열내 0번째 인덱스 요소의 값 호출
        System.out.println("seanson[1] = " + seanson[1]);       // 배열내 1번째 인덱스 요소의 값 호출
        System.out.println("seanson[2] = " + seanson[2]);       // 배열내 2번째 인덱스 요소의 값 호출
        System.out.println("seanson[3] = " + seanson[3]);       // 배열내 3번째 인덱스 요소의 값 호출
        // System.out.println("seanson[4] = " + seanson[4]);       // 배열내 4번째 인덱스 요소의 값 없으므로 호출 불가능
        // .ArrayIndexOutOfBoundsException : 인덱스 오류.

        // 2. for 반복문을 이용한 호출
        for(int i = 0; i<seanson.length; i++){
            // i는 0부터 마지막 인덱스까지 1씩증가.
            System.out.println("seanson["+i+"] = " + seanson[i]);       // 배열내 i번째 인덱스 호출
        }

        // 3.각 요소/항목의 값 수정
        seanson[1] = "여름";
        System.out.println("seanson[1] = " + seanson[1]);       // 배열내 1번째 인덱스 호출
        
        // - int 형 여러개 데이터를 저장하는 배열 선언
        int[] scores = {83,90,87};
        
        int sum = 0;
        for (int i = 0; i< scores.length; i++){
            // i는 0부터 3미만 까지 1씩 증가
            sum += scores[i];   // i번째 인덱스 항목의 값을 sum변수에 더한다.
        }

        System.out.println("sum = " + sum);
        double avg = (double) sum/3;
        System.out.println("avg = " + avg);
        
        // [p.173] new 연산자를 이용한 배열 선언.
        // 1. int 3개를 저장할 수 있는 배열 선언
            // new 연산자 사용시 초기값!!! 정수:0 실수:0.0 논리:false 클래스:null
        int[] arr1 = new int[3];    // 타입[] 변수명 = new 타입[길이];
        // 2. for 이용한 배열내 모든 요소 호출
        for(int i = 0; i<3; i++){
            System.out.printf("arr1[%d] : %d , " ,i , arr1[i]);
        }
        System.out.println("");
        // 3. 요소의 값 대입
        arr1[0] = 10; arr1[1] = 20; arr1[2] = 30;
        for(int i = 0; i<3; i++){
            System.out.printf("arr1[%d] : %d , " ,i , arr1[i]);
        }
        System.out.println("");

        // 1. double형 3개를 저장할 수 있는 배열 선언
        double[] arr2 = new double[3];
        for(int i = 0; i<3; i++){
            System.out.printf("arr2[%1d] : %2f , " ,i , arr2[i]);
        }

        arr2[0] = 0.1; arr2[1] = 0.2; arr2[2] = 0.3;
        System.out.println("");
        for(int i = 0; i<3; i++){
            System.out.printf("arr2[%1d] : %2f , " ,i , arr2[i]);
        }
        System.out.println("");

        String[] arr3 = new String[3];
        for(int i = 0; i<3; i++){
            System.out.printf("arr3[%1d] : %s , " ,i , arr3[i]);
        }
        System.out.println("");
        arr3[0] = "1월"; arr3[1] = "1월"; arr3[2] = "1월";
        for (int i = 0; i < 3; i++) {
            System.out.printf("arr3[%1d] : %s , ", i, arr3[i]);
        }
        System.out.println("");


        
    }   // main E
} // class E
