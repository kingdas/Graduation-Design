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
<script type="text/javascript" src="../res/js/jquery-3.4.1.js"></script>
<script type="text/javascript"
	src="../res/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<!-- <script type="text/javascript" src="../res/js/userList.js"></script> -->
<title>用户列表</title>
</head>
<body style="background: silver;">
	<div align="center" style="margin-left: 15px; margin-right: 15px;">
		<h3>用户信息</h3>
		<br>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>序号</th>
					<th>姓名</th>
					<th>性别</th>
					<th>年龄</th>
					<th>学历</th>
					<th>爱好</th>
					<th>特长</th>
					<th>工作经验</th>
					<th>电话号码</th>
					<th>微信</th>
					<th>QQ</th>
					<th>登录名</th>
					<th>密码</th>
					<th>备注</th>
					<th>修改</th>
					<th>删除</th>
			</thead>
			<tbody>
				<c:forEach items="${lis }" var="li">
					<tr>
						<td>${li.id }</td>
						<td>${li.userName }</td>
						<td>${li.userSex }</td>
						<td>${li.userAge }</td>
						<td>${li.userDegree }</td>
						<td>${li.userHobby }</td>
						<td>${li.userSpec }</td>
						<td>${li.userExp }</td>
						<td>${li.userTel }</td>
						<td>${li.userWeChat }</td>
						<td>${li.userQQ }</td>
						<td>${li.userLoginName }</td>
						<td>${li.userPassword }</td>
						<td>${li.remark }</td>
						<td>
							<%-- <button class="btn btn-default btn-xs" onclick="update(${li.id})">修改</button> --%>
							<a type="button" class="btn btn-default btn-xs"
							href="${pageContext.request.contextPath }/user/update/${li.id}">修改</a>
						</td>
						<td><a type="button" class="btn btn-default btn-xs" href="#"
							onclick="delConfirm(${li.id})">删除</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
<script type="text/javascript">
function delConfirm(id) {
	console.log(id);
	if (window.confirm("     确认删除？")) {
		location.href = "del/" + id;
	}
};
function update(id) {
	location.href = "update/"+id;
}
</script>
</html>