<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="res/bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet"
	href="res/css/common/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" href="res/css/login.css">
<script type="text/javascript" src="res/js/jquery-3.4.1.js"></script>
<script type="text/javascript"
	src="res/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<script type="text/javascript"
	src="res/js/common/bootstrap-datetimepicker.js"></script>
<script type="text/javascript"
	src="res/js/common/bootstrap-datetimepicker.zh-CN.js"></script>
<script type="text/javascript" src="res/js/login.js"></script>
<title>管理员登录</title>
</head>
<body
	style="background-image: url('res/images/loginpage.jpg'); background-repeat: repeat-x; background-size: 100%;">
	<div align="center" style="margin-top: 100px;">
		<h3>
			<strong>管理员登录</strong>
		</h3>
		<br>
		<form action="${pageContext.request.contextPath }/base/loginCheck"
			method="post" class="form-inline" align="center" width="600px">
			<div class="form-group">
				<label>登&nbsp;&nbsp;录&nbsp;&nbsp;名：</label><input id="adminName"
					name="adminName" type="text" class="form-control" value="libai"
					style="width: 200px;">
			</div>
			<br> <br>
			<div class="form-group">
				<label>登录密码：</label> <input id="adminPassword" name="adminPassword"
					type="password" class="form-control" style="width: 200px;">
			</div>
			<br> <br>
			<div class="form-group" style="float:;">
				<label style="float:;">验&nbsp;&nbsp;证&nbsp;&nbsp;码：</label><input
					id="checkCode" name="checkCode" type="text" class="form-control"
					style="width: 100px; float:;">
				<div id="codeImg" class="codeImg" onclick="change()"
					style="float: right;">hello</div>
				<!-- <input id="codeImg" name="codeImg" type="text" class="form-control" value="" style="width: 90px;"> -->
			</div>
			<br> <br>
			<div class="form-group" align="center">
				<input id="login" onclick="loginCheck()" type="button"
					class="btn btn-default" value="登录">&nbsp;&nbsp;<input
					id="cancel" onclick="infoClear()" type="button"
					class="btn btn-default" value="重置">
			</div>
		</form>
	</div>
</body>
</html>