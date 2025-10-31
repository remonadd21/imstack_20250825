-- (4) (+) null  값 붙여줄게 -- sql99이전

select *from dept;

select empno, ename, d.deptno, dname 
from   emp e, dept d
where  e.deptno(+) = d.deptno;



-- (5) right outer join
select empno, ename, d.deptno, dname
from emp e right outer join dept d on(e.deptno = d.deptno);


-- (6) right outer join
select empno, ename, d.deptno, dname
from dept d left outer join emp e on(e.deptno = d.deptno);


-- (7) full outer join
select empno, ename, d.deptno, dname
from dept d full outer join emp e on(e.deptno = d.deptno);

--------------------------------------------------------------------------------


-- 단일행(2073) 서브쿼리 select 안에 select
-- step1
-- 1. 평균급여보다 많이 받는 사람들 
--select ename, sal
--from emp
--where  sal > 2073 (평균급여)
--order by sal desc;

--step2)
select ename, sal
from emp
where sal > (select avg(sal)from emp)
order by sal desc;

-- 2. 다중행 (in)  deptno가 10인 부서의 job인 사원들의 ename, sal 조회
-- step1
select ename, sal
from emp
where job in (select job from emp where deptno=10)
order by sal desc;

--------------------------------------------------------------------------------

-- Q1. 사원이름이 jones인 사원의 급여 출력

select sal 
from emp 
where ename='JONES';


-- Q2. 급여가 2975보다 높은 사원 정보 출력하기
select *from emp where sal >2975;

-- Q003
--EMP 테이블에서 다음과 같이 출력하시오.
--JONES의 급여보다 높은급여를 받는 사원정보를 출력하시오.
-- 힌트)

SELECT *
FROM EMP
WHERE SAL > (SELECT SAL FROM EMP WHERE ENAME = 'JONES');


-- Q004
--EMP 테이블에서 다음과 같이 출력하시오.
--SCOTT보다 빨리 입사한 사원목록을 출력하시오.
-- 힌트)
SELECT    *
FROM      EMP
WHERE     hiredate <  (select hiredate from emp where ename = 'SCOTT' );




-- Q005
--EMP 테이블에서 다음과 같이 출력하시오.
--20번부서에 속한 사원 중
--전체사원의 평균급여보다 높은 급여를받는 사원정보와 소속부서정보를 출력하시오.
-- 힌트)
SELECT E.EMPNO, E.ENAME, E.JOB, E.SAL, E.DEPTNO, D.DNAME, D.LOC
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
  AND E.DEPTNO = 20
  AND E.SAL > (SELECT AVG(SAL) FROM EMP);



-- Q006
--EMP 테이블에서 다음과 같이 출력하시오.
--부서번호가 20이거나 30인 사원의 정보를 출력하시오.
--힌트)
SELECT    *
FROM      EMP
WHERE     DEPTNO  in (20, 30);



-- Q007
--EMP 테이블에서 다음과 같이 출력하시오.
--각 부서별 최고급여와 동일한 급여를 받는 사원정보를 출력하시오.

--힌트)
SELECT    *
FROM      EMP
WHERE    sal  IN  ( select  max(sal)from emp group by deptno );



--------------------------------------------------------------------------------

-- 3. 다중행 연산자
-- in 서브쿼리가 하나라도 일치하면 조회해주세요.
-- in 이 값이 목록에 있나요? deptno(10,20,30)
-- any, some 하나라도 만족하면 ok!                  ** 최소값 기준 비교
--      컬럼  > any(서브쿼리) 최소값 보다 크면 true
--      컬럼  < any(서브쿼리) 최대값 보다 크면 true
--        컬럼 > (1,2,3)    |(1)    |(2)    |(3)   :: 컬럼이 1또는 2또는 3또는 나열된 값들 중 하나라도 크면 만족함
--        컬럼 < (1,2,3)    |(1)    |(2)    |(3)   :: 컬럼이 1또는 2또는 3또는 나열된 값들 중 하나라도 작으면 만족함
    


-- all      "모두 만족해야 ok"                      ** 최대값 기준 비교
--      컬럼  > all(서브쿼리) 최대값 보다 크면 true
--              |(1)    |(2)    |(3)


--      컬럼  < all(서브쿼리) 최소값 보다 작으면 true
--              |(1)    |(2)    |(3)


--      중요  컬럼 > any 1(최소값 보다 크다),   컬럼  > all 3 (최대값 보다 크다)


-- exists  서브쿼리가 존재하면 ok                    

create table atest        as    select 1 num from dual
                    union all   select 2     from dual
                    union all   select 3     from dual
                    union all   select 4     from dual
                    union all   select 5     from dual
                    union all   select 6     from dual;

select * from atest;

-- 컬럼 > any 1 최소값 보다 크다, 최대값 보다 작다,   컬럼 > all 3 최대값 보다 크다 최소값 작다. 


select num  from atest where  num < any(select num from atest  where num in(3,4,5)) order by num; -- 최대값 5보다 작다 1 2 3 4
select num  from atest where  num > any(select num from atest  where num in(3,4,5)) order by num; -- 최소값 3보다 크다 4 5 6 
select num  from atest where  num < all(select num from atest  where num in(3,4,5)) order by num; -- 최소값 3보다 작다 1 2
select num  from atest where  num > all(select num from atest  where num in(3,4,5)) order by num; -- 5 보다 크다 6


--------------------------------------------------------------------------------


-- 다중행 in, any(some) 하나라도 있으면 참, all 모두, exists 있으면 참!
-- > ani (최소값 크다), 최대값 작다,   > all 3(최대값 크다) 최소값 작다.

-- Q8 부서별로 최대 급여 출력하기

select max(sal) from emp group by deptno; 

select * from emp
where sal in (select max(sal) from emp group by deptno);



-- Q9 any 연산자를 이용하여 출력하기
select * from emp
where sal = any(select max(sal) from emp group by deptno);


-- 10. some 연산자로 출력하기
select * from emp 
where sal = some(select max(sal) from emp group by deptno);


-- Q11. any 연산자 이용하여 30번 부서 사원들의 최대 급여보다 적은 급여 정보 사원 출력

select * from emp
where sal < any(select max(sal) from emp where deptno=30)
order by sal, empno;


-- Q12. 부서번호가 30인 사원들의 급여 출력하기
select sal from emp where deptno=30;


-- Q13. any를 이용하여 30번 부서 사원들의 최소 급여보다 많은 급여를 받는 사원 정보출력
select * from emp
where sal > any(select min(sal) from emp where deptno=30)
order by sal desc;


-- Q14. all을 이용하여 30번 부서 사원들의 최소급여보다 더 적은 급여를 받는 사원 정보 출력
select * from emp
where sal < all( select min(sal) from emp where deptno=30);

-- Q15. all을 이용하여 30번 부서 사원들의 최대 급여 보다 더 많은 급여를 받는 사원 정보 출력
select * from emp
where sal > all( select max(sal) from emp where deptno=30)
order by deptno desc;


-- Q16. exists 서브 쿼리에 결과 값이 하나이상 존재하면 조건식이 모두 grue 아니면 false가 됨
select * from emp 
where exists (select dname from dept where deptno=10);


-- Q17. exists 서브쿠리에 결과 값이 하나이상 존재하면 조건식이 모두 true 아니면 false
select *
from emp
where exists(select dname from dept where deptno=50);


--------------------------------------------------------------------------------

-- 다중 열 서브쿼리
select ename, deptno, job
from emp
where (deptno, job) in (select deptno, job from emp where sal>2000);


-- 인라인 뷰
select empno, ename, d.deptno, dname
from (select * from emp where deptno=20) e, (select * from dept) d
where e.deptno = d.deptno;


-- with (테이블 별칭을 미리 지정해서 사용할 수 있음)
with
e6 as ( select * from emp where deptno=30),
d6 as( select * from dept)
select empno, ename, d6.deptno, dname
from e6, d6
where e6.deptno = d6.deptno;

with  -- 별칭으로 지정한 테이블을 다시 쓸때는 또 지정해야 함!
e6 as (select * from emp where deptno=30)
select count(*) from e6;


-- 스칼라 서브쿼리
select  empno, ename, sal
        ,(select grade from salgrade where emp.sal between losal and hisal) salgrade
        ,deptno
        ,(select loc from dept where emp.deptno = dept.deptno) location
from    emp;

--------------------------------------------------------------------------------

-- Q18. 부서별 최대 급여를 받는 사원정보 출력

select * from emp where(deptno, sal) in (select deptno, max(sal)
from emp group by deptno );

-- Q19. 인라인 뷰를 이용 from 절에서 사용하는 부서번호가 10인 사용자 정보와 부서 정보를 가져와
-- empno, ename, deptno, dname, loc 출력하기

select empno, ename, d.deptno, dname, loc 
from (select * from emp where deptno=10) e, (select * from dept) d
where e.deptno = d.deptno;


select empno, ename, d.deptno, dname, loc 
from emp e join dept d on e.deptno = d.deptno
where e.deptno=10;

select empno, ename, deptno, dname, loc 
from emp join dept  using(deptno)
where deptno=10;


select empno, ename, deptno, dname, loc 
from emp  natural join dept
where deptno=10;



-- Q20. with 이용 emp테이블에서 부서번호가 10인 사원의 정보, dept의 모든 정보 출력

with
e1 as (select * from emp where deptno=10),
d1 as (select * from dept)
select empno, ename, d1.deptno, dname, loc
from e1, d1
where e1.deptno = d1.deptno;



-- Q21, empno, ename, job, sal, salgrade 등급 구하고, deptno를 이용 deptno가 
-- 같은 부서명 (dname)을 구하시오.

select empno, ename, job, sal
,(select grade from salgrade where e.sal between losal and hisal) salgrade
, deptno, 
(select dname from dept where e.deptno = dept.deptno) dname
from emp e;



--------------------------------------------------------------------------------

-- ex001 전체 사원중 allen과 같은 직책job 인 사원들의 사원정보, 부서정보 출력하기

SELECT  JOB, EMPNO, ENAME, SAL, D.DEPTNO, DNAME
FROM    EMP E, DEPT D
WHERE   E.DEPTNO = D.DEPTNO  
AND JOB = (SELECT JOB FROM EMP WHERE ENAME='ALLEN');



SELECT  JOB, EMPNO, ENAME, SAL, D.DEPTNO, DNAME
FROM    EMP E JOIN DEPT D
ON  (E.DEPTNO = D.DEPTNO)  
WHERE JOB = (SELECT JOB FROM EMP WHERE ENAME='ALLEN');


SELECT  JOB, EMPNO, ENAME, SAL, DEPTNO, DNAME
FROM    EMP  JOIN DEPT USING  (DEPTNO)  
WHERE JOB = (SELECT JOB FROM EMP WHERE ENAME='ALLEN');


SELECT  JOB, EMPNO, ENAME, SAL, DEPTNO, DNAME
FROM    EMP  JOIN DEPT USING  (DEPTNO)  
WHERE JOB IN (SELECT JOB FROM EMP WHERE ENAME='ALLEN');



WITH
ALLEN_JOB AS (SELECT JOB FROM EMP WHERE ENAME='ALLEN')
SELECT  JOB, EMPNO, ENAME, SAL, DEPTNO, DNAME
FROM    EMP E JOIN DEPT D  USING(DEPTNO)
              JOIN ALLEN_JOB USING(JOB);
              
              
              
SELECT  JOB, EMPNO, ENAME, SAL, DEPTNO, DNAME
FROM    EMP E  JOIN DEPT D USING  (DEPTNO)  
WHERE EXISTS (SELECT 1 FROM EMP A WHERE A.ENAME='ALLEN' AND A.JOB=E.JOB);


--EX002
--EMP 테이블에서 다음과 같이 출력하시오.
--전체 사원의 평균급여(SAL) 보다 높은 급여를 받는 사원들의 사원정보, 부서정보, 급여등급정보를 출력하시오.
--급여가 많은 순으로 정렬하되 급여가 같은경우에는 사원번호를 기준으로 오름차순으로 정렬

--힌트)
--SELECT   JOB, EMPNO,DNAME  , HIREDATE , LOC, SAL, GRADE
--FROM      EMP E, DEPT D, SALGRADE S
--WHERE     JOIN 조건,     
--AND       평균급여(SAL) 보다 높은 급여를 받는 사원들
--ORDER    BY    급여가 많은 순으로 정렬 , 사원번호를 기준으로 오름차순

SELECT  JOB, EMPNO,DNAME  , HIREDATE , LOC, SAL, GRADE
FROM    EMP E, DEPT D, SALGRADE S
WHERE   E.DEPTNO = D.DEPTNO AND E.SAL BETWEEN S.LOSAL AND S.HISAL
AND     E.SAL >(SELECT AVG(SAL) FROM EMP) 
ORDER   BY SAL DESC, EMPNO; 


SELECT  JOB, EMPNO,DNAME  , HIREDATE , LOC, SAL, GRADE
FROM    EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO)
        JOIN SALGRADE S ON (E.SAL BETWEEN S.LOSAL AND S.HISAL)
WHERE     E.SAL >(SELECT AVG(SAL) FROM EMP) 
ORDER   BY SAL DESC, EMPNO; 


WITH    AVG_SAL (AVG_SAL) AS (SELECT AVG(SAL) FROM EMP)
SELECT  E.JOB, E.EMPNO,D.DNAME  , E.HIREDATE , D.LOC, E.SAL, S.GRADE
FROM    EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO)
              JOIN SALGRADE S ON (E.SAL BETWEEN S.LOSAL AND S.HISAL)
              JOIN AVG_SAL A ON E.SAL > A.AVG_SAL
ORDER   BY SAL DESC, EMPNO; 



SELECT  JOB, EMPNO,DNAME  , HIREDATE , LOC, SAL, GRADE
FROM    EMP E  JOIN DEPT D      ON (E.DEPTNO = D.DEPTNO )
               JOIN SALGRADE S  ON ( E.SAL  BETWEEN  S.LOSAL AND S.HISAL)
WHERE   EXISTS (     
    SELECT 1  FROM  EMP X   WHERE  E.SAL > (  SELECT AVG(SAL) FROM EMP )
)  
ORDER   BY  SAL  DESC, EMPNO;



--EX003
--EMP 테이블에서 다음과 같이 출력하시오.
--10번부서에서 근무하는 사원 중 
--30번부서에는 존재하지 않는 직책을 가진 사원들의 사원정보, 부서정보를 다음과 같이 출력하는 SQL문을 작성하시오.

--힌트)
--SELECT    EMPNO, ENAME, JOB, DEPTNO, DNAME, LOC
--FROM      EMP E, DEPT D 
--WHERE     JOIN 조건
--AND    10번부서에서
--AND    JOIN NOT IN(30번부서에는 존재하지 않는 직책 )


SELECT EMPNO, ENAME, JOB, D.DEPTNO, DNAME, LOC
FROM   EMP E , DEPT D
WHERE  E.DEPTNO = D.DEPTNO AND E.DEPTNO =10 AND JOB NOT IN(SELECT JOB FROM EMP WHERE DEPTNO=30);


SELECT EMPNO, ENAME, JOB, D.DEPTNO, DNAME, LOC
FROM   EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO) 
WHERE E.DEPTNO=10 AND JOB NOT IN(SELECT JOB FROM EMP WHERE DEPTNO=30);


WITH JOB_IN_3O AS (SELECT JOB FROM EMP WHERE DEPTNO=30)
SELECT EMPNO, ENAME, JOB, D.DEPTNO, DNAME, LOC
FROM   EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO) 
WHERE E.DEPTNO=10 AND JOB NOT IN(SELECT JOB FROM JOB_IN_3O);




SELECT EMPNO, ENAME, JOB, D.DEPTNO, DNAME, LOC
FROM   EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO) 
WHERE E.DEPTNO=10
AND NOT EXISTS(
    SELECT 1 FROM EMP X WHERE X.DEPTNO=30 AND X.JOB=E.JOB
);


--EX004
--EMP 테이블에서 다음과 같이 출력하시오.
--직책이 SALESMAN인 사람들의 최고급여보다 높은 급여를 급여를 받는 사원들의 사원정보, 급여등급정보를 다음과 같이 출력하시오.
--다중행 함수 사용하지 않는 방법 (IN, ANY, ALL, EXISTS), 다중행 함수 사용하는 방법 2가지로 작성하시오.
--사원번호를 기준으로 오름차순으로 정렬하시오.
--힌트)
--SELECT    EMPNO, ENAME,SAL, GRADE
--FROM      EMP E, SALGRADE
--WHERE     JOIN 조건
--AND       직책이 SALESMAN인 사람들의 최고급여보다 높은 급여를 급여
--ORDER BY  EMPNO;

--힌트1)  애니1 올3 
--필드 >ANY 1   최소보다 크다, 최대보다 작다        > ALL 3  최대보다 크다, 최소보다 작다

SELECT     EMPNO, ENAME,SAL, GRADE
FROM       EMP E , SALGRADE S
WHERE      E.SAL BETWEEN S.LOSAL AND S.HISAL
AND        SAL > (SELECT MAX(SAL) FROM EMP WHERE JOB='SALESMAN')
ORDER BY EMPNO;




SELECT     EMPNO, ENAME,SAL, GRADE
FROM       EMP E , SALGRADE S
WHERE      E.SAL BETWEEN S.LOSAL AND S.HISAL
AND        SAL > ALL (SELECT SAL FROM EMP WHERE JOB='SALESMAN')
ORDER BY EMPNO;


