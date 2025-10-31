-- 1. JOIN
-- 여러테이블을 한개의 데이블처럼 사용하는 것
-- 공통컬럼 기준으로 연결
-- 1-1. 등가조인  (=)   : 매칭되는 행.           where 절       emp.deptno = dept.deptno
--      비등가조인(= X) :                 sal  between  losal  and  hisal
--      자체조인       :   emp e1, emp e2
-- 1-2. outer join    :  매칭되지 않은 행도 포함.  left, right, full outer join

-- ERD : Entity(테이블) , Relationship(관계) , diagram(표)
--       Entity(테이블) , Relationship(관계) , Attribute(속성)

-- #1. 내부 조인 (등가조인)
select *
from   emp e, dept  d
where  e.deptno = d.deptno;   -- 14 * 4 = 56

select *
from   emp e  JOIN dept  d   on( e.deptno = d.deptno); 

select *
from   emp e  JOIN dept  d   using( deptno ); 

select *
from   emp  e  natural join dept d;


-- 1. emp e , dept d별명  / empno, ename , deptno, dname
select  empno, ename, e.deptno, dname
from    emp e, dept d  
where   e.deptno = d.deptno;

select  empno, ename, e.deptno, dname
from    emp e  join dept d   on(  e.deptno = d.deptno );

select  empno, ename, deptno, dname
from    emp e  join dept d   using(  deptno );

select  empno, ename, deptno, dname
from    emp e  natural join dept d;


-- https://sally03915.github.io/stackventure_250825/004_oracle/oracle006_select_join#14
-- Q1~8


-- Q1. emp, dept 테이블을 이용하여 from 절에 여러 테이블을 선언해아 출력하기
select * from emp, dept order by empno;


-- Q2. emp, dept 테이블을 이용, deptno가 같은 데이터 출력
select * from emp, dept where emp.deptno = dept.deptno; 

select * from emp join dept on(emp.deptno = dept.deptno)
order by empno;

select * from emp join dept using(deptno)
order by empno;

select * from emp natural join dept 
order by empno;


-- Q3. emp 테이블 e, dept d 별칭 이용하여 조회
select * from emp e, dept d where e.deptno = d.deptno; 

select * from emp e join dept d on(e.deptno = d.deptno)
order by empno;

select * from emp e join dept d using(deptno)
order by empno;


select * from emp e natural join dept d
order by empno;


-- Q4. deptno는 같으나 누구의 것인지 알수 없어서 에러가 발생함




-- Q5. emp, dept 열 이름에 각각의 테이블 이름도 함께 명시시 다음과 같이 출력하기
select empno, ename, dname, loc from emp e, dept d 
where e.deptno=d.deptno
order by e.deptno, d.deptno;



-- Q6. 급여가 3000 이상인 사원의 사원번호, 이름, 급여, 근무 부서를 출력하기
select empno, ename, sal, e.deptno, dname, loc from emp e, dept d
where e.deptno = d.deptno and sal>=3000;


-- join on
select empno, ename, sal, e.deptno, dname, loc from emp e join dept on(sal>=3000);

-- join using
select empno, ename, sal, deptno, dname, loc from emp
join dept using(deptno) 
where sal>=3000;


-- natural join

select empno, ename, sal, deptno, dname, loc from emp e natural join dept 
where sal>=3000;



-- Q7. emp, salgrade, emp테이블의 급여가 salgrade 필드의 최소급여와 최대급여에서 어느 등급인지 표현하기

select * from emp e, salgrade s where e.sal>= s.losal and e.sal <= s.hisal;

select * from emp e, salgrade s where e.sal between s.losal and s.hisal;

-- join on

select * from emp e join salgrade s on (e.sal>= s.losal and e.sal <= s.hisal);
select * from emp e join salgrade s on e.SAL between s.LOSAL and s.HISAL;


-- natural on은 겹치는 필드가 필요한데 emp와 salgrade는 겹치는 필드가 없어서 join on 불가

-- natural join
select * from emp e natural join salgrade s where e.SAL between s.LOSAL and s.HISAL;

-- Q8. emp 테이블을 2번 사용하여 empno, ename, mgr과 직속상관 empno, emname 사원번호를 출력하기

select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1, emp e2
where e1.mgr = e2.empno
order by e1.mgr, e2.empno;


-- join on
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1 join emp e2
on( e1.mgr = e2.empno)
order by e1.mgr, e2.empno;



-- 같은 필드가 없어서 join using, natural join 불가

--------------------------------------------------------------------------------

-- 2. 외부조인 (매칭되지 않는 것들도 조인)

select *from dept;  -- deptno 40까지 있음
select *from emp;   -- deptno 30까지 있음


-- 1) (+) 오라클에서만 존재, 조건에 (+) 사용
select ename, dname
from emp e, dept d
where e.deptno = d.deptno(+); -- emp 테이블 보장, dept 테이블에서 모자란 데이터 null로 채움


select ename, dname
from emp e, dept d
where e.deptno(+) = d.deptno; -- dept 테이블 보장, emp 테이블에서 모자란 데이터 null로 채움


-- 2) left join, right join

select ename, dname
from emp e inner join dept d on(e.deptno = de.deptno); -- inner join 내부조인, 겹치는 값들만


select ename, dname
from emp e right outer join dept d on(e.deptno = d.deptno); -- right 쪽에 있는 테이블 보장

select ename, dname
from dept d left outer join emp e on(e.deptno = d.deptno); -- left 쪽에 있는 테이블 보장


-- 3) full outer join
select ename, dname
from emp e full outer join dept d
on e.deptno = d.deptno;

-- 비표준 = , (+)
-- 표준 , natural join, join on, join using, left join, right join full join

-------------------------------------------------------------------------------------------

-- Q9 emp 테이블 2번 사용 사원정보 empno, ename, mgr, 직속상관 empno ename 의 사원 번호를 출력하기
-- 직속상관이 없는 사원의 정보도 출력

-- (+) null 값을 가지고 있다는 의미

select e1.empno, e1.ename, e1.mgr , e2.empno, e2.ename
from emp e1 , emp e2
where e1.empno = e2.empno(+)
order by e1.empno asc;

-- Q10 . 직속상관의 테이블은 보장하고, 사원정보의 테이블에서 모자란 데이터들을 채움

-- Q11. emp, dept 테이블 사용, empno, ename, job, mgr, hiredate, sal, comm 
-- natural join 조인으로 출력하기 이름과 자료형이 같은 열을 찾아 등가 조인으로 출력

select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm deptno, d.dname, d.loc from emp e natural join dept d 
order by deptno, e.empno;

-- Q12. emp dept 테이블 이용하여 empno, ename, job, mgr, hiredate, sal, comm , join using으로 풀어주기

select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm deptno, d.dname, d.loc from emp e join dept d
using(deptno) where e.sal>=3000 order by empno asc;

-- Q13. emp dept 테이블 이용하여 empno, ename, job, mgr, hiredate, sal, comm , join on으로 풀어주기

select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm deptno, d.dname, d.loc from emp e join dept d
on (e.deptno = d.deptno)where sal<=3000 order by loc desc;


-- Q14, left outer join으로 문제 풀기, emp, dept 테이블 사용
select 31.empno, e1.ename, e1.mgr, e2.empno, e2.ename from emp e1 left outer join emp e2 on (e1.mgr = e2.empno)
order by e1.empno;


-- Q15, right outer join으로 문제 풀기, emp, dept 테이블 사용
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename from emp e1 right outer join emp e2 on (e1.mgr = e2.empno)
order by e1.empno asc;


-- Q16. full outer join
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename from emp e1 full outer join emp e2 on (e1.mgr = e2.empno)
order by e1.empno asc;

---------------------------------------------------------------------------------------------------------------

-- ex001. emp, dept 테이블 이용하여 급여 2000 초과인 사원들의 부서정보, 사원정보 출력하기

select *from emp;
select *from dept;

-- SQL99 이전 방식 == (+)

-- 사고확장(연습문제)
--EX001
--EMP, DEPT 테이블을 이용하여
--SQL-99 이전 방식다음 , SQL-99방식 두가지 방식으로 다음과 같이 출력하시오.
--급여(SAL)이 2000초과인 사원들의 부서정보, 사원정보를 출력하시오.
--SQL-99 이전   =    (+)

SELECT   D.DEPTNO , DNAME, EMPNO, ENAME, SAL
FROM     DEPT D, EMP E
WHERE    D.DEPTNO = E.DEPTNO   AND  SAL > 2000;


--힌트)
--SELECT   DEPTNO , DNAME, EMPNO , ENAME, SAL
--FROM     DEPT D , EMP E
--WHERE    위의 두 테이블에서 DEPTNO 가 같다면    AND   급여가(SAL) > 2000
--SQL-99  이후     inner join , left outer join , right outer join, full outer join 
SELECT   D.DEPTNO , DNAME, EMPNO, ENAME, SAL
FROM     DEPT D  JOIN EMP E  ON(D.DEPTNO = E.DEPTNO )
WHERE    SAL > 2000;

SELECT   DEPTNO , DNAME, EMPNO, ENAME, SAL
FROM     DEPT    JOIN EMP    USING( DEPTNO   )
WHERE    SAL > 2000;

SELECT   DEPTNO , DNAME, EMPNO, ENAME, SAL
FROM     DEPT   NATURAL JOIN EMP    
WHERE    SAL > 2000;




-- ex002. 각 부서별 평균급여, 최대급여, 사원수 출력하기
select d.deptno, d.dname , trunc(avg(e.sal)), max(e.sal), min(e.sal), count(*)
from dept d, emp e
where d.deptno = e.deptno
group by d.deptno, dname;


--SQL-99  이후     inner join , left outer join , right outer join, full outer join 

select d.deptno, d.dname , trunc(avg(e.sal)), max(e.sal), min(e.sal), count(*)
from dept d join emp e
on d.deptno = e.deptno
group by d.deptno, d.dname;


select deptno, dname , trunc(avg(sal)), max(sal), min(sal), count(*)
from dept  join emp  using(deptno)
group by deptno, dname;


select deptno, dname , trunc(avg(sal)), max(sal), min(sal), count(*)
from dept natural join emp 
group by deptno, dname;



-- ex003. 모든 부서정보와 사원 정보를 부서번호, 사원이름 순으로 출력하기
-- (+) null 값을 보장한다는 의미
select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal 
from dept d ,emp e 
where d.deptno = e.deptno(+)
order by d.deptno, e.ename;

--SQL-99  이후     inner join , left outer join , right outer join, full outer join 

select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal 
from dept d left outer join emp e on (d.deptno = e.deptno)
order by d.deptno, e.ename;



select deptno, dname, empno, ename, job, sal 
from dept  left outer join emp using (deptno)
order by deptno, ename;


select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal 
from emp e right outer join dept d  on (d.deptno = e.deptno)
order by d.deptno, e.ename;




-- ex004. 모든 부서정보와 사원정보, 급여등급 정보, 각사원의 직속상관의 정보를 
-- 부서번호, 사원번호 순으로 정렬하시오.

select * from emp;
select * from salgrade;
select * from dept;

-- (+) null 값을 보장한다는 의미

select  d.deptno, dname, e1.empno, e1.ename, e1.mgr, e1.sal, e1.deptno, losal, hisal, grade, e2.empno mgr_empno, e2.ename mgr_ename
from    emp e1, dept d, salgrade s, emp e2
where e1.deptno(+) = d.deptno and e1.sal between losal(+) and hisal(+) and e1.mgr=e2.empno(+)
order by d.deptno, e1.empno;

select  d.deptno, dname, e1.empno, e1.ename, e1.mgr, e1.sal, e1.deptno, losal, hisal, grade, e2.empno mgr_empno, e2.ename mgr_ename
from    emp e1 right join dept d    on (e1.deptno =d.deptno) 
                left join salgrade s on(e1.sal between losal and hisal)
                left join emp e2    on(e1.mgr=e2.empno)
order by d.deptno, e1.empno;




select d.deptno, d.dname, e.empno, e.ename, e.mgr, e.sal, e.deptno deptno_1, 
s.losal, s.hisal, s.grade, e.empno mgr_empno, e.ename mgr_ename
from emp e join salgrade s  on e.sal between s.losal and s.hisal full outer join dept d on (e.deptno = d.deptno)
order by deptno, empno; 


