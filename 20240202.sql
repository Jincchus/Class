select * from departments;

# Marketing 부서와 Development 부서의 남자 부서원 수
select d.dept_name, count(distinct e.emp_no) as male_count
from employees as e
join dept_emp as de on e.emp_no = de.emp_no
join departments as d on de.dept_no = d.dept_no
where d.dept_name in ("Marketing", "Development")
  and e.gender = "M"
group by d.dept_name;
