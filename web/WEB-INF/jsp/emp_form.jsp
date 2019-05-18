<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>员工表单</title>
</head>
<body>
	<div class="container">
		<h2>员工管理</h2>
		<form:form method="post" id="emp_form" modelAttribute="emp"
			action="add">
			<div class="form-group row">
				<label for="emp_id" class="col-sm-2 col-form-label">emp编号:</label>
				<div class="col-sm-4">
					<form:input path="empno" type="text" readonly="readonly"
						class="form-control-plaintext" id="emp_id" />
				</div>
			</div>
			<div class="form-group row">
				<label for="emp_name" class="col-sm-2 col-form-label">员工名称:</label>
				<div class="col-sm-4">
					<form:input path="ename" type="text" class="form-control"
						id="emp_name" />
				</div>
			</div>
			
			<div class="form-group row">
				<label for="emp_loc" class="col-sm-2 col-form-label">job:</label>
				<div class="col-sm-4">
					<form:input path="job" type="text" class="form-control"
						id="emp_loc" />
				</div>
			</div>
			
			<div class="form-group row">
				<label for="emp_loc" class="col-sm-2 col-form-label">mgr:</label>
				<div class="col-sm-4">
					<form:input path="mgr" type="text" class="form-control"
						id="emp_loc" />
				</div>
			</div>
			
			<div class="form-group row">
				<label for="emp_loc" class="col-sm-2 col-form-label">hiredate:</label>
				<div class="col-sm-4">
					<form:input path="hiredate" type="text" class="form-control"
						id="emp_loc" />
				</div>
			</div>
			
			<div class="form-group row">
				<label for="emp_loc" class="col-sm-2 col-form-label">sal:</label>
				<div class="col-sm-4">
					<form:input path="sal" type="text" class="form-control"
						id="emp_loc" />
				</div>
			</div>
			
			<div class="form-group row">
				<label for="emp_loc" class="col-sm-2 col-form-label">deptno:</label>
				<div class="col-sm-4">
					<form:input path="deptno" type="text" class="form-control"
						id="emp_loc" />
				</div>
			</div>
			
			<button type="button" class="btn"
				onclick="window.location.href='update'">Reset</button>
			<button id="emp_submit" type="submit" class="btn btn-primary">修改</button>
		</form:form>
	</div>
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/dept.js"></script>
	<script type="text/javascript">
		window.onload = function() {
			initForm('${status}');
		}
	</script>
</body>
</html>