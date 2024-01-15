package day10;

public class Step2 {    // class S
    public static void main(String[] args) {    // main S

        // [p.234] : 가변길이 매개변수
            // 메소드를 호출할때에는 매개변수의 개수에 맞게 매개값을 제공.
            // 가변길이 매개변수를 가지고 있다면 개수와 상관 없이 제공

        // - 다른 클래스에 있는 메소드를 사용하고 싶을떄.
            // - 객체생성 : 메소드 호출할려고
        Computer myCom = new Computer();
            // - 메소드 호출
        int result0 = myCom.sum2(1,2);
        System.out.println("result0 = " + result0);
        
        int result1 = myCom.sum(1,2,3);
        System.out.println("result1 = " + result1);
        
        int result2 = myCom.sum(1,2,3,4,5);
        System.out.println("result2 = " + result2);
        
        int[] value = {1,2,3,4,5};
        int result3 = myCom.sum(value);
        System.out.println("result3 = " + result3);

        int result4 = myCom.sum(new int[]{1,2,3,4,5});
        System.out.println("result4 = " + result4);

        int result5 = myCom.sum3(value);
        System.out.println("result5 = " + result5);


    }   // main E
}   // class E

/*
    객체지향 프로그래밍 : 객체들 간의 상호작용 ( 함수 이용 )
                    더하기 기능
            사람 <---------------> 계산기
                    결과 리턴
*/