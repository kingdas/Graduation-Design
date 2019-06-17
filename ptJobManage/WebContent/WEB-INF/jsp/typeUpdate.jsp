<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/res/css/common/bootstrap-datetimepicker.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/res/js/jquery-3.4.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/res/js/common/bootstrap-datetimepicker.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/res/js/common/bootstrap-datetimepicker.zh-CN.js"></script>
<title>类型修改</title>
</head>
<body style="background: silver;">
	<div align="center">
		<h3>修改兼职类型</h3>
		<br>
		<form action="${pageContext.request.contextPath }/type/doUpdate"
			method="post" class="form-inline">
			<input type="hidden" id="id" name="id" value="${type.id }"> <input
				id="typeName" name="typeName" class="form-control" type="text"
				value="${type.typeName }" style="width: 300px;">&nbsp;&nbsp;<input
				type="submit" class="btn btn-default" value="修改">&nbsp;&nbsp;
			<button class="btn btn-default"
				onclick="javascript:history.back(-1);">返回</button>
		</form>
	</div>
</body>
</html>