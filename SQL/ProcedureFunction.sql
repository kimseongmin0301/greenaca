/*
프로시저
delimiter //
create procedure 프로시저명()
begin
	if
	sql 문장1
	if
    sql 문장2
	else
    sql 문장3
end
//
delimiter;
*/

-- 프로시저(부서번호가 10번 사원을 출력)pr1pr1
delimiter //
create procedure pr1(a varchar(2))
begin
	select * from emp where deptno = a;
end
//
delimiter ;

-- pr1프로시저 호출(부서번호 10을 매개변수 a에 세팅)
call pr1(10);

/*
함수만들기
create function 함수명() return 리턴타입
begin
	sql문장
    
    return 리턴값
end
*/

set global log_bin_trust_function_creators = 1;

delimiter //
create function fu2() returns double
begin
	 declare r double;
	 select avg(sal) 
     into r
     from emp;
	 return r;
end
//
delimiter ;

-- fu1 함수 호출
select fu1(10,20) as a;
select fu2();

delimiter //
create function F_SALES(a int) returns int
begin
	declare b int;
	select sum(sal) 
	into b
    from emp
    where deptno = a
    group by deptno;
    return b;
end
//
delimiter ;

drop function f_sales;

select F_SALES(10);
select F_SALES(20);
select F_SALES(30);