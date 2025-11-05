<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../inc/header.jsp" %>
	<div class="container card my-5 p-4">
		<h3 class="card-header">Baskin-Robbins 글쓰기</h3>
		<form action="<%=request.getContextPath()%>/write.do" method="post">
		  <div class="mb-3 mt-3">
		    <label for="userid" class="form-label">userid:</label>
		    <input type="text" class="form-control" id="userid" placeholder="내용을 입력해 주세요." name="userid">
		  </div>
		  <div class="mb-3 mt-3">
		    <label for="username" class="form-label">username:</label>
		    <input type="text" class="form-control" id="username" placeholder="내용을 입력해 주세요." name="username">
		  </div>
		  <div class="mb-3">
		    <label for="userpass" class="form-label">userpass:</label>
		    <input type="password" class="form-control" id="userpass" placeholder="Enter password" name="userpass">
		  </div>
		  <div class="mb-3 mt-3">
		    <label for="title" class="form-label">title:</label>
		    <input type="text" class="form-control" id="title" placeholder="내용을 입력해 주세요." name="title">
		  </div>
		  <div class="mb-3">
		    <label for="content" class="form-label">content:</label>
		    <textarea class="form-control" id="content" placeholder="내용을 입력해 주세요." name="content"></textarea>
	      </div>
		  <div class="mb-3">
		    <label for="usericename" class="form-label">메뉴 선택하기:</label>
		    <select id="usericename" name="usericename">
		    	<option value="골든 프랄린 버터">골든 프랄린 버터</option>
		    	<option value="핑크 베리 말차">핑크 베리 말차</option>
		    	<option value="초코포키해">초코포키해</option>
				<option value="말차다미아">말차다미아</option>
				<option value="너는 참 달고나">너는 참 달고나</option>
				<option value="찰떡이구마">찰떡이구마</option>
				<option value="골든 애플 요거트">골든 애플 요거트</option>
				<option value="아이스 맥심 모카골드">아이스 맥심 모카골드</option>
				<option value="사랑에 빠진 딸기">사랑에 빠진 딸기</option>
				<option value="피치 요거트">피치 요거트</option>
				<option value="피치 팡 망고 팡">피치 팡 망고 팡</option>
				<option value="수박 히어로">수박 히어로</option>
				<option value="소금 우유 아이스크림">소금 우유 아이스크림</option>
				<option value="마법사의 비밀 레시피">마법사의 비밀 레시피</option>
				<option value="엄마는 외계인">엄마는 외계인</option>
				<option value="민트 초콜릿 칩">민트 초콜릿 칩</option>
				<option value="뉴욕 치즈케이크">뉴욕 치즈케이크</option>
				<option value="레인 보우 샤페트">레인 보우 샤페트</option>
				<option value="체리츄빌레">체리츄빌레</option>
				<option value="슈팅스타">슈팅스타</option>
				<option value="오레오 쿠키앤 크림">오레오 쿠키앤 크림</option>
				<option value="베리베리 스트로베리">베리베리 스트로베리</option>
				<option value="31요거트">31요거트</option>
				<option value="바람과 함께 사라지다">바람과 함께 사라지다</option>
				<option value="이상한 나라라의 솜사탕">이상한 나라라의 솜사탕</option>
				<option value="피스타치오 아몬드">피스타치오 아몬드</option>
				<option value="초콜릿 무스">초콜릿 무스</option>
				<option value="그린티">그린티</option>
				<option value="초콜릿">초콜릿</option>
				<option value="자모카 아몬드 훠지">자모카 아몬드 훠지</option>
				<option value="아몬드 봉봉">아몬드 봉봉</option>
				<option value="바닐라">바닐라</option>
		    </select>
		  </div>

	      <div>
			<button type="submit" class="btn btn-primary">글쓰기</button>
			<a href="<%=request.getContextPath()%>/list.do" title="목록보기" class="btn btn-primary">목록보기</a>
		  </div>
		</form>
	</div>
<%@include file="../inc/footer.jsp" %>