<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>添加用户</title>
<link rel="stylesheet"
	href="../res/bootstrap-3.3.7-dist/css/bootstrap.css">
<script type="text/javascript" src="../res/js/jquery-3.4.1.js"></script>
<script type="text/javascript"
	src="../res/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
</head>
<body style="background: silver;">
	<div align="center">
		<h3>添加用户</h3>
		<br>
		<form action="${pageContext.request.contextPath }/user/add"
			method="post" class="form-horizontal" style="width: 800px;">
			<div class="form-group">
				<label class="col-sm-2 control-label">姓名：</label>
				<div class="col-sm-4">
					<input id="userName" name="userName" type="text"
						class="form-control">
				</div>
				<label class="col-sm-2 control-label">性别：</label>
				<div class="col-sm-4">
					<select id="userSex" name="userSex" class="form-control">
						<option value="男">男</option>
						<option value="女">女</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">年龄：</label>
				<div class="col-sm-4">
					<input id="userAge" name="userAge" type="text" class="form-control">
				</div>
				<label class="col-sm-2 control-label">学历：</label>
				<div class="col-sm-4">
					<input id="userDegree" name="userDegree" type="text"
						class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">爱好：</label>
				<div class="col-sm-4">
					<input id="userHobby" name="userHobby" type="text"
						class="form-control">
				</div>
				<label class="col-sm-2 control-label">特长：</label>
				<div class="col-sm-4">
					<input id="userSpec" name="userSpec" type="text"
						class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">工作经验：</label>
				<div class="col-sm-4">
					<input id="userExp" name="userExp" type="text" class="form-control">
				</div>
				<label class="col-sm-2 control-label">电话号码：</label>
				<div class="col-sm-4">
					<input id="userTel" name="userTel" type="text" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">微信：</label>
				<div class="col-sm-4">
					<input id="userWeChat" name="userWeChat" type="text"
						class="form-control">
				</div>
				<label class="col-sm-2 control-label">QQ：</label>
				<div class="col-sm-4">
					<input id="userQQ" name="userQQ" type="text" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">登录名：</label>
				<div class="col-sm-4">
					<input id="userLoginName" name="userLoginName" type="text"
						class="form-control">
				</div>
				<label class="col-sm-2 control-label">登录密码：</label>
				<div class="col-sm-4">
					<input id="userPassword" name="userPassword" type="text"
						class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">备注：</label>
				<div class="col-sm-10">
					<input id="userLoginName" name="userLoginName" type="text"
						class="form-control">
				</div>

			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-default">提交</button>
				&nbsp;&nbsp;&nbsp;
				<button class="btn btn-default">取消</button>
			</div>
		</form>
	</div>
</body>
</html>