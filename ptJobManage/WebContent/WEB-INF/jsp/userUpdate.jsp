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
	href="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/res/css/common/bootstrap-datetimepicker.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/res/js/jquery-3.4.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/res/js/common/bootstrap-datetimepicker.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/res/js/common/bootstrap-datetimepicker.zh-CN.js"></script>
<title>修改用户信息</title>
</head>
<body style="background: silver;">
	<div align="center">
		<h3>修改用户信息</h3>
		<br>
		<form action="${pageContext.request.contextPath }/user/doUpdate"
			method="post" class="form-horizontal" style="width: 800px;">
			<input type="hidden" name="id" id="id" value="${u.id }" />
			<div class="form-group">
				<label class="col-sm-2 control-label">姓名：</label>
				<div class="col-sm-4">
					<input id="userName" name="userName" type="text"
						value="${u.userName }" class="form-control">
				</div>
				<label class="col-sm-2 control-label">性别：</label>
				<div class="col-sm-4">
					<select id="userSex" name="userSex" class="form-control">
						<option value="男" ${u.userSex =="男"?"selected = 'selected'":'' }>男</option>
						<option value="女" ${u.userSex =="女"?"selected = 'selected'":'' }>女</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">年龄：</label>
				<div class="col-sm-4">
					<input id="userAge" name="userAge" type="text"
						value="${u.userAge }" class="form-control">
				</div>
				<label class="col-sm-2 control-label">学历：</label>
				<div class="col-sm-4">
					<input id="userDegree" name="userDegree" type="text"
						value="${u.userDegree }" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">爱好：</label>
				<div class="col-sm-4">
					<input id="userHobby" name="userHobby" type="text"
						value="${u.userHobby }" class="form-control">
				</div>
				<label class="col-sm-2 control-label">特长：</label>
				<div class="col-sm-4">
					<input id="userSpec" name="userSpec" type="text"
						value="${u.userSpec }" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">工作经验：</label>
				<div class="col-sm-4">
					<input id="userExp" name="userExp" type="text"
						value="${u.userExp }" class="form-control">
				</div>
				<label class="col-sm-2 control-label">电话号码：</label>
				<div class="col-sm-4">
					<input id="userTel" name="userTel" type="text"
						value="${u.userTel }" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">微信：</label>
				<div class="col-sm-4">
					<input id="userWeChat" name="userWeChat" type="text"
						value="${u.userWeChat }" class="form-control">
				</div>
				<label class="col-sm-2 control-label">QQ：</label>
				<div class="col-sm-4">
					<input id="userQQ" name="userQQ" type="text" value="${u.userQQ }"
						class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">登录名：</label>
				<div class="col-sm-4">
					<input id="userLoginName" name="userLoginName" type="text"
						value="${u.userLoginName }" class="form-control">
				</div>
				<label class="col-sm-2 control-label">登录密码：</label>
				<div class="col-sm-4">
					<input id="userPassword" name="userPassword" type="text"
						value="${u.userPassword }" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">备注：</label>
				<div class="col-sm-10">
					<input id="remark" name="remark" type="text" value="${u.remark }"
						class="form-control">
				</div>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-default">确定</button>
				&nbsp;&nbsp;&nbsp;
				<button class="btn btn-default"
					onclick="javascript:history.back(-1);">取消</button>
			</div>
		</form>
	</div>
</body>
</html>