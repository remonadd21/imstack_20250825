-- 조건에 맞는 데이터 조회
-- #1. where
-- #2. 비교연산자    같다 = , 다르다 표현들 ( != , <>, ^= ) 
-- #3. 논리연산자    AND , OR , NOT / 범위지정   BETWEEN AND    , OR / IN , NOT
-- #4. like        패턴검색
-- #5. null 처리    null 여부확인
-- #6. 집합연산자    union (중복제거 하고 합집합), union all (중복포함 하고 합집합), minus(차집합), intersect(교집합)


-- #1. 전체 데이터 조회 : emp 테이블!
select * from emp;

-- #2. where 조건 조회
select * from emp where empno =7839; -- 같다
select * from emp where empno !=7839; -- 다르다 !=
select * from emp where empno <>7839; -- 다르다 <>
select * from emp where empno ^=7839; -- 다르다 ^=

-- 대문자 소문자 표현 확인!
select * from emp where ename='KING';

-- AND는 나열된 조건 2개가 동시에 맞아야 함!
select * from emp where ename='KING' and empno=7839;

-- or 나열된 조건들 중 하나라도 맞으면 참!
select * from emp where ename='SCOTT' or empno=7839;


select * from emp where sal*12 = 36000;
select * from emp where sal >= 3000;

select * from emp where ename >='S';

select * from emp where ename >='SBR'; -- s먼저 확인, 두번째 b확인, 세번째 r 확인
select * from emp where deptno>=20 and deptno<=40;

select * from emp where deptno between 20 and 30;  -- between  and는 이상과 이하(숫자포함)

select * from emp where deptno=10 or deptno=30;
select * from emp where deptno in(10, 30);          -- ( )안의 조건을 찾음

select * from emp where ename like 'A%';            -- 시작하는 값이 A
select * from emp where ename like '%A%';           -- 중간 값이 A
select * from emp where ename like '%G';            -- 끝나는 값이 G

select * from emp where ename like '_I%';           -- 두번째 글자가 I 가 있는 값
select * from emp where comm=null;                  -- 처리 안됨!  데이터가 없는 상태 (값이 아님)

select * from emp where comm is null;               -- null로 값으로 인식하게 만들기 is null
select * from emp where comm is not null;           -- null이 아닌 값들 찾기   is not null


-- Q1. emp 테이블 모든 열 조회
select * from emp;

-- Q2. emp 테이블 부서번호가 30인 것 만 조회
select * from emp where deptno=30;

-- Q3. AND 이용 부서번호 30, JOB이 'SALESMAN' 인 값 조회
select * from emp where deptno=30 AND job='SALESMAN';


-- Q4. OR 이용 부서번호 30, job이 'CLERK' 인 값 조회
select * from emp where deptno=30 or job='CLERK';


-- Q05. sal*12가 36000인 값 조회
select * from emp where sal*12 = 36000;

-- Q06. sal열이 3000이상인 행 조회
select * from emp where sal>=3000;

-- Q07. ename의 첫 문자가 f와 같거나 뒤에 있는 값 조회
select * from emp where ename >='F';

-- Q08. 첫문자 f, 두번째문자 o, 세번째 문자 r, 네번째 문자 z인 문자열 조회
select * from emp where ename like 'F%';
select * from emp where ename like '_O%';
select * from emp where ename like '__R%';
select * from emp where ename like '____Z%';
select * from emp where ename <= 'FORZ';


-- Q9. sal이 3000이 아닌 값 조회
select * from emp where sal !=3000;


-- Q10. sal이 3000이 아닌 값 조회
select * from emp where sal <>3000;


-- Q11. sal이 3000이 아닌 값 조회
select * from emp where sal ^=3000;

-- Q12. NOT 이용 sal이 3000이 아닌 값 조회
select * from emp where not sal = 3000;

-- Q13. or 이용 job에서 MANAGER, SALESMAN, CLERK   중 하나라도 맞는 값 참
select * from emp where job = 'MANAGER' or job= 'SALESMAN' or job= 'CLERK';

-- Q14. in 이용 job에서 MANAGER, SALESMAN, CLERK   중 하나라도 맞는 값 참
select * from emp where job in ('MANAGER','SALESMAN','CLERK');


-- Q15. !=, <>, ^=-와 and이용 job이  'MANAGER' ,'SALESMAN' ,'CLERK' 행이 포함되지 않는값 조회
select * from emp where job != 'MANAGER' AND job!= 'SALESMAN' AND job!= 'CLERK';


-- Q16. not in을 이용하여 job이 'MANAGER' ,'SALESMAN' ,'CLERK' 행이 포함되지 않는값 조회
select * from emp where job not in('MANAGER' ,'SALESMAN' ,'CLERK');


-- Q17. <= , >= , and이용하여 sal이 2000이상 3000이하인 행 조회
select * from emp where sal>=2000 AND sal<=3000;


-- Q18. between and 이용하여 sal이 2000이상 3000이하인 행 조회
select * from emp where sal between 2000 and 3000;


-- Q19. not between and 이용하여 sal이 2000이상 3000이하인 이외의 행 조회
select * from emp where sal not between 2000 and 3000;


-- Q20. ename이 s로 시작하는 행 조회
select * from emp where ename like 'S%';

-- Q21. ename이 두번째 값이 L로 시작하는 행 조회
select * from emp where ename like '_L%';


-- Q22. ename이 중간에 AM이 있는 행 조회
select * from emp where ename like '%AM%';


-- Q23. ename이 중간에 AM을 포함하지 않는 행 조회
select * from emp where ename not like '%AM%';


-- Q24. 별칭을 사용하여 연간총 수입 행을 조회하시오
select ename, sal, sal*12+comm as 연간총수입, comm from emp;


-- Q25. null은 값이 아닌 비어 있는 상태


-- Q26. is null을 이용하여 null 값들 조회하기
select * from emp where comm is null;


-- Q27. mgr 값이 null 이 아닌 값들 조회하기
select * from emp where mgr is not null;


-- Q28. 되는 코드는? select * from emp where sal>null and comm >is null;
-- 동시 조건으로 is null이 있어도 출력되지 않음


-- Q29. 되는 코드는? select * from emp where sal>null or comm >is null;
-- 또는 조건으로 하나라도 맞으면 참이기 때문에 sal>null은 안되지만 sal> is null은 가능!