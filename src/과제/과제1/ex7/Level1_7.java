package 과제.과제1.ex7;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_7 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_7 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String output = "";
		
		/* 문제풀이 위치 */
		System.out.print("회원명 String : ");
		String inS = scanner.nextLine();

		System.out.print("상태 boolean : ");
		boolean inB = scanner.nextBoolean();

		System.out.print("회원번호 byte : ");
		byte inByte = scanner.nextByte();

		System.out.print("성별 char : ");
		char inC = scanner.next().charAt(0);

		System.out.print("나이 short : ");
		short inShot = scanner.nextShort();

		System.out.print("포인트 int : ");
		int inInt = scanner.nextInt();

		System.out.print("예금액 long : ");
		long inL = scanner.nextLong();

		System.out.print("키 float : ");
		float inF = scanner.nextFloat();

		System.out.print("몸무게 double : ");
		double inD = scanner.nextDouble();


        output += "===========회원 개인정보===============";
		System.out.println(output);
		System.out.printf("%-10s%-21s\t|","|","회원명 : " + inS);
		System.out.printf("\n%-10s%-21s\t|","|","상태 : " + inByte);
		System.out.printf("\n%-10s%-21s\t|","|","성별 : " + inC);
		System.out.printf("\n%-10s%-21s\t|","|","나이 : " + inShot);
		System.out.printf("\n%-10s%-21s\t|","|","포인트 : " + inInt);
		System.out.printf("\n%-10s%-21s\t|","|","예금액 : " + inL);
		System.out.printf("\n%-10s%-21s\t|","|","평균 : " + inF);
		System.out.printf("\n%-10s%-21s\t|","|","평균 : " + inD);
		output = "\n=====================================d";
		System.out.print(output);

		/* ----------- */
	}
}
/* 
	[문제조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 기본 자료형8개 + 문자열클래스 변수 1개 를 이용한 9개변수를 입력 받습니다.
		3. 입력받은 9개 변수를 그림과 같이 출력합니다.
		4. 기존에 미리 작성된 변수를 최대한 활용합니다.
		
*/
