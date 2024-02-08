package day23;

public class Step1 {
    public static void main(String[] args) {
        SimpleList<Integer> array1 = new SimpleList<>();
        System.out.println(array1.toString());

        array1.add(10);
        array1.add(20);
        array1.add(30);
        array1.add(40);
        System.out.println(array1.toString());
        array1.remove(1);
        System.out.println(array1.toString());

        SimpleList<String> array2 = new SimpleList<>();
        System.out.println(array2.toString());

        array2.add("신승호");
        array2.add("심재훈");
        array2.add("김동훈");
        array2.add("이승호");
        System.out.println(array2.toString());
        array2.remove(1);
        System.out.println(array2.toString());
    }
}
