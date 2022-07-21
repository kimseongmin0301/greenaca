select *
from member;

select *
from board;

alter table board drop writer;

-- join
select * 
from member, board
where member.id = board.id;

select * 
from member as m,
	 board 	as b
where m.id = b.id;

select bno, title, name, regdate, cnt
from member
join board 
on member.id = board.id
where bno = 12;

select * from dept;
select * from emp;
 
select emp.*, loc
from emp
join dept
on emp.deptno = dept.deptno
where loc='chicago';

select empno,job,hiredate, loc
from emp e join dept d
on e.deptno = d.deptno
order by hiredate desc;

select *
from emp e left outer join dept d
on e.deptno = d.deptno;

select *
from emp e right outer join dept d
on e.deptno = d.deptno;

