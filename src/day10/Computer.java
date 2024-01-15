package day10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Computer {
    // 클레스 멤버
    // 1. 필드

    // 2. 생성자

    // 3. 메소드
    int sum2(int x, int y){
        int result = x+y;
        return result;
    };

    int sum(int ... value){
        System.out.println("value = " + value);
        System.out.println("Arrays.toString(value) = " + Arrays.toString(value));
        int sum = 0;
        for(int i = 0; i<value.length; i++){
            sum += value[i];
        }

        return sum;
    }

    int sum3(int[] values){
        System.out.println("values = " + Arrays.toString(values));
        return 0;
    }
}
