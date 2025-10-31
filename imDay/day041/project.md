
# 전체 컨셉트 : MBTI 기반 성향 맞춤 플랫폼
-- 단계별 기술확인

(1) 기획의도 :
MBTI Universe 는 성향기반으로 콘텐츠를 추천하고, 감정을 제어하며, 커뮤니티와 
일정을 연결하는 통합 라이프스타일 플랫폼 입니다. 다양한 기술 스택을 활용하여 모듈화된
구조로 개발되었으며 실무에서 요구되는 API 설계, 보안, UX 데이터 분석까지 모두 담았습니다.

(2) 연결구조 :

```
[1. jsp] → [2. spring mvc관리자 시스템]
                    ↓ 콘텐츠 등록
[3. SPRING Boot + Thymeleaf] ← 사용자 테스/ 추천

[4. Node + React ] ←  커뮤니티기능
[5. SPRING BOOT +JWT] ← 중앙서버
[6. flutter 모바일 앱] ← 모바일 앱
```

> 주제 : MBTI 테스트 + 결과 보기
1. Jsp + Oracle
> CRUD

아이디어
- MBTI 질문/보기 등록 (성향)
- 콘텐츠 미리보기 (ENTP)
- 추천 컨텐츠 (음악, 책, ,,,,)
- 유형별 콘텐츠 통계(간한한 그래프)
- 사용자 응답저장


>  주제: 추천 컨텐츠 등 록 및 관리 담당 (관리자용)
2. SPRING MVC + mybatis + Jstl(jsp)
> Spring MVC 확장 되기전에 초기 관리자 시스템 역할
- 콘텐츠 담당
- 질문 보기 담당
- 일정 미리 알림 담당
- ,,,,



> 주제 : MBTI 성향 기반 콘텐츠 추천 웹엠
3. SPRING Boot + Jpa + Thymeleaf(Spring)
> 유형별 인기 컨텐츠 랭킹
> 동적필터링 / 검색
> csv 업로드 질문 일괄등록...

> 주제 : MBTI 커뮤니티 + 취향 공유 플랫폼
4. Node + React
> SNS

> 주제 : MBTI 기반 라이프스타일 통합 앱
5. Spring boot + Jpa + Jwt + Redis + react 


> 주제: 모바일 UX
6. Flutter
> 모바일
