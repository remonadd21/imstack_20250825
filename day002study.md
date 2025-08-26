1. 정리하기

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

day002.md                                   day002.md

```내프로필                                  ```내프로필1
impaerior.gif                               bradforman.gif
```                                         ```
0) ctrl + s (수정후 저장)                     5) ctrl + s (수정후 저장)
1) git add .                                6) git add .  
2) git commit -m "프로필-impaerior"          7) git commit -m "프로필-brad"   
3) git pull origin master                   8) git pull origin master  
4) git push origin master                   9) git push origin master 

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
이 명령어로 원격 저장소에 어떤 브랜치가 있는지 확인할 수 있어요. 예를 들어 refs/heads/master가 보이면 main이 아니라 master 브랜치를 써야 해요.

올바른 브랜치로 pull 하기

```

```bash
>> git pull origin master
만약 master 브랜치가 존재한다면 이렇게 바꿔서 실행해 보세요.

기본 브랜치 확인 (GitHub 기준)

GitHub 저장소에 들어가서 Settings > Branches에서 기본 브랜치가 무엇인지 확인할 수 있어요.

필요하다면 원격 저장소의 브랜치 이름을 main으로 바꾸는 것도 가능해요. 혹시 로컬 브랜치와 원격 브랜치가 엇갈려 있다면, git branch -a로 로컬과 원격 브랜치 목록을 함께 확인해보는 것도 좋아요.

원격 저장소 주소나 브랜치 구조를 조금 더 알려주시면, 더 정확하게 도와드릴 수 있어요!

```
