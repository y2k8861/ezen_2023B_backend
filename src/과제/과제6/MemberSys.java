package 과제.과제6;
import java.util.Scanner;

public class MemberSys { // class s

	static Scanner sc = new Scanner(System.in);

	static Member[] members = new Member[100];

	public static void main(String[] args) {



		while(true) {

			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
			int ch = sc.nextInt();

			if( ch == 1 ) {
				회원가입();
			}
			else if( ch == 2 ) {
				로그인();
			}
			else if( ch == 3 ) {
				아이디찾기();
			}
			else if( ch == 4 ) {
				비밀번호찾기();
			}

		} // w e
	} // m e

	static public void 회원가입(){
		System.out.print("아이디 : "); String id = sc.next();
		System.out.print("비밀번호 : "); String pw = sc.next();
		System.out.print("이름 : "); String name = sc.next();
		System.out.print("전화번호 : "); String phone = sc.next();
		System.out.print("나이 : "); int age = sc.nextInt();

		Member member = new Member(id,pw,name,phone,age);
		for(int i = 0; i<members.length; i++){
			if(members[i] == null){
				members[i] = member;
				System.out.println("회원가입 완료");
				return;
			}
		}
	}

	static public void 로그인(){
		System.out.print("아이디 : "); String id = sc.next();
		System.out.print("비밀번호 : "); String pw = sc.next();

		Member member = new Member();
		member.setId(id);
		member.setPw(pw);

		for(int i = 0; i<members.length; i++){
			if(members[i] != null){
				if(members[i].getId().equals(member.getId()) && members[i].getPw().equals(member.getPw())){
					System.out.println("로그인 성공");
					return;
				}
			}
		}

		System.out.println("로그인실패");
	}

	static public void 아이디찾기(){
		System.out.print("이름 : "); String name = sc.next();
		System.out.print("전화번호 : "); String phone = sc.next();

		Member member = new Member();
		member.setName(name);
		member.setPhone(phone);

		for(int i = 0; i<members.length; i++){
			if(members[i] != null){
				if(members[i].getName().equals(member.getName()) && members[i].getPhone().equals(member.getPhone())){
					System.out.println("찾으시는 아이디 : " + members[i].getId());
					return;
				}
			}
		}

		System.out.println("아이디 찾기 실패");
	}

	static public void 비밀번호찾기(){
		System.out.print("아이디 : "); String id = sc.next();
		System.out.print("전화번호 : "); String phone = sc.next();

		Member member = new Member();
		member.setId(id);
		member.setPhone(phone);

		for(int i = 0; i<members.length; i++){
			if(members[i] != null){
				if(members[i].getId().equals(member.getId()) && members[i].getPhone().equals(member.getPhone())){
					System.out.println("찾으시는 비밀번호 : " + members[i].getPw());
					return;
				}
			}
		}

		System.out.println("비밀번호 찾기 실패");
	}
} // class e 
/*
	주제 : 회원제 시스템 part2
	 	- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 기능별 함수를 4개 생성하시오.

		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		1. 생성자 사용하시오.
		2. getter , setter 메소드를 사용하시오.

		[ MemberSys 클래스 ]
		0. 배열
			Member[] 객체배열 = new Member[100];

		1. 초기 메뉴
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
			
		2. 조건 기능 
			1. 회원가입 메소드 
				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장 
				2. Member 객체화
				3. 객체를 배열 저장 
				 
			2. 로그인 메소드
				1. 아이디 , 비밀번호 입력받아 저장 
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 로그인 성공 
					- 아니면 실패
					 
			3. 아이디찾기 메소드
				1. 이름 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 아이디 출력 
					- 아니면 없다.
					 
			4. 비밀번호찾기 메소드 
				1. 아이디 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 비밀번호 출력
					- 아니면 없다.

			
*/














