-- 1. 시퀀스 : 자동 번호 생성기 ★
-- 2. 뷰 : 가상 테이블 (select 문 결과를 저장한 객체)
-- 3. 동의어 : 객체에 대한 별칭
-- 4. 인텍스 : 검색 성능향상 ★
-- 5. 클러스터 : 여러 테이블을 물리적으로 같은 공간에 저장
--------------------------------------------------------------------------------
-- 1. 시퀀스 : 자동 번호 생성기 ★
--------------------------------------------------------------------------------
create sequence emp_seq;       -- 시작1, 증가단위1, 10^27
create sequence dept_seq;

create sequence emp_seq2
start with 1000 -- 시퀀스 시작값
increment by 1 -- 몇개씩 증가?
maxvalue 9999  -- 최대값 까지 지정가능
nocache;       -- 메모리에 미리 몇개까지 값 저장해 둘지

select emp_seq.NEXTVAL from dual;

select dept_seq.nextval from dual;

select table_name from user_tables;
desc dept_temp;

insert into dept_temp values(dept_seq.nextval, 'ai', 'indo');
select * from dept_temp;

desc appuser;

create sequence appuser_seq;


alter table appuser modify email varchar2(100) unique; -- unique는 유일한 값으로 사용


desc appuser;
DROP TABLE APPUSER; 
CREATE TABLE APPUSER(
    APP_USER_ID  NUMBER NOT NULL PRIMARY KEY ,
    EMAIL        VARCHAR2(100) NOT NULL   UNIQUE ,
    PASSWORD     VARCHAR2(100) ,
    MBTI_TYPE_ID NUMBER ,       
    CREATED_AT   DATE  
)
select * from appuser;

SELECT table_name, constraint_name, column_name
FROM user_cons_columns
WHERE constraint_name IN (
  SELECT constraint_name
  FROM user_constraints
  WHERE constraint_type = 'U'
);