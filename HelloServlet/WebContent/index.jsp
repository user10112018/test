<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloServlet</title>
</head>


<body>

<input type="button" value="HelloServlet" onClick="location.href='HelloServlet'">

<!-- P.6~ -->
<input type="button" value="WelcomeServlet" onClick="location.href='welcome.jsp'">

<!-- P.10~ -->
<input type="button" value="問合わせ" onClick="location.href='inquiry.jsp'">

<!-- P.22~ -->
<input type="button" value="MySQLServlet" onClick="location.href='MySQLServlet'">


<br>
<!-- P.14~ -->
GET通信
<form method="get" action="TestServlet">
<input type="text" name="username">
<input type="password" name="password">
<input type="submit" value="送信">
</form>

POST通信
<form method="post" action="TestServlet">
<input type="text" name="username">
<input type="password" name="password">
<input type="submit" value="送信">
</form>





</body>
</html>