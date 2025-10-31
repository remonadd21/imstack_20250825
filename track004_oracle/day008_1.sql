-- crud (create, read, update, delete)

-- ★ 데이터 베이스 언어
-- c.r.u.d                  create         read          update        delete
-- 1. dml 조작어           (insert)삽입 , (select)조회, (update) 수정, (delete)지우기
-- 2. ddl 정의어           create(만들기)  alter(테이블수정)      drop(삭제, 복구 불가능)  -- cad
-- 3. dcl 제어어(접근권한)   grant(권한 주세요)     revoke(권한빼기)
-- 4. tcl 제어어(트랜잭션)   commit(반영),   rollback(되돌리기),  savepoint(지점)

--------------------------------------------------------------------------------------------
-- 1. dml 조작어           (insert)삽입 , (select)조회, (update) 수정, (delete)지우기

-- #1.테이블 복사해오기
create table dept_temp as select * from dept;

desc dept_temp;

select * from dept_temp;


-- #2. insert
-- insert into 테이블명 (필드1, 필드2...) value (값1, 값2,,,,)

insert into dept_temp (deptno, dname, loc)  values( 50,'DATABASE', 'SEOUL' );

-- 필수 순서대로 기입한다면 아래처럼 필드 부분 제외가능
insert into dept_temp                       values( 60, 'NEWTWORK', 'KWANGJU');
insert into dept_temp                       values( 70, 'WEB', NULL);
insert into dept_temp (deptno, loc, dname) values( 80,'','FRONT' );
insert into dept_temp (loc, dname, deptno) values('INCHEON', 'BACK', 90);
insert into dept_temp (deptno, dname)      values(99,'MOBLIE');

commit; -- mysql처럼 auto commit 되지 않아서 cmd에 나타나지않음!

select * from dept_temp;

--------------------------------------------------------------------------------


-- Q1.  EMP테이블을 복사해 EMP_TEMP 테이블을 만드시오. ( 구조확인, 전체데이터 확인)
create table emp_temp as select * from emp;
desc emp_temp;
select * from emp_temp;

-- Q2.  모든필드 명시하는 방법이용해서   다음의 값 넣기 - 9999, '홍길동', 'PRESIDENT', NULL, '2001/01/01', 5000, 1000, 10
insert into emp_temp (empno,ename,job, mgr,hiredate,sal, comm, deptno)
values (9999, '홍길동', 'PRESIDENT', NULL, '2001/01/01', 5000, 1000, 10);

commit;

select * from emp_temp;



-- Q3.  필드 명시 안하는 방법이용해서 다음의 값 넣기    - 1111, '성춘향', 'MANAGER', 9999, '2001-01-05', 4000, NULL, 20
insert into emp_temp 
values (1111, '성춘향', 'MANAGER', 9999, '2001-01-05', 4000, NULL, 20);

commit;

select * from emp_temp;

--------------------------------------------------------------------------------
-- 1. dml 조작어           (insert)삽입 , (select)조회, ●(update) 수정, (delete)지우기

-- #1. 
select * from dept_temp;

--10	ACCOUNTING	NEW YORK
--20	RESEARCH	DALLAS
--30	SALES	CHICAGO
--40	OPERATIONS	BOSTON
--50	DATABASE	SEOUL
--60	NEWTWORK	KWANGJU
--70	WEB	        null
--90	BACK	    INCHEON
--99	MOBLIE	    null
--80	FRONT	    null

-- #2. update
--update 테이블명
--set 바꿀필드1 = 바꿀값1, 바꿀필드2 = 바꿀값2
--where 조건;

-- 전체 데이터 업데이트
update dept_temp set loc='KWANGJU';


-- 조건에 맞으면 업데이트
update dept_temp set dname='SMART' where dname='MOBLIE';
commit;
select * from dept_temp;


-- 전체 데이터 삭제
delete from dept_temp 

-- 조건에 맞으면 삭제
delete from dept_temp where deptno=10;
delete from dept_temp where deptno>=30;

commit;

select * from dept_temp;


--------------------------------------------------------------------------------

-- Q1. dept_temp 모든 데이터 삭제
delete from dept_temp;
select * from dept_temp;


-- Q2. insert 이용해서 데이터 삽입, 반영
insert into dept_temp(deptno, dname, loc)
                    select deptno, dname, loc from dept;


commit;
select * from dept_temp;



-- Q3. 부서번호가 40번 부서의 이름 database, 지역은 seoul로 바꾸기
update dept_temp set loc='SEOUL' where deptno=40; 
select * from dept_temp;


-- Q4. 위에 데이터 되돌리기 (rollbackl이 되려면 commit 전에 가능함!)
rollback;
commit;


--------------------------------------------------------------------------------
-- 4. tcl 제어어(트랜잭션)   commit(반영),   rollback(되돌리기),  savepoint(지점)
--------------------------------------------------------------------------------

-- #0. 준비 -  다음 문제들을 풀으시오
-- Q1. DEPT 테이블을 복사해 DEPT_TCL테이블을 작성하시오.

create table dept_tcl as select * from dept;
desc dept_tcl;

-- Q2. DEPT_TCL 테이블에 다음과 같이 데이터를 입력, 수정, 삭제 하시오.
--    2-1.  데이터 삽입   50, 'DATABASE', 'SEOUL'
insert into dept_tcl (deptno, dname, loc)
VALUES  (50, 'DATABASE', 'SEOUL');

--    2-2.  부서번호가 40인  LOC를 INCHEON 으로 수정
update dept_tcl set loc = 'INCHEON' where deptno=40;
--    2-3.  DNAMD이 RESEARCH 인데이터 삭제
select * from dept;
rollback;

delete from dept_tcl where dname='RESEARCH';
commit;
--    2-4.  전체데이터 확인
select * from dept_tcl;
select * from dept order by deptno;

/* rollback 사용해보기 */
insert into dept_tcl dept_tcl values(20,'AI','INCHEON');
select * from dept_tcl;
rollback;

/*커밋 하기전에 rollback을 해야 적용됨*/

-- 3. savepoint
savepoint sp_insert;    -- 기준점1
insert into dept_tcl values(60,'AI_ENGEINE','BUCHEON');

savepoint sp_update;   -- insert 확정, 이후 작업만 되돌리기 (기준점 설정2)

update dept_tcl set deptno=20 where deptno=60;

insert into dept_tcl values(80,'front','GANGNAME');

savepoint intsert80;

select * from dept_tcl;

/*savepoint로 만들어진 지점으로 되돌림*/
rollback to sp_update;

-------------------------------------------------------------------------------------------
-- 2. ddl 정의어           create(만들기)  alter(테이블수정)      drop(삭제, 복구 불가능)  -- cad
-------------------------------------------------------------------------------------------

-- #1. Create

create table 테이블명(
                    필드명1 자료형  옵션,
                    필드명2 자료형, 옵션
                    필드명3 자료형  옵션,
                    필드명4 자료형, 옵션
)
-------------------------------------------------------------------------------------------
필드명 - 영문소문자
자료형 - 숫자 number, 문자열 varchar(2) , 날짜 date
옵션 - not null 필수 입력, 기본값 primary key



create table dept_ddl (
    deptno number(2) primary key, 
    dname varchar(50) not null,
    loc varchar2(50) 
);

desc dept_ddl;

--------------------------------------------------------------------------------
--alter table 테이블 명 add        필드명     자료형
--                    drop column 필드명
--                    modify     필드명    자료형

--------------------------------------------------------------------------------

-- 컬럼추가 
ALTER TABLE dept_ddl ADD  ADMINX varchar(50);

-- 컬럼 수정
alter table dept_ddl modify ADMINX varchar(100) not null;

-- 컬럼 삭제

alter table dept_ddl drop column ADMINX;

--------------------------------------------------------------------------------

drop table dept_ddl;

/* DDL 파트 테이블 만들기, 필드, 추가, 삭제, 변경에서는 롤백사용이 안됨!*/
rollback;
desc dept_ddl;
