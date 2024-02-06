select * from dept_manager;

# 90년대 부서장 title별 인원 수
select t.title, count(*) as 인원수
from dept_manager as dm
join titles as t on dm.emp_no = t.emp_no
where dm.from_date >= '1990-01-01' and dm.to_date <= '1999-12-31'
group by t.title;
