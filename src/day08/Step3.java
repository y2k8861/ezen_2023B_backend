package day08;

import java.util.Scanner;

public class Step3 {    // class S
    public static void main(String[] args) {    // main S
        Scanner scanner = new Scanner(System.in);
        Korean k1 = new Korean("박자바","970000-1000000");
        System.out.println("k1 = " + k1);

        Korean k2 = new Korean("김자바","960000-1000000");
        System.out.println("k2 = " + k2);
        
        Korean k3 = new Korean();
        System.out.println("k3 = " + k3);
//        k3.name = "이자바";
//        k3.ssn = "950000-1000000";
        System.out.println("k3 = " + k3);
    }   // main E
} // class E