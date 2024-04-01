
-- 1번 계좌에서 출금 내역 
select * from history_tb where w_account_id = 5;

-- 1번 계좌에서 입금 내역 
select * from history_tb where d_account_id = 5;

-- 1번 계좌에서 계좌 번호 정보까지 출력하는 출금 결과 집합을 만드시오
select h.id, h.amount, h.w_balance,
	   a.number, h.created_at  
from history_tb as h
inner join account_tb as a
on h.w_account_id = a.id
where h.w_account_id = 5;

-- 1번 계좌에서 계좌 번호 정보까지 출력하는 입금 결과 집합을 만드시오
select h.id, h.amount, h.d_balance,
	   a.number, h.created_at  
from history_tb as h
inner join account_tb as a
on h.d_account_id = a.id
where h.d_account_id = 5;



-- 3단계 
-- 출금된 계좌번호와 입금한 계좌번호를 함께 출력 하시오  
select h.id, h.amount, h.w_balance as balance, h.created_at,
	   ifnull(da.number, 'AMT') as recevier, 
       wa.number as sender 
from history_tb as h 
left join account_tb as wa
on h.w_account_id = wa.id 
left join account_tb as da 
on h.d_account_id = da.id 
where h.w_account_id = 5;


-- 입금 내역 
select h.id, h.amount, h.d_balance as balance, h.created_at,
	   ifnull(wa.number, 'ATM') as sender, 
       da.number as receiver 
from history_tb as h 
left join account_tb as da 
on h.d_account_id = da.id 
left join account_tb as wa 
on h.w_account_id = wa.id 
where h.d_account_id = 1;

-- 입출금 내역(조건 1이 만족할 때 A 출력 조건 2가 만족할 때 B출력)
-- CASE WHEN THEN 함수 필요
# 5555 계좌에서 보낸 금액 받은 금액이 한번에 출력 되어야 함
#select h.id, h.amount, 
#if(isnull(da.number),'ATM', da.number) as receiver,
#h.d_balance,
#if(isnull(wa.number),'ATM', wa.number) as sender,
#h.w_balance,
#     h.created_at
#from history_tb as h
#left join account_tb as da
#on h.d_account_id = da.id
#left join account_tb as wa
#on h.w_account_id = wa.id
#where h.d_account_id = 5 or h.w_account_id = 5;
;
 
-- 입출금 내역 (조건이 1 만족할 대 A 출력 조건 2가 만족할 때 B출력 )
#CASE WEHN THEN ... 함수가 필요 하다. 

select h.id, h.amount,
case when h.w_account_id = 5 then (h.w_balance)
     when h.d_account_id = 5 then (h.d_balance) 
     end as balance, 
     ifnull(wa.number, 'ATM') as sender, 
     ifnull(da.number, 'ATM') as receiver, 
     h.created_at
from history_tb as h 
left join account_tb as da 
on h.d_account_id = da.id 
left join account_tb as wa 
on h.w_account_id = wa.id 
where h.d_account_id = 5 or h.w_account_id = 5;













