-- 검색할때 별명붙이기 
SELECT	bno as '게시판번호',
		title as '제목', 
		writer as '작성자',
		regdate as '작성일자',
		cnt as '조회수'
FROM BOARD;

-- 부모 자식 테이블 만들기 foreign key
-- dept가 부모 emp가 자식
create table emp(
	EMPNO		int				primary key,
    ENAME		varchar(10)		not null,
    JOB			varchar(20)		not null,
    MGR			int,
	HIREDATE	date			not null,
    SAL			int				not null,
	COMM		int,
    DEPTNO		int,

    constraint DEPTNO_FK
    foreign KEY (DEPTNO)
    references DEPT(DEPTNO)
    on update cascade
    on delete cascade
);

create table DEPT(
	DEPTNO		int				primary key,
    DNAME		varchar(20)		not null,
    LOC			varchar(10)		not null
);

-- 값넣기
insert into DEPT(DEPTNO, DNAME, LOC)
values
('10','ACCOUNTING', 'NEW YORK'),
('20','RESEARCH', 'DALLAS'),
('30','SALES', 'CHICAGO'),
('40','OPERATIONS', 'BOSTION'),
('50','EVELOPER', 'KOREA');

insert into emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
values
('7369','SMITH','CLERK','7902','1980-12-17','800',null,'20'),
('7499','ALLEN','SALESMAN','7698','1981-02-20','1600','300','30'),
('7521','WARD','SALESMAN','7698','1981-02-22','1250','500','30'),
('7566','JONES','MANAGER','7839','1981-04-02','2975',null,'20'),
('7654','MARTIN','SALESMAN','7698','1981-09-28','1250','1400','30'),
('7698','BLAKE','MANAGER','7839','1981-05-01','2850',null,'30'),
('7782','CLARK','MANAGER','7839','1981-06-09','2450',null,'10'),
('7788','SCOTT','ANALYST','7566','1982-12-09','3000',null,'20'),
('7839','KING','PRESIDENT',null,'1981-11-17','5000',null,'10'),
('7844','TURNER','SALESMAN','7698','1981-09-08','1500','0','30'),
('7876','ADAMS','CLERK','7788','1983-01-12','1100',null,'20'),
('7900','JAMES','CLERK','7698','1981-12-03','950',null,'30'),
('7902','FORD','ANALYST','7566','1981-12-03','3000',null,'20'),
('7934','MILLER','CLERK','7782','1982-01-23','1300',null,'10');

select * from emp;
select * from DEPT;

-- where절을 활용
-- 사원 테이블(emp)에서 사원번호 (EMPNO) 7566번의
-- 이름(ename)과 부서번호(dno)를 검색
select ENAME, DEPTNO
from emp
where EMPNO = '7566';

-- 사원테이블에서 부서번호가 20번이고 월급이 400이상인 사원이름과 직책검색
SELECT ENAME, JOB
from emp
where DEPTNO ='20' AND SAL >= '400';

-- 월급이 2000대인  사원과 직책 검색(between)
select ENAME, JOB
FROM EMP
WHERE SAL BETWEEN 2000 AND 2999;

-- 사원테이블에서 직업이 SALESMAN 이거나 MANAGER인 사원의 사원번호와 이름을 검색
SELECT EMPNO, ENAME
FROM EMP
WHERE JOB = 'SALESMAN' OR JOB = 'MANAGER';

-- 사원테이블에서 직업이 SALESMAN 이거나 MANAGER인 사원의 사원번호와 이름을 검색(in)
SELECT EMPNO, ENAME
FROM EMP
WHERE JOB in('SALESMAN','MANAGER');

-- 사원테이블에서 COMM이 NULL값인 사원의 사원번호와 이름을 검색
SELECT EMPNO, ENAME
FROM EMP
WHERE COMM IS NULL;

-- like 연산자
-- 사원테이블에서 이름이 smith인 사원의 월급과 부서번호를 검색
select sal, deptno
from emp
where ename like 'smith';

-- 사원테이블에서 이름이 s로 시작하는 사원의 월급과 부서번호를 검색
select sal, deptno
from emp
where ename like 's%';

-- order by ASC, DESC. 오름차순 내림차순
-- 급여가 높은순부터 정렬
select * from emp
order by sal desc;



/*
1. 사원 테이블에서 사원 번호와 이름과 월급을 출력하라
2. 직위가 'SALESMAN'이고 월급이 1000이상인 사원의 이름과 월급을 출력하라.
3. 직위가 MANAGER인 사원을 뽑는데 월급이 높은 사람순으로 이름, 직위, 월급을 출력하라.
4. 이름이 SCOTT인 사원의 이름, 월급, 직업, 입사일, 부서 번호를 출력하라
5. 81년 11월 17일에 입사한 사원의 이름, 월급, 직업, 입사일을 출력하라
6. 월급이 3600 이상인 사원들의 이름과 월급을 출력하라
7. 월급이 1200 이하인 사원들의 이름과 월급, 직업, 부서번호를 출력하라
8. 직업이 SALESMAN이 아닌 사원들의 이름과 부서 번호, 직업을 출력하라
9. 월급이 1000에서 3000사이가 아닌 사원들의 이름과 월급을 출력하라
10. 이름의 끝 글자가 T로 끝나는 사원들의 이름과 월급을 출력하라
11. 커미션이 NULL인 사원들의 이름과 커미션을 출력하라
12. 직업이 SALESMAN, ANALYST, MANAGER가 아닌 사원들의 이름, 월급, 직업을 출력하라
*/

select empno, ename, sal
from emp;

select ename, sal
from emp
where job = 'salesman' and sal >= 1000;

select ename, job, sal
from emp
where job='manager'
order by sal desc;

select ename, sal, job, hiredate, mgr
from emp
where ename = 'scott';

select ename, sal, job, hiredate
from emp
where hiredate = 811117;

select ename, sal
from emp
where sal >= 3600;

select ename, sal, job, mgr
from emp
where sal <= 1200;

select ename, job, mgr
from emp
where job != 'salesman';

select ename, sal
from emp
where sal not between 1000 and 3000;

select ename, sal
from emp
where ename like '%T';

select ename, comm
from emp
where comm is null;

select ename, sal, job
from emp
where job not in('salesman', 'analyst', 'manager');