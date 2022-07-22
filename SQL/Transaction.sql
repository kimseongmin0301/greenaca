/*
start transaction
select
insert
update
delete

commit
rollback
*/

select * from board;

start transaction;
	select title, content,cnt from board WHERE id = 'c';
	update board
    set cnt = cnt + 1
    where id = 'c';
	select title, content,cnt from board WHERE id = 'c';
rollback;