package day04;  // 패키지 이름

public class Step2 {    // class S
    public static void main(String[] args) {    // main S

        // [p.124]
        // 1~10까지 출력하는 코드
        System.out.println(1+" ");
        System.out.println(2+" ");
        System.out.println(3+" ");
        System.out.println(4+" ");
        System.out.println(5+" ");
        System.out.println(6+" ");
        System.out.println(7+" ");
        System.out.println(8+" ");
        System.out.println(9+" ");
        System.out.println(10+" ");

        for(int i = 1; i<=10; i++)  // for S
            System.out.println(i + " ");
        // for E
        
        // 2. 1~100까지 합
        int sum = 0;    // 누적합계 구할려고, for 안에서도  쓰고 밖에서 쓰고
        int i = 1;
        for(i=1; i<=100; i++){    // for S
            sum += i;   // vs sum = sum + i;
        }   // for E
        System.out.println("sum = " + sum); // soutv

        // 3. 구구단
        for(i=2; i<10; i++){    // for1 S
            System.out.printf("\n*****%d단*****\n",i);
            for(int j = 1; j<10; j++){  // for2 S
                System.out.printf("%d X %d = %d\n",i,j,i*j);
            }   // for2 E
        }   // for 1 E

        // 4. (1) for -> while 1 ~ 10까지
        int j = 1;
        while (j<=10){  //while s
            System.out.println(j + " ");
            j++;
        } // while e

        // 5. (2) for -> while 1~100까지 누적 합계
        int sum2 = 0;
        int m = 1;
        while (m<=100){
            sum2 += m;
            m++;
        }

        System.out.println("1~" + (m-1) + "합 : " + sum2);

    }   // main E
}   // class E
