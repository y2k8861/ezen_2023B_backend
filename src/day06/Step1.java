package day06;  // 패키지 이름

public class Step1 {    // class S
    public static void main(String[] args) { // main S
        
        // [p.149] : null
            // - 아직 참조(번지)를 저장하고 있지 않다는 뜻
        int[] intArray = null;
            // 스택영역 생성 : 'intArray' 변수 선언
        // intArray[0] = 10;   // . NullPointerException
            // 배열변수(스택영역)은 있지만. 배열객체(힙영역)은 없는 상태
        
        String[] str = null;
            // 스택영역에 변수 생성 : 'str'
        // System.out.println("str.length = " + str.length); // . NullPointerException
            // 문자열변수(스택영역)는 있지만. 문자열객체(힙영역)가 실제로 존재하지 않음.
        // [p.151]
        // GC : 쓰레기 수집기
            // - 자바는 객체(힙영역)를 직접 제거하는 방법을 제공하지 않는다.!
                // - 그 객체의 모든 참조를 없애는 방법 , null
        String hobby = "여행";
            // String hobby : 스택영역에 생성된 변수
            // "여행" : 힙영역에 생성된 문자열객체 [102번지 (16)18]
                // = 대입 120번지를 hobby변수에 대입
                // !! : hobby변수에는 "여행" 문자열을 가지고 있지 않다.
        hobby = null;
            // hobby변수가 null을 가짐
            // "여행" 객체는 현재 아무것도 참조하지 않기 떄문에 잠시후 자동으로 힙영역 삭제
        String kind1 = "자동차";
        // String kind1 : 스택영역      "자동차"[103번지]
        String kind2 = kind1;
        // String kind2 : 스영역       kind[103번지]
        kind1 = null;
            // "자동차: 객체는 사라지지 않는다. kind2 변수가 참조중이므로,
        System.out.println("kind2 = " + kind2);
        
    /*
        // ============== 배열 복슴 ============== //
        배열(객체) : 연속된 공간에 값을 나열시키고 각 값에 인덱스 부여
        
            1. 배열의 선언
                String[] array1 = {"유재석", "강호동"};
                String[] array2 = new String[2];

            2. 배열의 항목/요소 호출
               array2[1]

            3. 항목/요소 값 수정/변경
                array2[인덱스] = 새로운 값

            4. 항목/요소 삭제 : 없음[자바는 힙영역을 제거하는 방법을 제공하지 않는다. GC]
                - 배열의 크기는 줄이거나 늘릴수 없다. -> 방법 : 1.직접함수만들기[협업X], 2.라이브러리(컬렉션프레임워크)
        5. 배열의 구조
            1. 스택은 배열의 0번 인덱스 주소를 참조한다. [어차피 나열했기 떄문에 순서대로 메모리 할당]
                - 인덱스 마다 주소값
                - {"유재석","강호동"}; : 102번지 103번지

                String[] array1 = {"유재석","강호동"}

        스택영역                            힙영역
            String[] array1                 1. 배열객체 = {103번지,104번지};    100번지

                                            2. 문자열(유재석) 객체 =            103번지
                                            3. 문자열(강호동) 객체 =            104번지
        ----------------------------------------------------------
            String[] array2 = new String[2];
        스택영역                            힙영역
            String[] array2                 1. 배열객체 = {null, null}        201번지
                                            2. 베열객체 = {204번지,null}       201번지

            1. 배열내 특정 항목 대입
                array2[0] = "유재석"
                                            1.문자열(유재석)객체 =              204번지


        
    */
        // 1. 
        String[] array1 = {"유재석", "강호동"};
        String[] array2 = new String[2];
        // 2.
        System.out.println("array2 = " + array2);
        System.out.println("array2[1] = " + array2[1]);
        
    }   // main E
    // 함수종료 => 지역번수들 => 지역변수 사라짐 => 지역변수가 참조한 입영역 사라짐
    // - main() 함수는 자바 진입/시작접 --> main 함수 끝나면 힙영역도 모두 사라짐.

    
}   // class E
