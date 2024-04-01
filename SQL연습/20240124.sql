-- dept_emp중 퇴사한 사람만 출력하라.
SELECT * FROM dept_emp
WHERE to_date != '9999-01-01';

-- employees테이블과 dept_emp 테이블을 left join하여 
-- 성별이 남자인 정보 중에 이름과 성별 고용일을 10개만 출력하라
SELECT first_name,last_name,gender,hire_date 
FROM employees AS e
LEFT JOIN dept_emp AS d
ON e.emp_no = d.emp_no
WHERE gender = 'M' LIMIT 10;

-- 'employees' DB에 있는 'employees' 테이블과 'salaries' 테이블을 이용해서
--  생일이 6월인 직원들이 현재 받고 있는 급여의 평균을 구하시오.
select avg(salary)
from salaries
where emp_no in ((select emp_no from employees where month(birth_date)='06'));


-- employees database 에서
-- employees 테이블과 dept_manager 테이블에서 
-- emp_no 가 같은 사람들의 hire_date (채용일) / gender(성별) 
-- / concat(last_name,first_name) as "이름" (풀네임) 
-- 을 조회해서 출력하고싶음.

select hire_date,gender,birth_date, concat(last_name,first_name) as "이름" 
from employees
inner join dept_manager
on employees.emp_no = dept_manager.emp_no


-- 재직 중인 직원들 중 직종을 변경한 사람들의 이름들을 보여주세요
SELECT 
    a.first_name, a.last_name
FROM
    employees.employees a
        JOIN
    (SELECT 
        emp_no
    FROM
        employees.dept_emp
    WHERE
        emp_no IN (SELECT 
                emp_no
            FROM
                employees.dept_emp
            WHERE
                to_date > SYSDATE())
    GROUP BY emp_no
    HAVING COUNT(*) > 1) b
WHERE
    a.emp_no = b.emp_no;


#문제 1) 1960년 이후 태어난 employees의 이름(성_first name) 목록을 출력하시오
SELECT first_name FROM employees.employees WHERE date_format(birth_date, '%YY-%mm-%dd') >'19600101';

#문제 2) dept_manager에서 부서 번호의 끝자리가 9에 해당하는 emp_no를 출력하시오
SELECT emp_no FROM employees.dept_manager WHERE dept_no LIKE '%9';

#문제 3) 1980년도 이후 입사한 emp중 Engineer가 아닌 emp_no을 출력하시오
SELECT emp_no FROM employees.titles WHERE from_date > '19800101' AND title <> 'Engineer';
