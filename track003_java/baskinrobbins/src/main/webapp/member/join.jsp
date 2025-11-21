<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="../inc/header.jsp" %>
<!-- header -->
<div class="container mt-5">
	<h3>WELCOME! 회원가입</h3>
	<div id="spoon"><img src="<%=request.getContextPath()%>/member/bigspoon.jpg" alt="bigspoon"/></div>
	<form action="<%=request.getContextPath()%>/join.do" method="post">
		<div class="mb-3">
			<label for="userId" class="form-label">아이디:</label> 
			<input type="userName" class="form-control" id="userId"
				placeholder="Enter id"  name="userId">
		</div>
		<div class="mb-3">
			<label for="userName" class="form-label">이름:</label> 
			<input type="userName" class="form-control" id="userName"
				placeholder="Enter name"  name="userName">
		</div>
		<div class="mb-3 mt-3">
			<label for="email" class="form-label">이메일:</label> 
			<input type="email" class="form-control" id="email"
				placeholder="Enter email"  name="email">
		</div>
		<div class="mb-3">
			<label for="passw" class="form-label">암호:</label> 
			<input type="password" class="form-control" id="passw"
				placeholder="Enter password"  name="passw">
		</div>
		<div class="mb-3">
			<label for="birth" class="birth">생일: </label> 
			<input type="date" class="birth" id="birth"
				placeholder="Enter birth"  name="birth">
		</div>
			<div class="mb-3">
			<span>성별: </span>
			<select id="gender" name="gender">
				<option>성별 선택</option>
				<option value="남자">남자</option>
				<option value="여자">여자</option>
			</select>
		</div>
		<div class="mb-3">
			<label for="joindate" class="form-label">가입일:</label> 
			<input type="date" class="joindate" id="joindate"
				placeholder="가입일"  name="joindate">
		</div>
		<div class="mb-3">
			<span>마케팅 수신동의: </span>
			<label for="yes">yes</label> 
			<input type="radio" id="yes"name="chk">
			<label for="no">no</label> 
			<input type="radio" id="no"name="chk">
		</div>
		<button type="submit" class="btn">Submit</button>
	</form>
</div>

<!-- footer -->
<!-- footer -->
<!-- footer -->
<%@ include file="../inc/footer.jsp" %>

<!-- footer -->
<!-- footer -->
<!-- footer -->

<!-- 

CREATE TABLE BRUSER (
  

    PHONE_NUMBER    VARCHAR2(15),                       -- 전화번호
    EMAIL           VARCHAR2(100),                      -- 이메일
    Pass			varchar(50)
    BIRTH_DATE      DATE,                               -- 생년월일
    GENDER          CHAR(1),                            -- 성별 (M/F)
    JOIN_DATE       DATE DEFAULT SYSDATE,               -- 가입일
    MARKETING_AGREE CHAR(1) DEFAULT 'N'                -- 마케팅 수신 동의 여부 (Y/N)
);



 -->