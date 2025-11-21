<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../inc/header.jsp" %>
<!-- header -->
<!-- header -->
<!-- header -->


<div class="container mt-5">
	<h3>LOGIN</h3>
	<form action="login_process.jsp" method="post">
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
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</div>

<!-- footer -->
<!-- footer -->
<!-- footer -->
<%@ include file="../inc/footer.jsp" %>
</body>
</html>
