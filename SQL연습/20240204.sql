# 각 부서 부서장 평균 salary
select d.dept_name, avg(s.salary) as avg_dept_manager_salary
from departments as d
join dept_manager as dm on dm.dept_no = d.dept_no
join salaries as s on s.emp_no = dm.emp_no
group by d.dept_name;

select * from dept_manager;