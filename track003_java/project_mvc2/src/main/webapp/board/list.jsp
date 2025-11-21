<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include  file="../inc/header.jsp" %>
<!--  END HEADER -->
<!--  END HEADER -->
<!--  END HEADER -->
<%@ taglib  prefix="c"   uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 
0. null일경우 (list띄울때)
1. result가 0보다 클때 (write에서 글쓰기 하고 온경우)  - 글쓰기에 성공했습니다.
2. 0보다 작을때 - 관리자에게문의해주세요
 -->
<c:choose>
	<c:when  test="${requestScope.result eq null}"></c:when>
	<c:when  test="${requestScope.result == 1}"><script>alert( '${result_content}' );</script></c:when>	
	<c:when  test="${requestScope.result == 0}"><script>alert( '비밀번호를 확인해주세요' ); history.go(-1);</script></c:when>	
	<c:when  test="${requestScope.result == -1}"><script>alert('관리자에게문의해주세요.'); history.go(-1);</script></c:when>	
</c:choose>
<!-- 
<script>
	if( ${requestScope.result > 0}){ alert('글쓰기에 성공했습니다.'); }
	else if( ${requestScope.result   != null}){ alert('관리자에게 문의해주세요.');  history.go(-1); }
</script> -->
<div class="container"   style="margin-top:5%; min-height:500px">
	<h3>MULTIBOARD</h3>
	<table  class="table table-striped">
		<caption>MULTIBOARD - MVC1</caption>
		<thead>
			<tr><th scope="col">NO</th><th scope="col">TITLE</th>
			      <th scope="col">WRITER</th><th scope="col">DATE</th><th scope="col">HIT</th></tr>
		</thead>
		<tbody>
			<c:forEach   var="list"  items="${list}"  varStatus="status">
				 <tr><td>${total-status.index}</td>   
				       <td><a href="${pageContext.request.contextPath}/detail.do?bno=${list.bno}">${list.btitle}</a></td>
				     <td>${list.bname}</td><td>${list.bdate}</td><td>${list.bhit}</td></tr>
			</c:forEach>
<!-- 			<tr><td>1</td><td><a href="detail.jsp">첫번재 글쓰기입니다.</a></td>
				  <td>ADMIN</td><td>2020-01-02 13:14:30</td><td>1</td></tr> -->
		</tbody>
	</table>
	<p  class="text-right"><a href="${pageContext.request.contextPath}/write_view.do"   class="btn btn-danger">글쓰기</a></p>
</div>

<!-- END FOOTER -->
<!-- END FOOTER -->
<!-- END FOOTER -->
<!-- END FOOTER -->
<%@ include  file="../inc/footer.jsp" %>