<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

function registerStudent() {
	alert("IN-Register");
	document.fn.action="openregpage";
	document.fn.submit();
	
}

function deleteStudent() {
	alert("IN-Delete");
	document.fn.action="delete";
	document.fn.submit();
	
}

function editStudent() {
	alert("IN-Edit");
	document.fn.action="edit";
	document.fn.submit();
	alert("Data Successfully Updated...")
	
}
</script>
</head>
<body>
<div align="right">
<a href="logout">LogOut</a>
</div>
${msg}
<form name="fn">
<table border="2">
<tr>
<th>Select</th>
<th>Name</th>
<th>UserName</th>
<th>Password</th>
<th>Action</th>
</tr>

<c:forEach items="${data }" var="s">
<tr>
<td> <input type="radio" name="rollno" value="${s.rollno }"></td>
<td>${s.name }</td>
<td>${s.username }</td>
<td>${s.password }</td>
<td><a href="edit?rollno=${s.rollno }">EDIT</a> || <a href="delete?rollno=${s.rollno }">DELETE</a></td>
</c:forEach>

</table>
<br>
<input type="button" value="ADD" onclick="registerStudent()"><br>
<br>
<input type="button" value="DELETE" onclick="deleteStudent()"><br>
<br>
<input type="button" value="EDIT" onclick="editStudent()">

</form>
</body>
</html>