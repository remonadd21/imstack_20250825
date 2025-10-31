-- 1. 모든 필드 조회

select * from emp;

-- 2. 집계함수 - sum, count, max, min, avg
select sum(sal) from emp;

-- 3. 부서의 직업별 급여의 평균
select deptno,job, avg(sal) 
from emp
group by deptno, job;

-- 4. where vs Having [급여의 평균] 에서 2000이상

select deptno,job, avg(sal) 
from emp
where sal >=1500  -- 전체 데이터에서 필터링
group by deptno, job
having avg(sal) >2000; -- having은 집계 함수에서 사용
--------------------------------------------------------------------------------

-- 5. rollup, cube, grouping sets / pivot, unpivot
-- 부서의 직업별, 인원수와 급여의 평균
-- rollup, 10부서의 직업별 급여 평균 / 20부서의 직업별 급여 평균 / 30부서의 직넙별 급여 평균
-- rollup : 작은 것에서 부터 큰 값으로 출력되어짐
select deptno, job, count(*), round(avg(sal),1)
from emp
group by rollup(deptno, job);


-- cube
-- cube: dptno + job전체 총계 , job총게, deptno 총계, deptno+job 각각의 세부내용
-- rollup은 작은것에서 큰 것으로 조회된다면 cube는 큰 것을 먼저 보고 작은 값으로 조회된다.
-- rollup과 cube는 group by에서 사용된다.

select deptno, job, count(*), round(avg(sal),1)
from emp
group by cube(deptno, job);


-- grouping
-- 해당 컬럼이 그룹화 되어 있는지 확인할때, 1은 그룹화되지 않음, 0은 그룹화가 되어짐!
-- 그룹핑은 어떤 것으로 묶여있는지 확이나. null 1은 null로 묶이지 않았다.  
-- 10, clerk의 0 0은 deptno와 job으로 그룹핑 되었다는 뜻

select deptno, job, grouping(deptno), grouping(job) 
from emp
group by cube(deptno, job);


-- pivot 사용법
-- 행 데이터를 열로 바꿔서 출력 해줌
-- select *
-- from ( select  컬럼1, 컬럼2, 집계대상 컬럼 from 테이블명 )  -- 원본 데이터 : pivot 적용할 대상
-- pivot( 집계함수(집계 대상 컬럼 for 컬럼기준 in (값1, 값2, 값3,,,)))  --  집계 함수 : 어떤 컬럼 기준으로 만들 것인지 지정

-- job별  부서 10,20,30의 최대 급여
select *
from (select deptno, job, sal from emp )
pivot( max(sal) for deptno in(10,20,30));


-- 직무별 부서별 사원서 job별 부서, 10,20,30의 사원수

select *
from ( select job, deptno, empno from emp )
pivot (  count(empno) for deptno in(10,20,30));


-- 직무별 직무 평균 급여
select * 
from ( select deptno ,job, sal from emp)
pivot( avg(sal) for job in('CLERK','MANAGER','SALESMAN'));


-- unpivot 열 데이터를 행으로 출력
-- select *
-- from () -- 원본 데이터 unpivot을 적용할 대상 열 형태로 집계된 테이터
-- unpivot (); -- unpivot 열을 행으로 변환하여, 기준 컬럼 열이름이었던 것을 행으로 변환



-- decode(기준필드, 찾을값, 결과필드)
-- decode(job, 'MANAGER', sal) , job필드기준 manager의 급여 확인

select *
from (
    select deptno,  max(decode(job,'CLERK', sal)) CLERK, 
                    max(decode(job,'MANAGER',sal)) MANAGER
    from emp 
    group by deptno
)
unpivot(
    sal for job in(CLERK,MANAGER )
    );

--------------------------------------------------------------------------------------
-- https://sally03915.github.io/stackventure_250825/004_oracle/oracle005_select_group#14
--------------------------------------------------------------------------------------

-- Q25. rollup 함수를 이용하여 부서별 큰 그룹, 직책 소그룹의 사원수, 가장 높은 급여, 급여의 합, 평균 급여 조회하기

select deptno, job, count(*), max(sal), sum(sal), avg(sal)
from  emp
group  by rollup(deptno, job);


-- Q26. 부서별 (큰그룹) 직책(소그룹)의 사원수, 가장 높은 급여, 급여의 합, 평균 급여를 출력하시오.

select deptno, job, count(*), max(sal), sum(sal), avg(sal)
from emp
group by cube(deptno, job);


-- Q27 deptno를 먼저 그룹화 하고, rollup 함수에 job을 지정하여 사원수 출력하기
select deptno, job, count(*) 
from emp
group by deptno, rollup(job);


-- Q28. job을 먼저 그룹화하고 rollup 함수에서 deptno를 지정하여 사원수 출력하기
select deptno, job, count(*)
from emp
group by job , rollup(deptno);


-- Q29 grouping sets (deptno, job) 함수를 사용하여 열별 그룹으로 묶어서 조회하기
select deptno, job, count(*)
from emp
group by grouping sets((deptno),(job));


-- Q30. deptno job열의 그룹화결과를 grouping 함수로 출력하기
select deptno, job, count(*), max(sal), sum(sal), avg(sal), grouping(deptno), grouping(job)
from emp
group by cube(deptno, job);



-- Q31. decode문으로 grouping 함수를 적용하여 결과를 표기하기
--- decode에서 1은 null 값을 의미, (기준 값, null(1) 찾아서, 바꿔주기)
select decode(grouping(deptno),1,'ALL_DEPT',to_char(deptno)) deptno, decode(grouping(job),1,'ALL_JOB',job), count(*), max(sal), sum(sal) ,avg(sal) 
from emp
group by rollup(deptno, job)
order by deptno, job;



-- Q32. deptno, job을 함께 명시한 grouping_id 함수를 사용하시오.
select deptno, job, count(*), sum(sal), grouping(deptno), grouping(job)
from emp
group by cube(deptno, job)
order by deptno,job;


-- Q33. group by로 부서번호와 사원 이름 출력
select deptno , ename 
from emp
group by(deptno, ename);

-- Q34. listagg (나열할 열 , 구분자)

SELECT deptno, LISTAGG(ename,', ') within group( order by sal desc ) enames
FROM emp
GROUP BY deptno;


-- Q35. 부서, 직책별, 그룹화하여 최고급여 데이터 출력하기
select deptno, job, max(sal) 
from emp
group by deptno, job
order by deptno, job;

-- Q36. pivot 함수를 사용하여 직책별 * 부서별 최고급여를 2차원 표 형태로 출력

select *
from (select deptno, job,sal from emp )
pivot (max(sal) for deptno in (10,20,30));


-- Q37. pivot 함수를 사용하여 부서별, 직책별 최고 급여를 2차원 표 형태로 출력하기
select * 
from(select deptno, job, sal from emp )
pivot(max(sal) for job in ('SALESMAN','CLERK','PRESIDENT','MANAGER','ANALYST'));


-- Q38. decode를 사용하여 pivot 함수와 같은 결과 출력하기
--select decode(job,'SALESMAN',max(sal)) SALESMAN, decode(job,'CLERK',max(sal)) CLERK,
--       decode(job,'PRESIDENT',max(sal)) PRESIDENT,decode(job,'MANAGER',max(sal)) MANAGER,
--       decode(job,'ANALYST',max(sal))
--from emp
--group by job;

select deptno
    ,max(decode(job,'CLERK', sal)) CLERK
    ,max(decode(job,'SALESMAN', sal)) SALESMAN
    ,max(decode(job,'PRESIDENT', sal)) PRESIDENT
    ,max(decode(job,'MANAGER', sal)) MANAGER
    ,max(decode(job,'ANALYST', sal)) ANALYST
from emp
group by deptno;

-- Q39. unpivot 활용하여 열로 구분된 그룹을 행으로 만들기

select *
from(
    select deptno
        ,max(decode(job,'CLERK', sal)) CLERK
        ,max(decode(job,'SALESMAN', sal)) SALESMAN
        ,max(decode(job,'PRESIDENT', sal)) PRESIDENT
        ,max(decode(job,'MANAGER', sal)) MANAGER
        ,max(decode(job,'ANALYST', sal)) ANALYST
    from emp
    group by deptno
)

unpivot( sal for job in(CLERK,SALESMAN,PRESIDENT,MANAGER,ANALYST))
order by deptno,sal;

-----------------------------------------------------------------------------------------

-- ex1 부서번호, 평균급여, 최고급여, 최저급여 사원수를 조회하기
-- 평균 급여 출력시 소수점 제외하고, 각 부서별로 출력하기

select deptno, trunc(avg(sal)), max(sal), min(sal), count(*)
from emp
group by deptno;


-- ex2 같은 직책에 종사하는 사원이 3명 이상인 직책과 인원수 출력하기
select job, count(*) from emp 
group by job 
having count(*)>=3
order by count(*) desc, job desc;


-- ex3. 사원들의 hire_year을 기준으로 부서별 몇명이 입사했는지 조회하기
select to_char(hiredate,'YYYY'), deptno, count(deptno) 
from emp 
group by to_char(hiredate,'YYYY'), deptno
order by deptno desc;


select to_char(hiredate, 'YYYY'), deptno, count(*) as cnt
from  emp
group by to_char(hiredate, 'YYYY'), deptno
order by deptno,to_char(hiredate, 'YYYY');


-- ex4. 추가 수당을 받는 사원수와 받지 않는 사원수를 조회하기
select 
    case 
        when comm is null then 'X'
        else 'O'
        end comm, count(*)
from emp
    group by
        case 
        when comm is null then 'X'
        else 'O'
        end;
        

select nvl2(comm,'O','X') , count(*)
from emp
group by nvl2(comm,'O','X');

// decode (기준 값, 조건, 맞으면 처리, 아니면 처리)
select decode(comm,null,'x','o') , count(*) cnt
from emp
group by decode(comm,null,'x','o');


select case when comm is null then 'X' else 'O' end comm, count(*)
from emp
group by case when comm is null then 'X' else 'O' end;

        
-- ex5. 각 부서의 입사연도별 사원수, 최고급여, 급여합, 평균급여 출력
-- 각 부서별 소계와 총계 출력 rollup


select deptno, to_char(hiredate,'YYYY'), count(*), max(sal), sum(sal), round(avg(sal),2)
from emp
group by rollup(deptno, to_char(hiredate,'YYYY'));


