-- [] 제약조건
-- 1. NOT NULL  NULL 입력금지
-- 2. UNIQUE  중복금지, NULL 허용
-- 3. PRIMARY KEY 고유식별자, 중복/NULL 금지
-- 4. FOREIGN KEY 다른 테이블 참조
-- 5. CHECK 조건검사




-- rdb
-- 테이블 관계 속성
-- FOREIGN KEY
-- 1. 다른테이블 참조
-- 2. 부모테이블의 값만 입력가능
-- 3. 참조 무결성 유지
-- 부서는 많은 사원을 가진다. 
-- 부서테이블이 먼저 존재 해야 한다. 

CREATE  TABLE  DEPT_FK(
    DEPTNO  NUMBER        PRIMARY KEY,   
    DNAME   VARCHAR2(50)
);

CREATE  TABLE  EMP_FK(
    EMPNO  NUMBER        PRIMARY KEY, 
    ENAME  VARCHAR2(50)  NOT NULL,
    DEPTNO NUMBER(2),
    CONSTRAINT FK_DEPT  FOREIGN KEY(DEPTNO)  REFERENCES  DEPT_FK(DEPTNO) ON DELETE CASCADE
);                    --  내테이블의 DEPTNO              부모테이블(DPETNO)

select table_name from user_tables;


-- Insert : dept_fk
insert into dept_fk values (10,'bug_hunter');
insert into dept_fk values (20,'pawject');
insert into dept_fk values (30,'test');

-- 부모에 있는 deptno와 같은 값은 작성이 되나. 나머지는 안됨!
-- deptno 30은 작성이 가능!
-- 부모에 없는 값은 못 넣음
insert into emp_fk (empno, ename, deptno) values (1, 'first' ,30);
insert into emp_fk (empno, ename, deptno) values (2, 'first' ,40);
insert into emp_fk (empno, ename, deptno) values (3, 'first' ,50);


-- 2. on delete casecade
delete from dept_fk where deptno=30;
select * from emp_fk;



ALTER TABLE  post  ADD CONSTRAINT  fk_post_appuser  FOREIGN KEY(APP_USER_ID)   REFERENCES  appuser(APP_USER_ID);

SELECT  constraint_name, table_name , column_name 
from  user_cons_columns
where  table_name='POST';  --대문자

delete from appuser;
delete from post;
commit;
