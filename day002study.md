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
5) [git-로컬] git pull origin main   충돌발생