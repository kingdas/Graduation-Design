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
<title>兼职类型列表</title>
</head>
<body style="background: silver;">
	<div align="center" style="margin-left: 15px; margin-right: 15px;">
		<h3>兼职类型列表</h3>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>序号</th>
					<th>类型名</th>
					<th>修改</th>
					<th>删除</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${tlis }" var="li">
					<tr>
						<td>${li.id }</td>
						<td>${li.typeName }</td>
						<td><a class="btn btn-default btn-xs"
							href="${pageContext.request.contextPath }/type/update/${li.id}">修改</a></td>
						<td><a class="btn btn-default btn-xs" href="#"
							onclick="delConfirm(${li.id})">删除</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
<script type="text/javascript">
function delConfirm(id){
	if(window.confirm("   确认删除？")){
		location.href = "del/"+id;
	}
}
</script>
</html>