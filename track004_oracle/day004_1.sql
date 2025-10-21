select * from emp;

-- 집계 sum, max, min, avg, count
select sum(sal) from emp; --급여의 합계
select sum(comm) from emp; -- null 값이 있어도 계산가능

-- sal은 14줄이고, 다른 값은 한줄이기 때문에 줄 수가 맞지 않아 출력이 되지 않음
select sal, sum(sal), max(sal), min(sal), avg(sal), count(sal) from emp;        -- error

select sum(sal) 합, max(sal) 최대, min(sal) 최소, round(avg(sal),2) 평균, count(sal) 갯수 from emp;

-- group by

-- select  --5
-- from    --1
-- where   --2
-- group by   -- 3 그룹핑
-- having     -- 4 그룹핑안에서 조건
-- order by;  -- 6


select deptno, sum(sal)
from emp
group by deptno;  -- 부서별 그룹핑의 합  

-- having (합계를 구했을때 9000 이상인 그룹)

select deptno, sum(sal), max(sal), count(*)
from emp 
group by deptno
having sum(sal) >= 9000;

--------------------------------------------------------------------------------
https://sally03915.github.io/stackventure_250825/004_oracle/oracle005_select_group#14
--------------------------------------------------------------------------------

-- Q1. sum함수를 이용하여 급여 합계 출력
select sum(sal) from emp;

-- Q2. sum 함수를 이용하여 사원이름과 급여 합계의 에러가 나는 이유는 조회되는 필드의 갯수가 다르기 때문

-- Q3. sum 함수를 이용하여 추가수당 합계 구하기

select sum(comm) from emp;

-- Q4. sum, distinct, all 함수를 이용하여 조회하기

select sum(distinct  sal), sum(all sal), sum(sal) 
from emp;


-- Q5. count 를 이용하여 데이터 갯수 구하기
select count(*) from emp;


-- Q6. 부서번호가 deptno 30인 데이터 갯수 구하기
select count(*) from emp where deptno=30;


-- Q7. count (distinct, all)을 이용하여 조회하기

select count(distinct sal), count(all sal), count(sal)
from emp;


-- Q8. count를 이용하여 추가수당 comm열의 갯수 구하기
select count(comm)
from emp;


-- Q9. count를 이용하여 comm열의 갯수 구하기
select count(comm)
from emp
where comm is not null;


-- Q10. max를 이용하여 부서번호가 deptno 10번인 사원들의 최대 급여 출력
select max(sal)
from emp where deptno=10;


-- Q11. 부서번호가 deptno 10인 사원들의 최소 급여 출력
select min(sal)
from emp where deptno=10;


-- Q12. 부서번호가 20인 사원의 입사일중 제일 최근 입사일 출력하기
select max(hiredate)
from emp
where deptno=20;

-- Q13. 부서번호가 20인 사원이 입사일중 제일 오래된 입사일 출력하기
select min(hiredate)
from emp
where deptno=20;


-- 014. 부서번호가 30인 사원의 평균 급여 구하기
select avg(sal)
from emp
where deptno=30;

-- Q15. 부서번호가 30인 사원의 distinct로 중복제거한 급여의 평균 조회하기
select avg(distinct sal)
from emp
where deptno=30;


-- Q16. union all 을 사용하여 각 부서별 평균 급여 출력하기
select avg(sal) , '10' deptno from emp where deptno=10
union all
select avg(sal) , '20' deptno from emp where deptno=20
union all
select avg(sal) , '30' deptno from emp where deptno=30;

-- Q17 group by 이용하기

SELECT deptno, AVG(sal) FROM emp
group by deptno;


-- Q18. 부서번호 deptno 직책별 job 평균 sal 조회하기
select deptno, job, avg(sal)
from emp
group by deptno, job
order by deptno;


-- Q19. ename, deptno, avg(sal) 계산되는 열과 갯수가 맞지 않음 에러발생

-- Q20. group by  having 각 부서의 직책별 평균 급여, 그 평균 급여가 2000이상인 그룹 출력

select deptno, job, avg(sal) 
from emp
group by deptno, job
having
avg(sal)>= 2000
order by deptno, job;

-- Q21. order by detno, job 중 어떤 기준으로 정렬해야 되는지 오름차순인지 내림차순인지 정렬 쿼리가 잘못 작성됨

-- Q22. having 절만 사용하여 출력하기
select deptno, job, avg(sal) 
from emp
group by deptno, job
having avg(sal)> 2000
order by deptno desc;



-- Q23. where 절만 사용하여 출력하기
select deptno, job, avg(sal) 
from emp
where sal<=3000
group by deptno, job
having avg(sal) >=2000
order by deptno, job;


-- Q24. 부서별 , 직책의 사원수, 가장 높은 급여, 급여의 함, 평균 급여 출력하기
select deptno, job, count(*), max(sal), sum(sal), avg(sal)
from emp
group by deptno, job
order by deptno asc;









