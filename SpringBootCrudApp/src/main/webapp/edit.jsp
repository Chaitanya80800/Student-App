<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<pre>
<input type="hidden" name="rollno" value="${stu.rollno }">
Name:<input type="text" name="name" value="${stu.name }"><br>
Username:<input type="text" name="username" value="${stu.username }"><br>
Password:<input type="text" name="password" value="${stu.password }"><br>
<input type="submit" value="UPDATE"><br>

</pre>
</form>
</body>
</html>