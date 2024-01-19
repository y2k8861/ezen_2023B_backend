package day13;

public class Step1 {    // class S
    public static void main(String[] args) {    // main S

        // [p.286~287]
            // 1. SmartPhone 객체 (+ Phone)
        SmartPhone myPhone = new SmartPhone("갤럭시","은색");

            // 2. myPhone 객체네 필드 호출
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);

            // 3. SmartPhone 객체내 필드호출
        System.out.println("와이파이 상태 : " + myPhone.wife);

            // 4.
        myPhone.bell(); // smartPhine 객체네 메소드 호출( + phone 메소드 호출)
        myPhone.sendVoice("여보세요."); // smartPhine 객체네 메소드 호출( + phone 메소드 호출)
        myPhone.receiveVoice("안녕하세요. 김자바입니다."); // smartPhine 객체네 메소드 호출( + phone 메소드 호출)
        myPhone.sendVoice("아 네 반갑다");   // smartPhine 객체네 메소드 호출( + phone 메소드 호출)
        myPhone.hangUp();   // smartPhine 객체네 메소드 호출( + phone 메소드 호출)

            // 5.
        myPhone.setWife(true);  // smartPhone 객체내 메소드 호출    }   // main E
        myPhone.internet();  // smartPhone 객체내 메소드 호출    }   // main E
    }
}   // class E

/*
    상속 [p.284]
        - 부모가 자식에게 물려주는 행위
        - 정의 : 객체지향에서도 부모 클래스의 필드와 메소드를 자식 클래스에게 물려줄 수 있다.
        - 사용목적 :
            1. 이미 잘 개발된 클래스를 재사용
            2. 새로운 클래스를 만들기 때문에 중복 코드 줄임
            3. 개발 시간 단축
        - 키워드 : exptends
            1. 자식/하위/서브 클래스 -> 부모는 단 하나

        - 사용방법
            1.
            
            
        - 부모 생성자 호출
            super()
        - 메소드 재정의 [오버라이딩]
            1. 부모 메소드의 선언부 동일 2. 접근제한 더 강하게 할 수 없다.
            2. @override
        - 부모 메소드 호출
            super.메소드()
        - final
            - 필드 : 필드의 값 수정 불가능
                    String final 필드명                - 필드 값 고정
                    String static final 필드명         - 프로그램 전체에서 1개만 갖는 필드 => 상수
            - 클래스 : 상속불가 클래스 만들기
                     public final class 클래스명{}      - 해당 클래스는 부모클래스가 될 수 없다.
            - 메소드 :
                     public final void 메소드명(){}     - 만약 상속받았을때 재정의 불가 메소드
                     
        - 접근제한자
            -
            public          : 필드, 생성자, 메소드, 클래스           : 모든 구역
            private         : 필드, 생성자, 메소드                  : 내부 클래스
            protected       : 필드, 생성자, 메소드                  : 동일 패키지 + 자식객체만 사용가능
            (default)       : 필드, 생성자, 메소드, 클래스           : 동일패키지
*/
