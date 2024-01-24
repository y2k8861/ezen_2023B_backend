/* 여러줄 주석처리 */
# 한줄 주석
-- 한줄 주석

-- 1. 데이터베이스 : 데이터가 모여있는 공간 = 테이블을 여러개 저장할 수 있는 공간
drop database if exists test3;	# 만일 'test3' 이라는 데이터 베이스가 존재하면 삭제
create database test3;			# 'test3' 데이터베이스 생성
use test3;						# 'test3' 데이터베이스 사용

-- 2. 테이블 : 행/열로 이루어진 표/테이블 [* 테이블 간 관계가 있으면 => 관계형 데이터베이스]
drop table if exists member; 	# 만일 'member' 테이블이 존재 하면 삭제.
create table member(			# 'member' 테이블 생성 
	mno int,				-- 회원번호
    mid varchar(30),		-- 회원아이디[최대 30글자]
    mphone varchar(13),		
		-- char 고정길이 (필드의 저장할 문자의 길이가 절대적으로 고정일때) 
        -- varchar 가변길이 (필드의 저장할 문자의 길이가 명확하지 않을때)
	mname varchar(10),		-- 회원명 [최대 10글자]
    confirm boolean,		-- 광고문자전송여부 booleanmember true/false 1/0
    joindate datetime		-- db(대소문자구별x),날짜 0000-00-00 00:00:00
    -- 마지막 필드 뒤에 ,(쉼표) 제거
);
# create table 테이블명(필드명 타입, 필드명 타입, 필드명 타입;)
select * from member;		# 'member' 테이블 검색

# ------------------------------------------------------------------------- #
# 테이블 : 행/열 이루어진 테이터 집합
# 레코드 : 테이블 행(row) 단위
# 필드   : 테이블 열(column) 단위

# 1. 레코드 (=필드값) 삽입	( = insert into member values(값1, 값2, 값3, 값4, 값5)
insert into member values(1,'qwer', '010-0000-0000', '유재석', false, '2024-01-22 16:07:01');
	# 리터럴 값을 넣을 때는 숫자/논리 ,문자' ', 날짜시간  ' '
select * from member;

# (필드 데이터의) 제약조건 (검사 규칙) ------------------------------------------------------------------- #
drop table if exists member2;
create table member2(
	회원번호1 int,
    회원번호2 int not null		# 1. not null : 해당 필드에 null 포함하지 않는다.
);

# 레코드 삽입
	# 1. insert into 테이블명 values(값1, 값2, 값3, 값4, 값5)
    # 2. insert into 테이블명(특정필드1,특정필드2,특정필드3) values(값1, 값2, 값3)
insert into member2 values(1,2);			-- (전체 필드에 값 대입시) 회원번호1 필드에 1대입, 회원번호2필드에 2대입
insert into member2(회원번호1) values(1);		-- (특정필드에 값 대입시 필드명 명시/작성) 오류 : 회원번호 필드가 not null
insert into member2(회원번호2) values(2);		-- 회원번호1필드에 null 자동대입, 회원번호2필드에 2 대입

# 테이블(모든 레코드) 확인
select * from member2;

# 2. default : 만일 해당 필드의 기본값 설정
drop table if exists member3;

create table member3(
	회원번호1 int,
    회원번호2 int default 0,			# 2. default 값
    국적 char(4) default '대한민국',
    동의여부 boolean default true,
    날짜 datetime default now()		# now() 함수는 현재날짜와 시간을 반환해주는 SQL 함수
);

insert into member3 values();
insert into member3 values(10,20,'일본',false, '2024-01-22 16:44:00');

select * from member3;

# 3. unique : 필드내 중복된 값을 저장할 수 없다.
drop table if exists member4;
create table member4(
	회원번호1 int,
    회원번호2 int unique				# 3. unique
);

insert into member4 value(1,2);

select * from member4;

# 4. primary key(기본키로 사용할 필드)
	# 1. 레코드를 고유하게 구분하기 위한 최소의 정보 ( = 식별 )
    
# 5, foreign key(외래키)
	# 1. 다른 테이블의 기본키 정보와 연결된 정보 ( = 참조 )
    
# ----------------- 회원제 게시판 : 회원들이 글을 작성해서 저장 ----------------- #
# 계층구조 : 회원(상위) 게시판(하위)
# 테이블 1개 : 서로 다른 목적의 테이터들을 하나의 테이블로 작성시 이상현상(중복/불필요한정보)발생
# 테이블 2개(분해) : 동일한 목적의 테이터끼리 테이블을 생성해서 연결/관계(pk-fk) 이용한 관계형 데이터베이스 구축

# 5-1 회원테이블
	# 1.회원번호 / 2.아이디 / 3.비밀번호 / 4.이름
    # 필드별 타입 선정 -> 제약조건 -> pk 선정(식별키 : 중복X, 공백X, 하나의 레코드의 대표!!)
 drop table if exists member5;
 create table member5(
	mno int not null unique,				-- not null 이면서 중복없는 필드
    mid varchar(30) not null unique,		-- not null 
    mpw varchar(30) not null,				-- not null
    mname varchar(20) default '익명',			-- insert 할때 필드의 값이 있을경우 해당값저장 / 없을 경우 기본값 '익명' 저장
    primary key(mno)						-- mno 필드를 기본키(pk)로 사용 / 관례적 테이블당 1개당 pk필드 1개 이상
 );

# 5-2 게시판 테이블
	# 1.게시물번호 / 2.게시물제목 / 3.게시물내용
drop table if exists board;
 create table board(
	bno int not null unique,
    btitle varchar(255) not null,
    bcontent longtext,
    primary key(bno),					-- bno 필드를 기본키(pk)로 사용
    -- 참조 만들기.
    mno_fk int not null ,				-- 참조테이블에 참조값을 저장할 필드 설정
    foreign key(mno_fk) references member5(mno)
    # foreign key(fk로사용할필드) references pk필드테이블명(pk필드)
 );

/*
	제약조건 : 데이터의 검사 규칙
		- 테이블 선언시 필드 타입 뒤에서 작성
        - create table 테이블명(
			필드명 타입 제약조건명,
            필드명 타입 제약조건명,
            필드명 타입 제약조건명
        );
        
        - 종류 
			1. not null 				: (공백제거)	필드 내에 null 포함하지 않는다.
			2. default 값/함수() 			: (기본값) 	레코드 삽입시 해당 필드의 기본값 설정한다.
            3. unque					: (중복제거) 	필드내 중복된 값을 저장할 수 없다.
            4. primary key(pk필드명)		: 해당 필드를 기본키로 사용.	[관례적으로 테이블당 1개 이상]
            5. foreign key(fk필드명) references pk필드테이블명(pk필드명)[]
*/