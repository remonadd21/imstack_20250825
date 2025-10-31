CREATE TABLE post (
  ID NUMBER NOT NULL,
  APP_USER_ID NUMBER NOT NULL,
  TITLE VARCHAR2(200) NOT NULL,
  CONTENT CLOB NOT NULL,
  PASS VARCHAR2(100),
  CREATED_AT DATE,
  HIT NUMBER default 0,
  primary key(ID)
);

create sequence post_seq;
desc post;

select post_seq.nextval from dual;

delete from post;
commit;

alter table post modify CREATED_AT DATE default sysdate not null;

desc post;

select * from appuser;
select * from post;

drop sequence  post_seq;

--------------------------------------------------------------------------------
--dao 테스트
insert into post (id, app_user_id, title, content, pass) values
(post_sec.nextval,1,'멋지 우리회사','최고다!','1111111');

--------------------------------------------------------------------------------

select p.* , u.email from post p join appuser u on(p.app_user_id = u.app_user_id);

--------------------------------------------------------------------------------
select * from post where id=1;
update post set hit = hit +1 where id=1;
--------------------------------------------------------------------------------

update post set title='d2big', content='최고의 회사 d2big' 
	where id=1 and pass='1111111';
    
select * from post;

desc post;

--------------------------------------------------------------------------------

delete from post where id=1 and pass='1111111';

--------------------------------------------------------------------------------


--------------------------------------------------------------------------------

