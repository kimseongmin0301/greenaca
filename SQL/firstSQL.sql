/*
첫 순서
데이터베이스 만들기
use 데베명

테이블만들기

테이블검색
*/

create database exam;
use exam;

create table member(
	ID			varchar(20)			primary key,
	password 	varchar(30)			not null,
	name		varchar(5)			not null,
	birth		date,
	gender		varchar(1)
);

alter table member add column address varchar(30);
-- member테이블에 주소 컬럼 추가

alter table member modify column password varchar(20) NOT NULL;
-- member테이블에 비밀번호 컬럼의 글자수를 20자로 변경

drop table member;
-- table 제거

insert into member	(ID, password, name, birth, gender)
values
('A','aaaa','jhon','19970301','M');
-- 데이터 넣기 

delete from member;
-- 데이터 삭제

select * from member;
-- 검색

create table member(
	id				varchar(20)			primary key,
    password		varchar(20)			not null,
    addr			varchar(30)			not null,
    phone			varchar(13),
    email			varchar(30),
    name			varchar(5),
    age				int(2)
);

insert into member	(ID, password, addr, phone,email, name, age)
values
('A','aaaa1','ulsan','010012345678','pose1358@naver.com','Jhon',26),
('B','aaaa2','ulsan','01098765432','pose1358@naver.com','Bob',22),
('C','aaaa3','ulsan','01012345678','pose1358@naver.com','Alice',20),
('D','aaaa4','ulsan','01092100234','pose1358@naver.com','Quid',23);

update member set phone = '01001234567' where id = 'A';

update member set name = '이순신' where name = 'Alice';
update member set password = 'rkskek123' where id = 'D';

select * from member where age between 22 and 23;

delete from member where id = 'A';


create table board(
	bno			int 			auto_increment		primary key,
    title		varchar(20),
    content		varchar(1000),
    writer		varchar(5),
    regdate		datetime	default 	now(),
    cnt			int			default 	0,
    id			varchar(10)
);



-- alter문으로 foreign key 설정
-- alter table 테이블명 add contraint 제약조건명(boardid_fk) <- 내맘대로 적는거임
-- foreign key(컬럼명) references 테이블명(필드명)

alter table board add constraint boardid_fk
foreign key(id) references member(id)
on delete cascade
on update cascade;

alter table board drop constraint boardid_fk;

delete from board where bno = 2;

insert into board(id)
values
('A');

select * from board;
select * from member;

delete from member where id='B';








