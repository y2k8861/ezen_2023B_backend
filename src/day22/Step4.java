package day22;

public class Step4 {

    // 제네릭 메소드
    // <타입 파라미터> 리턴타입 메소드명(매개변수){}
    // 1. 일반메소드
    public static boolean boxing1(String s){
        return false;
    };

    // 2.
    public static <T> boolean boxing2(String s){
        T t = null;
        System.out.println(t);
        return false;
    };

    // 3.
//    public static <T> Box3<T> boxing3(String s){
//        Box3<String> box = new Box3<>();
//        return box;
//    };

    // 4. 제너릭 메소드 : 제한없는 파라미터
    public static <T> Box3<T> boxing4(T t){
        Box3<T> box = new Box3<>();
        box.setT(t);
        return box;
    };

    // [P.582]
    // 제네릭 메소드 : 제한된 파리미터
    public static <T extends Number > boolean campare(T t1, T t2){
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return v1 == v2;
    }

    public static void main(String[] args) {
        Box3<Integer> box1 = boxing4(100);
        int intValue = box1.getT();

        Box3<String> box2 = boxing4("홍길동");
        String strValue = box2.getT();

        boxing2("안녕하세요.");

        Box3<Car> box3 = boxing4(new Car());
        Car carValue = box3.getT();

        // [P.582]
        boolean result1 = campare(10,20);
        System.out.println("result1 = " + result1);
        
        boolean result2 = campare(4.5,4.5);
        System.out.println("result2 = " + result2);

//        boolean result3 = campare("안녕하세요.",new Car());
//
//        boolean result4 = campare(new Object(),new Object());
    }
}
