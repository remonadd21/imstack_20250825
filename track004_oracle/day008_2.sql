-- part) 테이블만들기
--✅ 문제 1:  다음과 같이 테이블을 작성하고 데이터를 삽입하세요
--※AppUser 의 FK는 무시하세요.
--
--#### 1. `MbtiType`
--| 필드명 | 타입 | 설명 |
--|--------|------|------|
--| mbti_type_id | INT (PK) | MBTI 유형 ID |
--| name | VARCHAR(10) | 유형 이름 (예: ENFP) |
--| description | TEXT | 성향 설명 |
--
--**예시 데이터**
--```sql
--(3, 'ENFP', '열정적이고 창의적인 성향')
--(7, 'INTJ', '논리적이고 전략적인 성향')
--```

CREATE TABLE   MbtiType (
  mbti_type_id  NUMBER  PRIMARY KEY,
  name          VARCHAR2(10) ,
  description   VARCHAR2(100)
);

-- NUMBER, VARCHAR2



--#### 2. `AppUser`
--| 필드명 | 타입 | 설명 |
--|--------|------|------|
--| app_user_id | INT (PK) | 사용자 고유 ID |
--| email | VARCHAR(100) | 이메일 주소 |
--| password | VARCHAR(255) | 암호화된 비밀번호 |
--| mbti_type_id | INT (FK → MbtiType.mbti_type_id) | 연결된 MBTI 유형 |
--| created_at | DATETIME | 가입일 |
--
--**예시 데이터**
--```sql
--(1, 'alice@example.com', 'hashed_pw_123', 3, 2, '2025-10-01 10:00:00')
--(2, 'bob@example.com', 'hashed_pw_456', 7, 1, '2025-10-02 14:30:00')
--```
CREATE  TABLE  AppUser(
    app_user_id   NUMBER(5)  PRIMARY KEY, 
    email         VARCHAR2(100) , 
    password      VARCHAR2(255) ,
    mbti_type_id  NUMBER(3), 
    created_at    DATE
);

desc appuser;
-- part) alter
--✅ 문제 1: AppUser 테이블에 사용자 이름(name) 컬럼을 추가하세요.
--컬럼 타입은 VARCHAR2(50)이며 NULL 허용
ALTER TABLE    AppUser    ADD  name  VARCHAR2(50);


--✅ 문제 2: AppUser 테이블의 email 컬럼에 NOT NULL 제약을 추가하세요.
ALTER TABLE    AppUser  modify   email varchar2(100)  not null;
 
--✅ 문제 3: AppUser 테이블의 password 컬럼 길이를 255 → 100으로 줄이세요.
ALTER TABLE    AppUser  modify    password varchar2(100);

--✅ 문제 4: MbtiType 테이블에 컬럼 category를 추가하세요.
--타입은 VARCHAR2(20)이며 기본값은 '기본'

ALTER TABLE MbtiType ADD category VARCHAR2(20) DEFAULT '기본';
DESC MbtiType;

SELECT COLUMN_NAME, DATA_DEFAULT
FROM USER_TAB_COLUMNS
WHERE TABLE_NAME='MBTITYPE';

 
--✅ 문제 5: MbtiType 테이블의 description 컬럼 이름을 details로 변경하세요. (pass)   REMANE

ALTER TABLE MbtiType RENAME COLUMN DESCRIPTION TO DETAILS;
DESC MbtiType;

 
--✅ 문제 6: AppUser 테이블의 name 컬럼을 삭제하세요.

ALTER TABLE AppUser DROP column name;
desc AppUser;
 
--✅ 문제 7:  MbtiType 테이블 이름을 MbtiInfo로 변경하세요. (pass)     REMANE     TO
ALTER TABLE MbtiType RENAME TO MbtiInfo;
desc MbtiInfo;

ALTER TABLE MbtiInfo RENAME TO MbtiType;
desc MbtiType;


