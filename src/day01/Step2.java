package day01;

public class Step2 {
    public static void main(String[] args) {

        /*
        int value; // 변수 선언했지만 초기값이 없기 때문에 메모리 할당 없음.
        int result = value + 10; // 오류 발생 [초기값 없는 변수를 호출했기떄문에 오류발생]
        */
        // java: variable value might not have been initialized
        // 해결방안 : 초기값 대입하자
        int value = 5;
        int result = value + 10;
        System.out.println(result);
    }
}
