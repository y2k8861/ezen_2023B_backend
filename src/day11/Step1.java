package day11;

public class Step1 {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567","김자바");
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        //k1.nation = "USA"; // final 초기화 이후 수정불가.

        System.out.println(Korean.EARTH_RADIUS);
        System.out.println(Korean.EARTH_SURFACE_AREA);
    }
}
