<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header/header.jsp"%>
<div class="container">
	<table class="table table-dark table-striped">
		<thead>
			<tr>
				<th>id</th>
				<th>username</th>
				<th>email</th>
				<th>role</th>
				<th>delete</th>
			</tr>
		</thead>

		<c:forEach var="user" items="${users}">
			<tbody>
				<tr>
					<td>${user.id}</td>
					<td>${user.username}</td>
					<td>${user.email}</td>
					<td>${user.role}</td>
					<td>
					<c:if test="${sessionScope.principal.username == 'admin' || sessionScope.principal.id == user.id}">
					<a
						href="<%=request.getContextPath()%>/user?cmd=delete&id=${user.id}"
						class="btn btn-primary">삭제</a>
					</c:if>
				
					</td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
</div>
<script src="/js/delete.js"></script>
</body>
</html>