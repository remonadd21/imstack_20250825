CREATE TABLE BRUSER (
    USER_ID         VARCHAR2(20)   PRIMARY KEY,         -- 사용자 고유 ID
    EMAIL           VARCHAR2(100),                      -- 이메일
    pass            VARCHAR2(100),
    BIRTH_DATE      VARCHAR(100),                               -- 생년월일
    GENDER          VARCHAR(50),                            -- 성별 (M/F)
    JOIN_DATE       VARCHAR(100),               -- 가입일
    AGREE           VARCHAR(50)       -- 마케팅 수신 동의 여부 (Y/N)
);



drop table bruser;

desc bruser;

alter table bruser add user_id int not null primary key;


CREATE TABLE BRBOARD (
    USER_ID         NUMBER          PRIMARY KEY,         -- 게시글 고유 ID
    TITLE           VARCHAR2(200)   NOT NULL,            -- 게시글 제목
    CONTENT         VARCHAR2(300)   NOT NULL,            -- 게시글 내용
    WRITER_ID       VARCHAR2(20)    NOT NULL,            -- 작성자 ID 
    WRITE_DATE      DATE            DEFAULT SYSDATE,     -- 작성일
    VIEW_COUNT      NUMBER          DEFAULT 0           -- 조회수
);


desc brboard;
alter table BRBOARD add icename varchar(200) not null;
DROP TABLE BRBOARD;
CREATE SEQUENCE SEQ_USER_ID;


-- 외래키 설정이 안됨
ALTER TABLE BRBOARD
ADD CONSTRAINT BRINFO
FOREIGN KEY (USER_ID)
REFERENCES BRUSER(USER_ID)
ON DELETE CASCADE;

desc bruser;

select * from bruser;
alter table bruser modify MARKETING_AGREE varchar2(20) not null;

insert into bruser (user_id, EMAIL,PASS,BIRTH_DATE,GENDER,JOIN_DATE,AGREE) values 
(1,'impaerior@naver.com','1234','1981-10-23','남','2010-10-23','on');

select * from bruser;
SELECT sequence_name
FROM user_sequences;

create sequence bruser_seq;
alter table bruser modify user_id int;