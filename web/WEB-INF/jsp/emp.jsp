<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tbody>
			<c:forEach items="${result}" var="list">
				<tr>
					<th scope="row">${list.empno}</th>
					<td>${list.ename}</td>
					<td>${list.job}</td>
					<td>${list.mgr}</td>

					<td>${list.hiredate}</td>
					<td>${list.sal}</td>
					<td>${list.deptno}</td>
				</tr>
			</c:forEach>


		</tbody>
	</table>
</body>
</html>