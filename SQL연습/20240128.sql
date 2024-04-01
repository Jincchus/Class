select * from titles;

# 성별이 남자인 직원 중 Engineer(engineer라면 직급이 어떻든 모두 포함)인 직원의 번호, 이름, 성과 부서 조회하여 부서별로 정렬
select e.emp_no, e.first_name,e.last_name, d.dept_name, t.title
from employees as e
join dept_emp as de on e.emp_no = de.emp_no
join departments as d on d.dept_no = de.dept_no
join titles as t on t.emp_no = e.emp_no
where e.gender = 'M' and t.title like '%engineer%'
order by d.dept_name;