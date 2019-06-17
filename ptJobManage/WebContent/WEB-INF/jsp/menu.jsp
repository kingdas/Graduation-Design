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
<title>菜单栏</title>
<style type="text/css">
a {
	font-weight: bolder;
	font-style: normal;
	color: red;
}

.userManage {
	font-weight: normal;
	color: blue;
}
</style>
</head>
<body style="background: silver;">
	<div align="center">
		<br> <br>
		<ul>
			<li><a id="userManage">用&nbsp; 户 &nbsp; 管&nbsp; 理</a></li>
			<br>
			<li class="userManage"><a class="userManage"
				href="${pageContext.request.contextPath }/user/list" target="main"><u>用&nbsp;
						户&nbsp; 列&nbsp; 表</u></a></li>
			<br class="userManage">
			<li class="userManage"><a class="userManage"
				href="${pageContext.request.contextPath }/base/userAdd"
				target="main"><u>添&nbsp; 加&nbsp; 用&nbsp; 户</u></a></li>
			<br class="userManage">
			<li><a id="jobManage"
				href="${pageContext.request.contextPath }/job/list" target="main">兼职信息列表</a></li>
			<br>
			<li><a id="typeManage"
				href="${pageContext.request.contextPath }/type/list" target="main">兼职类型列表</a></li>
			<br>
			<li><a id="typeManage"
				href="${pageContext.request.contextPath }/base/typeAdd"
				target="main">添加兼职类型</a></li>

		</ul>
	</div>
</body>
<script type="text/javascript">
	$(function() {
		$(".userManage").hide();
	});
	$("#userManage").click(function() {
		$(".userManage").toggle();
	});
</script>
</html>