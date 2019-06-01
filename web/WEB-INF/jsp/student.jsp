
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
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row" style="height: 400px;">
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">sname</th>
						<th scope="col">gender</th>
						<th scope="col">birth</th>
						<th scope="col">loc</th>
						<th scope="col">ethnic</th>

					</tr>
				</thead>

				<tbody>
					<c:forEach items="${result}" var="list">
						<tr>
							<th scope="row">${list.sid}</th>
							<td>${list.sname}</td>
							<td>${list.gender}</td>


							<td><fmt:formatDate value="${list.birth}"
									pattern="yyyy/MM/dd" /></td>
							<td>${list.loc}</td>
							<td>${list.ethnic}</td>

							<td><a href="${list.sid}/show">查看</a> <a
								href="${list.sid}/update">修改</a> <a href="${list.sid}/delete"
								onClick="return confirm('确定删除${list.sname}吗?');">删除</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="row"></div>
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

</body>
</html>