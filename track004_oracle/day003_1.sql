-- 1 문자열

-- 2 숫자 : round (반올림) / trunc(반올림 되지 않고, 뒷쪽 숫자 버림), ceil(올림), floor(내림), mod(나머지)

-- 3 날짜 : sysdate(시스템 날짜) , add_months(몇달 뒤에) , next_day(다음날), last_day(마지막 날)

-- 4 변환 : to_char(날짜형식변환), to_date

-- 5 조건 : decode, case (조건분기), nvl, nvl2(null)

--------------------------------------------------------------------------------------------

-- 2 숫자 : round (반올림) / trunc(반올림 뒷쪽 숫자 버림), ceil(올림), floor(내림), mod(나머지)

select round(1234.5678) from dual;

select round(1234.5678, 2) from dual;    -- 소수점 자릿수 표현가능

select trunc(3456.789) from dual;       -- 뒤에 소수점이 반올림 되지도 않고, 삭제 됨

select ceil(1.1) 무조건올림, floor(4.8) 내림, mod(10,3) 나머지 from dual;


--------------------------------------------------------------------------------------------

-- 3 날짜 : sysdate(시스템 날짜) , add_months(몇달 뒤에) , next_day(다음날), last_day(마지막 날)

select sysdate 현재날짜시간 , add_months(sysdate, 2) 두달뒤, add_months(sysdate,-3) 세달전, months_between('25-12-1','24-12-1') 몇달차이
from dual;

select next_day(sysdate,1) 돌아오는일요일,next_day(sysdate,'월요일') 다음주월요일 , last_day(sysdate) 해당월마지막날짜 
from dual;

--------------------------------------------------------------------------------------------

-- 4 변환 : to_char(날짜형식변환), to_date

select to_char(sysdate,'YYYY-MM-DD') 날짜형식, to_date('2025-10-16','YYYY-MM-DD') 문자를숫자날짜로
from dual;

select to_char('일이삼사') 문자에숫자더하기못함,'1234'+1 문자열표현이지만숫자여서연산됨, to_number('5678')+1 
from dual;


--------------------------------------------------------------------------------------------

-- 5 조건 : decode, case (조건분기), nvl, nvl2(null)

-- nvl은 null 값을 처리하는 방법
select nvl( null, 'null일때 대체하는 값' )
from dual;


select nvl( to_char(comm),'입력안됨' ) //nvl = null value logic (replacement)
from emp;

-- nvl2는 해당 값 또는 필드 , 값이있는 부분처리, null이 있는 부분 처리
select nvl2(null,'A','B')
from dual;

select mgr,nvl2(mgr,to_char(mgr), '--') -- 해당필드, 값이 있는 필드처리, null이 있는 필드 처리
from emp;


select decode(deptno,10,'부서10',20,'부서20', 30,'부서30') from emp;


select case deptno
            when 10 then '부서10'
            when 20 then '부서20' 
            when 30 then '부서30' 
           else '부서X'
       end
from emp;



--------------------------------------------------------------------------------------------
-- Q45 nvl 함수를 사용하여 다음과 같이 출력하기

select empno, ename, sal, comm, comm+sal, nvl(comm,0), nvl((comm+sal),0) from emp;

-- Q46 nvl2 사용하기

select empno, ename, comm, nvl2(comm,'O','X'), sal*12 from emp;


-- Q47 decode 함수를 사용하여 출력하기
-- job이 'MANAGER'는 급여의 10% 인상
-- SALESMAN은 급여의 5% 인상
-- ANALYST는 그대로 
-- 나머지는 3% 인상된 급여 작성

select empno, ename, job, sal, decode(job,'MANAGER',(sal*0.1)+sal, 'SALESMAN',(sal*0.05)+sal,'ANALYST',sal,sal+(sal*0.03) ) upsal
from emp;

-- Q48 case함수를 이용하여 다음과 같이 출력하기

select empno, ename, job, sal, 
    case job 
        when 'MANAGER' then (sal*0.1)+sal
        when 'SALESMAN' then (sal*0.05)+sal
        when 'ANALYST' then to_number(sal)
        else sal+(sal*0.03)
        end upsal
from emp;


-- Q49 case 사용, comm이 null이 이면 해당사항 없음 0이면 수당없음, 0 초과시 초과한 수당 출력

SELECT empno, ename,
       CASE 
           WHEN comm IS NULL THEN '해당사항 없음'
           WHEN comm = 0 THEN '수당없음'
           WHEN comm > 0 THEN to_char(comm)
       END AS comm
FROM emp;

--------------------------------------------------------------------------------------------

-- 사고확장001
-- ename이 다섯글자 이상, 여섯글자 미만인 사원 조회하기
-- masking_empno는 empno의 앞두자리 외 뒷자리를 *로 출력
-- masking_ename은 사원이름 첫글자만 보여주고 나머지는 *로 출력
-- * 앞자리 추출 substr(문자열, 어디에서(시작), 몇개)
-- * rpad(문자열, 몇자리,채울값 )

select empno, rpad(substr(empno,1,2),4,'*') masking_empno, ename , rpad(substr(ename,1,1),4,'*') 
from emp 
where length(ename) >=5 and length(ename) <6;

--------------------------------------------------------------------------------------------

-- 사고확장002
-- 근무일수 21.5일
-- 급여 day_pay와 시급 Time_pay를 계산하여 결과 조회하기
-- * 하루 급여는 소수점 세째자리에서 버리기 trunc
-- * 시급은 두번째 소수점에서 반올림하기
-- 21.5시간 이므로 평균 8시간 근무

select empno, ename, sal, trunc(sal/21.5,2) DAY_PAY, round((sal/21.5)/8,1) 
from emp;


--------------------------------------------------------------------------------------------

-- 사고확장003
-- hiredate를 기준으로 3개월이 지난 후 첫 월요일에 정직원이 됨
-- 사원들이 정직원이 되는 날짜 (R_JOB)를 YYYY-MM--DD 형식으로 출력하기
-- 추가 수당 comm이 없는 사원들은 추가수단 N/A로 표기하기

-- add_months(sysdate,-3) 세달전
-- to_char(sysdate,'YYYY-MM-DD') 날짜형식


select empno, ename, hiredate, to_char(add_months(hiredate,3),'YYYY-MM-DD') R_JOB, nvl(to_char(comm),'N/A') comm 
from emp; 

--------------------------------------------------------------------------------------------

-- 사고확장 004
-- 직속상관 mgr의 사원번호를 변환하여 CHG_MGR 에 출력하기
-- 직속상관의 번호가 존재하지 않을 경우, 00000
-- 직속상관의 번호가 앞 두자리가 75일 경우 5555
-- 직속상관의 번호가 앞 두자리가 76일 경우 6666
-- 직속상관의 번호가 앞 두자리가 77일 경우 7777
-- 직속상관의 번호가 앞 두자리가 78일 경우 8888
-- 그 외 직속상관 사원번호의 경우, 본래 직속상관의 사원 번호로 출력


--------------------------------------------------------------------------------------------