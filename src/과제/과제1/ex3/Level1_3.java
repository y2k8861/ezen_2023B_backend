package 과제.과제1.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		/* 문제풀이 위치 */
		System.out.print("input boolean : ");
		boolean inputBoolean = scanner.nextBoolean();

		System.out.print("input byte : ");
		byte inputByte = scanner.nextByte();

		System.out.print("input char : ");
		char inputChar = scanner.next().charAt(0);

		System.out.print("input short : ");
		short inputShort = scanner.nextShort();

		System.out.print("input int : ");
		int inputInt = scanner.nextInt();

		System.out.print("input long : ");
		long inputLong = scanner.nextLong();

		System.out.print("input float : ");
		float inputFloat = scanner.nextFloat();

		System.out.print("input double : ");
		double inputDouble = scanner.nextDouble();

		System.out.println("output boolean : " + inputBoolean);
		System.out.println("output byte : " + inputByte);
		System.out.println("output char : " + inputChar);
		System.out.println("output short : " + inputShort);
		System.out.println("output int : " + inputInt);
		System.out.println("output long : " + inputLong);
		System.out.println("output float : " + inputFloat);
		System.out.println("output double : " + inputDouble);

		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. print() 메소드 사용
		3. scanner 객체 사용하여 입력받기
*/
