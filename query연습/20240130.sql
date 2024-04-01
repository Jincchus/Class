select * from departments;

# 3월이 생일인 Research 부서의 남자 직원의 full name과 생일구하기(중복은 제거)
select distinct e.first_name, e.last_name, e.birth_date
from employees as e
join dept_emp as de on e.emp_no = de.emp_no
join departments as d on de.dept_no = d.dept_no
where d.dept_name = 'Research'
and month(e.birth_Date) = 3
and e.gender ='M';
