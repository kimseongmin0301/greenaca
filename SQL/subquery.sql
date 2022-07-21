/*
subquery

select (select * from 테이블명)
from 테이블명
where 조건

select *
from (select * from 테이블명)
where 조건

select *
from 테이블
where (select * from 테이블명)
*/

-- 급여가 2000이상인 사원번호, 직업, 부서명을 조회
select empno, job, dname
from emp
join dept
on emp.deptno = dept.deptno
where sal >= 2000;

select empno, job, (select dname from dept where emp.deptno = dept.deptno)
from emp
where sal >= 2000;

-- 부서별 최대 인원수를 검색
select max(cnt) 
from (select count(*) cnt
	  from emp  
	  group by deptno) view;
      
-- 각 부서별 평균급여보다 많이 받는 직원
select empno, ename, dname, e.deptno,sal
from emp 	e
join dept 	d
on e.DEPTNO = d.DEPTNO
where sal > any(select avg(sal) from emp group by deptno);
      
-- 전체 부서별 평균급여보다 많이 받는 직원
select empno, ename, dname, e.deptno,sal
from emp 	e
join dept 	d
on e.DEPTNO = d.DEPTNO
where sal > all(select avg(sal) from emp group by deptno);      
      
-- 커미션을 받는 직원
select empno, ename, dname
from emp e 
join dept d
on e.deptno = d.deptno
where ename in(select ename from emp where comm > 0);

select avg(sal)
from
emp;