package day03;  // 패키지 이름

import java.util.Scanner;

public class Step3 {    // class S
    public static void main(String[] args) {    // main S
        Scanner scanner = new Scanner(System.in);

        // 문제1 : 하나의 정수형으로  입력받아 7의 배수 이면 'O' 아니면 'X' 출력 하시오.
        /*System.out.print("문제1 : ");int i1 = scanner.nextInt();
        char r1 = i1%7 == 0 ? 'O':'X';
        System.out.println("7의 배수" + r1);*/

        // 문제2 : 하나의 정수형으로  입력받아 홀수 이면 'O' 아니면 'X' 출력 하시오.
        /*System.out.print("문제2 : ");int i2 = scanner.nextInt();
        char r2 = i2%2 == 1 ? 'O':'X';
        System.out.println(r2);*/

        // 문제3 : 하나의 정수형으로  입력받아 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.
        /*System.out.print("문제3 : ");int i3 = scanner.nextInt();
        char r3 = i3%2 == 0 && i3%7 == 0 ? 'O':'X';
        System.out.println(r3);*/

        // 문제4 : 하나의 정수형으로  입력받아 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.
        /*System.out.print("문제4 : ");int i4 = scanner.nextInt();
        char r4 = i4%2 == 0 || i4%11 == 0 ? 'O':'X';
        System.out.println(r4);*/

        // 문제5 : 두개의 정수형으로 입력받아 더 큰수 출력 하시오.
        /*System.out.print("문제5 정수1 : ");int i5 = scanner.nextInt();
        System.out.print("문제5 정수2 : ");int i6 = scanner.nextInt();
        int r5 = i5 > i6 ? i5 : i6;
        System.out.println("더 큰 수는 = " + r5);*/

        // 문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
        // 계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
        /*System.out.print("문제6 : "); int i7 = scanner.nextInt();
        double r6 = i7 * i7 * 3.14;
        System.out.println("원의 넓이 : " + r6);*/

        // 문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
        // 예) 54.5   84.3 실수 2개입력시 결과는   64.285714%
        /*System.out.print("문제7 : "); double i8 = scanner.nextDouble();
        System.out.print("문제7 : "); double i9 = scanner.nextDouble();
        double r7 = i8/i9*100;
        System.out.printf("%.1f" , r7);
        System.out.print("%");*/

        // 문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
        // 계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2
        /*System.out.print("문제8 윗변 : "); double i10 = scanner.nextDouble();
        System.out.print("문제8 밑변 : "); double i11 = scanner.nextDouble();
        System.out.print("문제8 높이 : "); double i12 = scanner.nextDouble();
        double r8 = (i10 + i11) * i12 / 2;
        System.out.printf("사다리꼴 넓이 : %.1f" , r8);*/

        // 문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
        // 계산식) 표준체중 계산식 = > (키 - 100) * 0.9
        /*System.out.print("문제9 키 : "); int i13 = scanner.nextInt();
        int r9 = (int)((i13 - 100) * 0.9);
        System.out.println("표준체중 : " + r9);*/

        // 문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
        // 계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
        /*System.out.print("문제10 키 : "); double i14 = scanner.nextDouble();
        System.out.print("문제10 몸무게 : "); double i15 = scanner.nextDouble();
        double r10 = i15/((i14 / 100) * (i14 / 100));
        System.out.printf("BMI : %.2f" , r10);*/

        // 문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
        // 계산식) 1 inch -> 2.54cm
        /*System.out.print("문제11 inch : "); double i16 = scanner.nextDouble();
        System.out.printf("cm : %.2f" , i16*2.54);*/

        // 문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오
        // 계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %
        /*System.out.print("문제12 중간고사 : "); double i17 = scanner.nextDouble();
        System.out.print("문제12 기말고사 : "); double i18 = scanner.nextDouble();
        System.out.print("문제12 수행평가 : "); double i19 = scanner.nextDouble();
        double r12 = (i17*0.3) + (i18*0.3) + (i19*0.4);
        System.out.printf("총 : %.2f" , r12);*/

        // 문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
        /*int x = 10;   x에 10을 대입
        int y = x-- + 5 + --x; x-- 선호출로 10 후에 감소 x = 9 -> --x 선감소 후호출 x = 8 => 10 + 5 + 8 = 23을 y의 대입
        printf(" x의 값 : %d , y의값 :  %d ", x, y); 따라서 x = 8, y = 23 */

        // 문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
        /*System.out.print("문제14 : "); int i20 = scanner.nextInt();
        //String r14 = i20 >= 40 ? "중년" : i20 >= 20 ? "성인" : i20 >= 10 ? "학생" : "아가";


        String r14 = i20 >= 10 ?  i20 >= 20 ? i20 >= 40 ? "중년" : "성인" : "학생" : "아가";
        System.out.println("r14 = " + r14);*/

        // 문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력
        /*System.out.print("문제15 국어 : "); int i21 = scanner.nextInt();
        System.out.print("문제15 영어 : "); int i22 = scanner.nextInt();
        System.out.print("문제15 수학 : "); int i23 = scanner.nextInt();
        int r15_1 = i21 + i22 + i23;
        double r15 = (double)(r15_1)/3;
        System.out.printf("총점 : %d\n" , r15_1);
        System.out.printf("평균 : %.2f" , r15);*/

        // 문제16 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력
        /*System.out.print("문제16 아이디 : "); String i24 = scanner.nextLine();
        System.out.print("문제16 비밀번호 : "); String i25 = scanner.nextLine();
        String r16 = i24.equals("admin") && i25.equals("1234") ? "로그인성공" : "로그인실패" ;
        System.out.println(r16);*/

        // 문제17 : 3개의 정수형으로 입력받아 가장 큰수 출력
        System.out.print("문제17 정수1 : "); int i26 = scanner.nextInt();
        System.out.print("문제17 정수2 : "); int i27 = scanner.nextInt();
        System.out.print("문제17 정수3 : "); int i28 = scanner.nextInt();
//        int r17 = i26 < i27 ? i27 < i28 ? i28 : i27 : i26 < i28 ? i28 : i26;
        int r17 = i26/i27 < 1 ? i27 : i26;
        r17 = r17/i28 < 1 ? i28 : r17;
        System.out.println("제일 큰 수는 " + r17);

        /*int temp = i26 < i27 ? i26 : i27;
        i27 = i26 < i27 ? i27 : i26;
        i26 = i26 < i27 ? i26 : temp;

        temp = i26 < i28 ? i26 : i28;
        i28 = i26 < i28 ? i28 : i26;
        i26 = i26 < i28 ? i26 : temp;

        temp = i27 < i28 ? i27 : i28;
        i28 = i27 < i28 ? i28 : i27;
        i27 = i27 < i28 ? i27 : temp;

        System.out.printf("%d %d %d",i26,i27,i28);*/



    }   // main E
}   // class E
