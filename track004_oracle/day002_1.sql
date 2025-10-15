1. 집합 연산자
union (중복제거 하고 합집합), union all (중복 포함하고 합집합) ,minus(차집합), intersect(교집합)

---------------------------------------------------------------
SELECT *
FROM emp
WHERE deptno=10
---------------------------------------------------------------
union   -- 중복을 제거하기 때문에 deptno를 10으로 똑같이 작성하면 하나의 값으로 인식
---------------------------------------------------------------
SELECT *
FROM emp
WHERE deptno=10;
---------------------------------------------------------------

2. union all
---------------------------------------------------------------
SELECT *
FROM emp
WHERE deptno=10
---------------------------------------------------------------
union all   -- 중복을 포함한다.
---------------------------------------------------------------
SELECT *
FROM emp
WHERE deptno=10;
---------------------------------------------------------------

3. minus(차집합)
---------------------------------------------------------------
SELECT *
FROM emp
---------------------------------------------------------------
minus
---------------------------------------------------------------
SELECT *
FROM emp
WHERE deptno=20;
---------------------------------------------------------------


4. intersect(교집합)
---------------------------------------------------------------
SELECT *
FROM emp
WHERE deptno>=10 And deptno<=20
---------------------------------------------------------------
intersect
---------------------------------------------------------------
SELECT *
FROM emp
WHERE deptno=20;
---------------------------------------------------------------

Q30. union을  이용하여 deptno가 10이거나 20인 데이터의 empno, ename, sal, deptno 조회

select empno, ename, sal, deptno from emp where deptno=10

union

select empno, ename, sal, deptno from emp where deptno=20;

---------------------------------------------------------------

Q31. 열의 갯수가 다를때 에러
:: 아래를 보면 합쳐야 하는 열의 갯수가 다름

select empno, ename, sal, deptno
union
select ename, empno, deptno, 

---------------------------------------------------------------

Q32. 자료형이 다를때 에러
:: 아래를 보면 합쳐야하는 필드의 자료형이 서로 다름!

select empno, ename, sal, deptno
union
select ename, empno, deptno, sal 

---------------------------------------------------------------

Q33. 자료형이 같을때 동작가능!
:: 아래를 보면 합쳐야 하는 열의 갯수와 자료형이 같음
:: 즉! 필드의 이름은 달라도 갯수와 자료형만 맞으면 출력가능


select empno, ename, sal, deptno
from emp where deptno=10
union
select sal, jab, deptno, sal
from emp where deptno=10

---------------------------------------------------------------

Q34. union과 union all의 차이는?

union은 합집합으로 값이 같을때 중복이 제외 됨,
union all은 중복이 가능한 합집합으로 중복된 값도 출력됨

---------------------------------------------------------------

Q35. union과 union all의 차이를 알아보기 위하여 empno, ename, sal, deptno를 출력하는데 
deptno가 =10인 값을 union과  union all로 조회하기

select empno, ename, sal, deptno from emp where deptno=10 
union
select empno, ename, sal, deptno from emp where deptno=10;

---------------------------------------------------------------

select empno, ename, sal, deptno from emp where deptno=10 
union all
select empno, ename, sal, deptno from emp where deptno=10;

---------------------------------------------------------------

Q36. emp 테이블 전체 조회하기, deptno가 10인 값만 제외하기

select * from emp 
minus
select * from emp where deptno=10;

---------------------------------------------------------------

Q37. deptno가 10인 교집합인 값만 출력하기

select * from emp where deptno=10

intersect

select * from emp where deptno=10;

---------------------------------------------------------------

EX001. emp 테이블에서 ename이 s로 끝나는 사원데이터를 모두 조회하기

select * from emp where ename like '%S';


---------------------------------------------------------------

Ex002. emp 테이블에서 deptno가 30인 사원중 job이 SALESMAN인 사원의 
empno, ename, job, sal, deptno 조회하기

select empno, ename, job, sal, deptno from emp where deptno=30 and job='SALESMAN';

---------------------------------------------------------------

Ex003. union을 사용하지 않는 방식으로 in 연산자를 이용하여 deptno가 20 또는 30인 사원의 
sal이 2000 초과인 사원 조회하기

select * from emp where deptno in(20,30) and sal>2000;


---------------------------------------------------------------

Ex003. union을 사용한 방식 emp 테이블에서 in 연산자를 이용하여 deptno가 20 또는 30인 사원의 
sal이 2000 초과인 사원 조회하기

select * from emp where deptno in(20,30) AND sal>2000
union
select * from emp where deptno in(20,30) AND sal>2000;

---------------------------------------------------------------

Ex004. emp 테이블에서 not between and 연산자를 사용하지 않고 sal이 2000 이상. 3000 이하인
데이터 조회하기

select * from emp where sal>=2000 and sal<3000;


-- 제시된 답은 sal이 2000보다 작거나 3000 보다 작은 값 으로 되어 있음
select * from emp where sal<2000 or sal>3000;


---------------------------------------------------------------

Ex005. ename에 E가 포함되고 deptno가 30인 사원의 급여가 1000~2000 사이가 아닌 사원의 
ename, empno, sal, deptno를 조회하기

select ename, empno, sal, deptno from emp where ename like '%E%' AND deptno=30 AND sal not between 1000 and 2000;

1. 집합 연산자
union (중복제거 하고 합집합), union all (중복 포함하고 합집합) ,minus(차집합), intersect(교집합)

---------------------------------------------------------------
SELECT *
FROM emp
WHERE deptno=10
---------------------------------------------------------------
union   -- 중복을 제거하기 때문에 deptno를 10으로 똑같이 작성하면 하나의 값으로 인식
---------------------------------------------------------------
SELECT *
FROM emp
WHERE deptno=10;
---------------------------------------------------------------

2. union all
---------------------------------------------------------------
SELECT *
FROM emp
WHERE deptno=10
---------------------------------------------------------------
union all   -- 중복을 포함한다.
---------------------------------------------------------------
SELECT *
FROM emp
WHERE deptno=10;
---------------------------------------------------------------

3. minus(차집합)
---------------------------------------------------------------
SELECT *
FROM emp
---------------------------------------------------------------
minus
---------------------------------------------------------------
SELECT *
FROM emp
WHERE deptno=20;
---------------------------------------------------------------


4. intersect(교집합)
---------------------------------------------------------------
SELECT *
FROM emp
WHERE deptno>=10 And deptno<=20
---------------------------------------------------------------
intersect
---------------------------------------------------------------
SELECT *
FROM emp
WHERE deptno=20;
---------------------------------------------------------------

Q30. union을  이용하여 deptno가 10이거나 20인 데이터의 empno, ename, sal, deptno 조회

select empno, ename, sal, deptno from emp where deptno=10

union

select empno, ename, sal, deptno from emp where deptno=20;

---------------------------------------------------------------

Q31. 열의 갯수가 다를때 에러
:: 아래를 보면 합쳐야 하는 열의 갯수가 다름

select empno, ename, sal, deptno
union
select ename, empno, deptno, 

---------------------------------------------------------------

Q32. 자료형이 다를때 에러
:: 아래를 보면 합쳐야하는 필드의 자료형이 서로 다름!

select empno, ename, sal, deptno
union
select ename, empno, deptno, sal 

---------------------------------------------------------------

Q33. 자료형이 같을때 동작가능!
:: 아래를 보면 합쳐야 하는 열의 갯수와 자료형이 같음
:: 즉! 필드의 이름은 달라도 갯수와 자료형만 맞으면 출력가능


select empno, ename, sal, deptno
from emp where deptno=10
union
select sal, jab, deptno, sal
from emp where deptno=10

---------------------------------------------------------------

Q34. union과 union all의 차이는?

union은 합집합으로 값이 같을때 중복이 제외 됨,
union all은 중복이 가능한 합집합으로 중복된 값도 출력됨

---------------------------------------------------------------

Q35. union과 union all의 차이를 알아보기 위하여 empno, ename, sal, deptno를 출력하는데 
deptno가 =10인 값을 union과  union all로 조회하기

select empno, ename, sal, deptno from emp where deptno=10 
union
select empno, ename, sal, deptno from emp where deptno=10;

---------------------------------------------------------------

select empno, ename, sal, deptno from emp where deptno=10 
union all
select empno, ename, sal, deptno from emp where deptno=10;

---------------------------------------------------------------

Q36. emp 테이블 전체 조회하기, deptno가 10인 값만 제외하기

select * from emp 
minus
select * from emp where deptno=10;

---------------------------------------------------------------

Q37. deptno가 10인 교집합인 값만 출력하기

select * from emp where deptno=10

intersect

select * from emp where deptno=10;

---------------------------------------------------------------

EX001. emp 테이블에서 ename이 s로 끝나는 사원데이터를 모두 조회하기

select * from emp where ename like '%S';


---------------------------------------------------------------

Ex002. emp 테이블에서 deptno가 30인 사원중 job이 SALESMAN인 사원의 
empno, ename, job, sal, deptno 조회하기

select empno, ename, job, sal, deptno from emp where deptno=30 and job='SALESMAN';

---------------------------------------------------------------

Ex003. union을 사용하지 않는 방식으로 in 연산자를 이용하여 deptno가 20 또는 30인 사원의 
sal이 2000 초과인 사원 조회하기

select * from emp where deptno in(20,30) and sal>2000;


---------------------------------------------------------------

Ex003. union을 사용한 방식 emp 테이블에서 in 연산자를 이용하여 deptno가 20 또는 30인 사원의 
sal이 2000 초과인 사원 조회하기

select * from emp where deptno in(20,30) AND sal>2000
union
select * from emp where deptno in(20,30) AND sal>2000;

---------------------------------------------------------------

Ex004. emp 테이블에서 not between and 연산자를 사용하지 않고 sal이 2000 이상. 3000 이하인
데이터 조회하기

select * from emp where sal>=2000 and sal<3000;


-- 제시된 답은 sal이 2000보다 작거나 3000 보다 작은 값 으로 되어 있음
select * from emp where sal<2000 or sal>3000;


---------------------------------------------------------------

Ex005. ename에 E가 포함되고 deptno가 30인 사원의 급여가 1000~2000 사이가 아닌 사원의 
ename, empno, sal, deptno를 조회하기

select ename, empno, sal, deptno from emp where ename like '%E%' AND deptno=30 AND sal not between 1000 and 2000;

---------------------------------------------------------------

Ex006. comm이 없고, mgr이 존재하면 job이 MANAGER, CLERK 인 사원 중 사원의 이름 2번째 글자가
L이 아닌 사원의 정보 조회하기


select * from emp where comm is null and mgr is not null and job in('MANAGER','CLERK') and ename not like '_L%' order by empno asc;


---------------------------------------------------------------

-- 1. sal between 2000 and 3000 은 어떤 범위를 의미하나요?
-- sal이 2000이상 3000이하 (값을 포함함)

-- 2. ename like '_L%'은 어떤 패턴을 찾나요?
-- 이름의 두번째가 L인 패턴

-- 3. comm is null 은 어떤 상태를 의미하나요?
-- null은 비어 있다는 뜻으로 값이 아님, is null은 값으로 확인이 가능함

-- 4. union과 union all의 차이는 무엇인가요?
-- union은 중복이 되지 않고, union all은 중복이 가능한 합집합이다.

-- 5. sal ^=3000은 어떤 조건을 의미하나요?
-- sal이 3000이 아닌값 찾기
