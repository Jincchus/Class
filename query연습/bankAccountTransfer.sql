# 출금 금액 insert 쿼리문 만들어 보기
insert into history_tb (amount, w_account_id, d_account_id, w_balance, d_balance, created_at)
 values (1000, 1, null, 1200, null, now());

# 출금 처리 update
update account_tb set number = 1111, password = 1234, balance = 1200, user_id = 1
	where id = 1;


select * from history_tb;
desc history_tb;
 
select * from account_tb;
desc account_tb;