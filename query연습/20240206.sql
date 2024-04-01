select * from employees;

#3월 5월 7월이 생일인 Senior Engineer fullname
select distinct e.first_name, e.last_name, e.birth_date
from employees as e
join titles as t on t.emp_no = e.emp_no
where t.title = 'Senior Engineer'
and month(e.birth_date) in ('03','05', '07');
