<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../inc/header.jsp" %>
<!-- header -->
<!-- header -->
<!-- header -->


<div class="container mt-5">
	<h3>WELCOME! 회원가입</h3>
	<form action="join_process.jsp" method="post">
		<div class="mb-3 mt-3">
			<label for="email" class="form-label">Email:</label> 
			<input type="email" class="form-control" id="email"
				placeholder="Enter email" required name="email">
		</div>
		<div class="mb-3">
			<label for="password" class="form-label">Password:</label> 
			<input type="password" class="form-control" id="password"
				placeholder="Enter password" required name="password">
		</div>
		<div class="mb-3">
			<label for="MBTI_TYPE_ID " class="form-label">MBTI 유형:</label>
			<select id="MBTI_TYPE_ID " name="MBTI_TYPE_ID" required class="form-control">
				<option value="1">ISTJ</option>
				<option value="2">ISFJ</option>
				<option value="3">INFJ</option>
				<option value="4">INTJ</option>
			    <option value="5">ISTP</option>
			    <option value="6">ISFP</option>
			    <option value="7">INFP</option>
			    <option value="8">ENTP</option>
			    <option value="9">ESTP</option>
			    <option value="10">ESFP</option>
			    <option value="11">ENFP</option>
			    <option value="12">ENTP</option>
			    <option value="13">ESTJ</option>
			    <option value="14">ESFJ</option>
			    <option value="15">ENFJ</option>
			    <option value="16">ENTJ</option>
				
				
			</select>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</div>

<!-- footer -->
<!-- footer -->
<!-- footer -->
<%@ include file="../inc/footer.jsp" %>
</body>
</html>
