select * from departments;
# 각 부서별 1990년 1월 1일 이후 입사한 인원수
select d.dept_name, count(distinct e.emp_no) as 입사인원수
from departments as d
join dept_emp as de on d.dept_no = de.dept_no
join employees as e on de.emp_no = e.emp_no
where e.hire_date >= '1990-01-01'
group by d.dept_name;