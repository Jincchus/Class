desc departments;
select * from departments;

desc dept_emp;
select * from dept_emp;

desc dept_manager;
select * from dept_manager;

desc employees;
select * from employees;

desc salaries;
select * from salaries;

desc titles;
select * from titles;

# dept_name 이 Finance(dept_no d002) 인 employees를 모두 조회하라
select * from employees
join dept_emp on employees.emp_no = dept_emp.emp_no
join departments on dept_emp.dept_no = departments.dept_no
where departments.dept_name = 'Finance';
