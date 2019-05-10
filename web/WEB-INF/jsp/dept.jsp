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
					<th scope="row">${list.deptno}</th>
					<td>${list.dname}</td>
					<td>${list.loc}</td>
					<td><a href="${list.deptno}/update">修改</a> <a
						href="${list.deptno}/delete"
						onClick="return confirm('确定删除${list.dname}吗?');">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>