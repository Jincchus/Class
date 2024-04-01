select * from departments;

# 1990년 각 부서별 평균 salary
select d.dept_name, avg(s.salary) as avg_salary
from salaries as s
join dept_emp as de on s.emp_no = de.emp_no
join departments as d on de.dept_no = d.dept_no
where s.from_date >= '1990-01-01'
and s.to_date <= '1990-12-31'
group by d.dept_name;
