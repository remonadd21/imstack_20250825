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

- Q019
--ROUND를 이용하여 반올림 된 숫자 출력하기
select  round(1234.5678)     r 
,       round(1234.5678 , 0) r1
,       round(1234.5678 , 1) r2
,       round(1234.5678 , 2) r3
,       round(1234.5678 , -1) "r4 -숫자제거"
,       round(1234.5678 , -2) r5
from    dual;

-- Q020
--TRUNC를 이용하여 반올림 된 숫자 출력하기
select  TRUNC(1234.5678)     "r 버리기 "
,       TRUNC(1234.5678 , 0) r1
,       TRUNC(1234.5678 , 1) r2
,       TRUNC(1234.5678 , 2) r3
,       TRUNC(1234.5678 , -1) "r4 -숫자제거"
,       TRUNC(1234.5678 , -2) r5
from    dual;

-- Q021 ceil , floor
--          4              3             -3            -4
select ceil(3.14)  , floor(3.96) , ceil(-3.14)  , floor(-3.96)
from   dual;

-- Q22  MOD
--   10을 3으로 나눴을때 나머지  , 10을 2로 나눴을때 나머지 , 
select   mod(10,3)                 , mod(10,2)          , mod(10,4) 
from     dual;

-- Q23  SYSDATE 함수를 사용하여 날짜 출력 - 하루이전, 이후
select  sysdate 오늘 ,   sysdate-1 어제 , sysdate+1 내일
from dual;


-- Q24 add_months 3개월
select sysdate, add_months(sysdate, 3) "3개월뒤" from dual;


-- Q25  emp 테이블에서 입사 10주년
select empno, ename, add_months(hiredate,120) "10주년"
from emp;

-- Q26  emp 테이블에서 입사 42년 미만인 사원 데이터 출력
-- sysdate, next_day, add_months, last_day, to_char
-- 12*42 = 504

select empno, ename, hiredate, sysdate, add_months(hiredate, 504) "42년"
from emp
where add_months(hiredate,504) > sysdate;

-- Q27 hiredate와 sysdate 사이의 개월수를 출력하시오.
-- sysdate(24/12/21),months1, months2, months3

select empno, ename, hiredate, to_date('2024-12-21','YYYY-MM-DD')
, months_between(hiredate, to_date('2024-12-21','YYYY-MM-DD')) months1
, months_between(to_date('2024-12-21','YYYY-MM-DD'), hiredate) months2
, trunc(months_between(to_date('2024-12-21','YYYY-MM-DD'), hiredate) ) months3
from emp;



-- Q28 sysdate, add_months, next_day, last_day, months_between
select sysdate, next_day(sysdate,'월요일'), last_day(sysdate)
from dual; 


-- Q29 round
select sysdate
, round(sysdate,'cc') "몇세기-century"
, round(sysdate,'YYYY') "년도"
, round(sysdate,'Q') "분기"
, round(sysdate,'DDD') "DDD-연중일수"
, round(sysdate,'HH') "HH-시간"
from dual;

-- Q30 trunc

select sysdate
, trunc(sysdate,'cc') "몇세기-century"
, trunc(sysdate,'YYYY') "년도"
, trunc(sysdate,'Q') "분기"
, trunc(sysdate,'DDD') "DDD-연중일수"
, trunc(sysdate,'HH') "HH-시간"
from dual;


-- Q31. 문자 + 숫자 
-- empno 숫자 +'500' (문자열이지만 알파벳들, 문자들이 포함되지 않았기 때문에 자동변환 됨)
-- 그래도 문자이기 때문에 to_number나 to_char 등을 사용하는 것이 좋다.
select empno, ename, empno + to_number('500')
from emp
where ename='SCOTT';


-- Q32  문자와 숫자... 숫자에 문자가 같이 있으면 문제가 발생함.

select empno, ename, empno + '500A'
from emp
where ename='SCOTT';


-- Q33 sysdate
select sysdate , to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS')
from dual;

-- Q34~38

-- Q6-34
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'MON') AS MON,
       TO_CHAR(SYSDATE, 'MONTH') AS MONTH,
       TO_CHAR(SYSDATE, 'DD') AS DD,
       TO_CHAR(SYSDATE, 'DY') AS DY,
       TO_CHAR(SYSDATE, 'DAY') AS DAY
  FROM DUAL;

-- Q6-35
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = KOREAN' ) AS MON_KOR,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = JAPANESE') AS MON_JPN,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS MON_ENG,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = KOREAN' ) AS MONTH_KOR,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = JAPANESE') AS MONTH_JPN,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS MONTH_ENG
  FROM DUAL;

-- Q6-36
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'DD') AS DD,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = KOREAN' ) AS DY_KOR,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = JAPANESE') AS DY_JPN,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS DY_ENG,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = KOREAN' ) AS DAY_KOR,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = JAPANESE') AS DAY_JPN,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS DAY_ENG
  FROM DUAL;

-- Q6-37
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'HH24:MI:SS') AS HH24MISS,
       TO_CHAR(SYSDATE, 'HH12:MI:SS AM') AS HHMISS_AM,
       TO_CHAR(SYSDATE, 'HH:MI:SS P.M.') AS HHMISS_PM
  FROM DUAL;

-- Q6-38
SELECT SAL,
       TO_CHAR(SAL, '$999,999') AS SAL_$,
       TO_CHAR(SAL, 'L999,999') AS SAL_L,
       TO_CHAR(SAL, '999,999.00') AS SAL_1,
       TO_CHAR(SAL, '000,999,999.00') AS SAL_2,
       TO_CHAR(SAL, '000999999.99') AS SAL_3,
       TO_CHAR(SAL, '999,999,00') AS SAL_4
  FROM EMP;





-- Q39 문자와 숫자연산에서 문자가 포함되더 있지 않으면 연산가능
select 1500+'1300', to_number('1300')-1500, '1300'-1500
from dual;

-- Q40 1,500 - 1,300 가능 할까? 에러 발생! ,(문자가 있음)

-- Q41 to_number (,가 있어도 number 처리 됨)
select to_number('3,500','999,999') - to_number('1,300','999,999')
from dual;

-- Q42. to_char
select to_date('2025-10-17','YYYY-MM-DD')
from dual;



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

select empno, ename, mgr, 
    case 
        when substr(to_char(mgr),1,2) ='75'  then '5555'
        when substr(to_char(mgr),1,2) ='76'  then '6666'
        when substr(to_char(mgr),1,2) ='77'  then '7777'
        when substr(to_char(mgr),1,2) ='78'  then '8888'
        when mgr is null then '0000'
        else to_char(mgr)
    end   chg_mgr
from emp;




--------------------------------------------------------------------------------------------