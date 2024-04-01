#user_tb
select * from user_tb;
select * from user_tb where id = 1;
select * from user_tb where username = '카스';

insert into 
	user_tb(username, password, fullname, created_at)
values('test1', 'asd1234', 'aa', now());

update user_tb set username = 'test2', password = '1111', 
				fullname = 'uu' where id = 4;

delete from user_tb where id = 4;

#account_tb
select * from account_tb;
select * from account_tb where id = 1;
insert into 
	account_tb(number, password, balance, user_id, created_at)
values('1234', '1234', '2000', '1', now());

update account_tb set number = '1212', password = '1234',
					balance = '5000', user_id = '2' where id =2;

delete from account_tb where id = 4;

#history_tb
select * from history_tb;
select * from history_tb where id = 1;

insert into
	history_tb(amount, w_account_id, d_account_id, w_balance, d_balance, created_at)
values('300', '2','3','1100','1000',now());

update history_tb set amount = '200', w_account_id = '2', d_account_id = '1',
					w_balance = '1000', d_balance='1500' where id = 4;
                    
delete from history_tb where id = 4;