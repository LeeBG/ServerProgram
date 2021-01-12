<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header/header.jsp"%>
<h1>인덱스페이지 입니다.</h1>
<%
	RequestDispatcher dis = request.getRequestDispatcher("user?cmd=list");
	dis.forward(request, response);
%>