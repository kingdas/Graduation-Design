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
<title>修改兼职信息</title>
</head>
<body style="background: silver;">
	<div align="center">
		<h3>修改兼职信息</h3>
		<br>
		<form action="${pageContext.request.contextPath }/job/doUpdate"
			method="post" class="form-horizontal"
			style="width: 800px; text-align: center;">
			<input type="hidden" name="id" id="id" value="${job.id }">
			<div class="form-group">
				<label class="col-sm-2 control-label">兼职名称：</label>
				<div class="col-sm-4">
					<input value="${job.jobName }" id="jobName" name="jobName"
						class="form-control" type="text">
				</div>
				<label class="col-sm-2 control-label">兼职类型： </label>
				<div class="col-sm-4">
					<select id="jobType" name="jobType" class="form-control">
						<c:forEach items="${types }" var="ty">
							<option value="${ty.id }"
								${job.jobType == ty.id? "selected = 'selected'":'' }>${ty.typeName }</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">工作要求：</label>
				<div class="col-sm-4">
					<input value="${job.jobRequire }" id="jobRequire" name="jobRequire"
						class="form-control" type="text">
				</div>
				<label class="col-sm-2 control-label">工作地点：</label>
				<div class="col-sm-4">
					<input value="${job.jobPlace }" id="jobPlace" name="jobPlace"
						class="form-control" type="text">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">薪资待遇：</label>
				<div class="col-sm-4">
					<input value="${job.jobSalary }" id="jobSalary" name="jobSalary"
						class="form-control" type="number">
				</div>
				<label class="col-sm-2 control-label">电话号码：</label>
				<div class="col-sm-4">
					<input value=${job.jobTel } id="jobTel" name="jobTel"
						class="form-control" type="text">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">时间：</label>
				<div class="col-sm-4">
					<input value="${job.jobTime }" id="jobTime" name="jobTime"
						class="form_datetime form-control" type="text"
						data-date-format="yyyy-mm-dd hh:ii:ss">
				</div>
				<label class="col-sm-2 control-label">备注：</label>
				<div class="col-sm-4">
					<input value="${job.jobRemark }" id="jobRemark" name="jobRemark"
						class="form-control" type="text">
				</div>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-default">提交</button>
				&nbsp;&nbsp;&nbsp;
				<button type="button" class="btn btn-default"
					onclick="javascript:history.back(-1);">取消</button>
			</div>
		</form>
	</div>
</body>
</html>