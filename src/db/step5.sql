# DAY18 회원가입 게시판
# 1. 데이터베이스 생성
drop database if exists java;
create database java;
use java;

# 2. (회원가입) 테이블
drop table if exists member;
create table member(
	mno int	auto_increment,						-- 번호,	mysql 제공하는 제약조건 자동번호 부여(auto_increment) pk만 가능.
    mid	varchar(30) not null unique,	-- 아이디
    mpw	varchar(30) not null,			-- 비밀번호
    mphone char(13) not null unique,	-- 전화번호
    mdate datetime default now(),		-- 가입날짜
    primary key(mno)					-- 번호가 기본키(pk) - not null, unique 생략가능
);

insert into member(mid,mpw,mphone) values('qwer' , '1234', '010-1234-1234');
	# java
# insert into member(mid,mpw,mphone) values(?,?,?);    

select * from member;

# (select) 아이디 중복체크/검사/비교
select mid from member;
	# select mid from member where mid = '찾을아이디'; (where 조건식 : 필드명 = 값)
select mid from member where mid = 'qwer';
# select mid from member where mid = ?;
# select mid from member where mid = '+변수+';

# R[select] 로그인 : 아이디와 비밀번호 비교 and(java &&) , or(java ||)
select * from member where mid = 'qwer' and mpw = '1234';
# select * from member where mid = ? and mpw = ?;

# R[select] 회원번호찾기
select mno from member where mid = 'qwer';
#select mno from member where mid = ?;

SHOW DATABASES;

