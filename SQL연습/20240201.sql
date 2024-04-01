#각 부서별 1986년 Assistant Engineer 직원수 구하기


select d.dept_name as '부서이름', count(*) as'직원수'
from departments as d
join dept_emp as de on de.dept_no = d.dept_no
join titles as t on de.emp_no = t.emp_no
where t.title = "Assistant Engineer" 
and t.from_date >= '1986-01-01'
and t.to_date <= '1986-12-31'
group by d.dept_name;


select * from titles;