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
	href="../res/bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet"
	href="../res/css/common/bootstrap-datetimepicker.min.css">
<script type="text/javascript" src="../res/js/jquery-3.4.1.js"></script>
<script type="text/javascript"
	src="../res/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<script type="text/javascript"
	src="../res/js/common/bootstrap-datetimepicker.js"></script>
<script type="text/javascript"
	src="../res/js/common/bootstrap-datetimepicker.zh-CN.js"></script>
<title>兼职类型添加</title>
</head>
<body style="background: silver;">
	<div align="center">
		<h3>添加兼职类型</h3>
		<br>
		<form action="${pageContext.request.contextPath }/type/add"
			method="post" class="form-inline">
			<label>兼职名称：</label> <input id="typeName" name="typeName"
				class="form-control" type="text" style="width: 300px;">&nbsp;&nbsp;&nbsp;
			<button type="submit" class="btn btn-default">提交</button>
		</form>
	</div>
</body>
</html>