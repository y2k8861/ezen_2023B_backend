/*
	데이터베이스 : 데이터(자료) 집함(모임)
		- 관계형 데이터베이스 (RDBMS) : 행/열 이루어진 데이터모임(테이블) 이면서 테이블간의 관계
			- 여러개 테이블 보관
		- SQL : 데이터베이스에서 사용돠는 데이터처리 언어
			------------- DDL : 정의어 -------------
			1. drop 
				drop database if exists 데이터베이스명;
                drop table if exists 테이블명;
            2. creat
				create database 데이터베이스명;
                create table 테이블명(필드명 타입 제약조건, 필드명 타입 제약조건, 필드명 타입 제약조건);
			------------- DML : (*)조작어 4가지 키워드 -------------
            1. insert : 레코드 삽입
				1. 모든 필드 : insert into 테이블명 values(값1,값2);
                2. 특정 필드 : insert into 테이블명(필드명,필드명) values(값1,값2);
			2. select : 레코드 선택
				1. 모든 필드(*와일드카트) 의 레코드 검색 : select * from 테이블명
			3. update : 레코드의 필드 값 변경
				1, update 테이블명 set 수정할필드명 = 수정할 값, 수정할 필드명 = 수정할 값;
			4. delete : 레코드 삭제
				1. delete from 테이블명;
		- 제약조건
			1. not null
            2. unique
            3. default 기본값
            4. primary key
            5. foreign key
*/
# 1. 데이터베이스 생성 / 사용
drop database if exists test4;
create database test4;
use test4;

# 2. 테이블 생성
drop table if exists member;
create table member(
	mno int not null unique,			-- 회원번호 int 타입 null[x], 중복[x]
    mid varchar(30) not null unique,	-- 회원아이디 가변길이문자 타입 null[x], 중복[x]
    mdate datetime default now(),		-- 회원가입 날짜/시간 타입,now() 현재 날짜/시간 반환해주는 SQL함수
    primary key(mno)					-- 회member원번호를 pk(식별키) 사용
);

# 3. 회원 가입한다. --> 테이블에 레코드를 추가한다.
insert into member(mno,mid) values(1,"qwe");		-- 번호와 아이디가  unique 라서 1번만 실행 가능

# 4. 모든 회원들의 정보를 출력한다. --> 테이블내 모든 레코드를 출력한다.
select * from member;

# 5. 모든 회원들의 정보를 삭제한다. --> 테이블내 모든 레코드를 제거한다.
delete from member;
# *mysql workbench 에서 delete/update 기본적으로 사용 금지
# 해제 : 메뉴 -> edit -> preferences -> SQL editor -> 맨 아래 (safe updates) 해제

# 6. 회원 아이디 변경 한다. 		-- > 테이블 내 레코드의 필드값 변경
update member set mid = "asd";


