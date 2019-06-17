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
<title>top</title>
</head>
<body style="background-image: url('../res/images/top2.jpg');">
	<div style="margin-top: 80px; margin-left: 87%;">
		<font size="3" color="blue">当前用户</font>：&nbsp;<u>${admName }</u>&nbsp;&nbsp;&nbsp;&nbsp;
		<a type="button" class="btn btn-default btn-xs" id="logout"
			href="logout" target="_top"><font color="red">注销</font></a>
	</div>
</body>
</html>