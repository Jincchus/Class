# Customer Service 부서에서 급여를 50000 이상받은 직원의 이름과 급여를 모두 출력
select e.first_name, s.salary
from employees as e
join salaries as s on e.emp_no = s.emp_no
join dept_emp as de on de.emp_no = e.emp_no
join departments as d on de.dept_no = d.dept_no
where d.dept_name = 'Customer Service' and s.salary >= 50000;