## Track001 정리하기

[내 컴퓨터] - [github 클라우드]
day002.md

```내프로필
impaerior.gif
```

``` 업로드시 사용한 방법
git add . 
git commit -m "프로필 추가"
git push origin master

```
---

[내 컴퓨터] - [github 클라우드] - [친구 컴퓨터]

:: 내 파일을 내 친구가 자신의 컴퓨터에서 동일한 파일에 올리거나 수정할때
:: 변환해야 하는 파일을 만들고, "pull" 로 최신의 자료를 가져온 다음, "push" 해서 올린다.

day002.md                                   

```내프로필                                  
impaerior.gif                               
```                                       
0) ctrl + s (수정후 저장)                     
1) git add .                                    
2) git commit -m "프로필-impaerior"             
3) git pull origin master                    
4) git push origin master                  

day002.md
bradforman.gif
5) ctrl + s (수정후 저장)
6) git add .
7) git commit -m "프로필-brad" 
8) git pull origin master 
9) git push origin master 

```

---



2. 작업하기

1) [git-로컬]  day002study.md 파일 만들기
2) [git-로컬]  day002study.md 파일 올리기 (github)
3) [github]  github에서 day002study.md 파일 수정
4) [git-로컬]  day002study.md 파일 수정후 commit

```bash

git add .
git commit -m "day002.md study 파일 수정"


5) [git-로컬] git pull origin main   "충돌발생"

---
3. 트러블 슈팅

오늘
코드의 오류를 찾아줘 ```PS F:\imminjae\workspace> git pull origin main fatal: couldn't find remote ref main
오류 메시지 fatal: couldn't find remote ref main은 Git이 원격 저장소에서 main이라는 브랜치를 찾을 수 없다는 뜻이에요. 이 문제는 보통 다음과 같은 이유로 발생합니다:

🧠 원인 분석
원격 저장소에 main 브랜치가 없음

GitHub이나 다른 원격 저장소에서 기본 브랜치가 master일 수 있어요.

브랜치 이름 오타

main 대신 Main처럼 대소문자가 다르면 인식하지 못해요.

원격 저장소 설정 오류

origin이 올바른 저장소를 가리키고 있는지 확인이 필요해요.

---

🛠️ 해결 방법
원격 브랜치 목록 확인

```bash
git ls-remote --heads origin
이 명령어로 원격 저장소에 어떤 브랜치가 있는지 확인할 수 있어요. 예를 들어 refs/heads/master가 보이면 main이 아니라
master 브랜치를 써야 해요.

올바른 브랜치로 pull 하기

```

```bash
>> git pull origin master
만약 master 브랜치가 존재한다면 이렇게 바꿔서 실행해 보세요.

기본 브랜치 확인 (GitHub 기준)

GitHub 저장소에 들어가서 Settings > Branches에서 기본 브랜치가 무엇인지 확인할 수 있어요.

필요하다면 원격 저장소의 브랜치 이름을 main으로 바꾸는 것도 가능해요. 혹시 로컬 브랜치와 원격 브랜치가 엇갈려 있다면,
git branch -a로 로컬과 원격 브랜치 목록을 함께 확인해보는 것도 좋아요.

원격 저장소 주소나 브랜치 구조를 조금 더 알려주시면, 더 정확하게 도와드릴 수 있어요! ★
```


## Track002 - html + css + js / jQuery (WEB BASIC)

1. 웹의 작업 순서
    1) html은 구조를 작성함
    2) css 꾸미기
    3) js/jQuery/react는 동작을 담당함
    4) jsp + oracle 서버전송 + 데이터 저장


2. html 파일 템플릿

    > 단축키 !(느낌표) + ENTER을 하면 기본 html 구조가 만들어진다.
    > html  : 문서의 시작과 끝
    > head  : 문서 정보
    > body  : 사용자에게 보이는 내용
    > 모든 언어는 소문자로 사용 권장! 
    > 시작과 끝나는 태그 사용


```
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>web_basic001</title>
</head>
<body>
    <h3>오랫만이다!</h3>
</body>
</html>

```

---
## Track003 - 자바설치

0) java 란?
    - 한 번 작성하면 어디서든 실행이 된다.
    - JDK 설치 -> 작성 -> 컴파일 -> 실행
    - JVM 운영체제의 다른 차이점을 처리하여  개발자는 프로그램 작성에만 집중 할 수 있도록 함
    - 객체지향 언어


1) java.sun.com
2) https://www.oracle.com/java/technologies/?er=221886
3) 설치 후( next, next , close ) , 주소줄 복사
C:\Program Files\Java\jdk-11

4) 내컴퓨터 - [속성] - 시스템 속성 - 고급 탭 - 환경변수 
    또는 윈도우의 검색에서 환경변수 검색하기 > 시스템 속성 창의 하단의 환경변수 버튼 클릭


   시스템 변수 (아래 창에서 "새로만들기 클릭 후" 아래 설정)
   새로 만들기 ::         
    변수 이름   JAVA_HOME   
    변수 값     C:\Program Files\Java\jdk-11
   
   Path 찾아서 추가하기 ::    
    오른쪽에서 새로 만들기 클릭하고 붙여넣기 : %JAVA_HOME%\bin   
    가장 하단의 만들어진 값을 가장 위로 이동 시키기

    확인, 확인으로 마무리 

5. java setting - ECLIPSE(1) 설치

1) eclipse.org
2) [download]  - Eclipse IDE for Java EE Developers

3) 다운 받은 아이콘 2번 클릭
    > 2번째 메뉴 선택
    > 폴더 모양 아이콘 위에거는 그대로 두고, 
    아래거는 해당 경로에 폴더 만들고 지정하기F:\imminjae\workspace\track003_java

    > Launch 버튼 클릭 후, 경로에 F:\imminjae\workspace\track003_java 설정
    > git 허브를 이용하여 올릴 수 있는 경로임
    > git add . 은 모든 파일
    > git add day002.md는 해당 파일만 선택


6. java setting - ECLIPSE(2) 셋팅
1) perspective : 개발에 융용한 view들 만 묶어놓은 작업창
    window - perspective - open perspective - java 를 선택하여,  java 환경만들기

2) utf-8  셋팅 (글꼴)
    window - preferences - 검색 (enc) 의 utf8 (6개 항목 확인)


3) 이클립스 단축키
    - 명령어 불러오기   ctrl + space
    - 주석             ctrl + shift + / (슬러시)    되돌리기는 (\ 백슬러시)
    - import          ctrl + shift + o 
    - 정렬             ctrl + shift +  f
    - 한 줄 정렬        ctrl + alt + j