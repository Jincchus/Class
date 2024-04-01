select * from dept_manager;

#1991년 01월 01일 이후 입사한 사람 중 부서장으로 근무하고 있는 사람의 정보와 근무 부서를 구하라
select e.*, d.dept_name
from dept_manager as dm
join employees as e on e.emp_no = dm.emp_no
join departments as d on d.dept_no = dm.dept_no
where e.hire_date >= '1991-01-01';
