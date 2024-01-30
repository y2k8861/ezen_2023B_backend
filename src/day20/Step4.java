package day20;

public class Step4 {
    // 1. 매가변수 문자의 길이를 알려주는 함수( nullPointerException)
    public static void printLength(String data){
        // ---- 예외가 발생할 것 같은 코드 ---- //
        try {
            int result = data.length();     // .(도트) : 참조객체의 인스턴스 멤버 호출 (접근연산자)
            System.out.println("문자 수 : " + result);

            // 만약에 예외 발생 하면 catch
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
            // System.out.println(e.toString());
            // e.printStackTrace();
        } finally {
            System.out.println("[마무리 실행]");
        }
        // ---- 예외가 발생할 것 같은 코드 ---- //
    }

    public static void main(String[] args) {
        // 1. [실행예외 - 컴파일시 예외 검사 안함.] nullPointerException
        printLength("ThisIsJAVA");
        printLength(null);  // null 이면 참조가 없으므로 .(도트)가 불가능

        // 2. [일반예외 - 컴파일시 예외 검사 진행.] ClassNotFoundException
        try {
            Class.forName("java.lang.String");
            Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e){
            //e.printStackTrace();
            System.out.println("ss");
        }

        System.out.println("프로그램 종료");

        // 3.
        String[] array = {"100","1oo"};
        for(int i = 0; i<= array.length; i++){
            try {
                int value = Integer.parseInt(array[i]);         // NumberFormatException : "1oo"는 정수타입으로 변환 불가능
                System.out.println("array["+i+"] : "+value);    // ArrayIndexOutOfBoundsException : 2 인덱스는 존재하지 않는다.
            } catch (NumberFormatException e){
                System.out.println(i+"숫자로 변경할 수 없습니다." + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(i+"배열 인덱스가 초과됨." + e.getMessage());
            }
        }
    }

}
