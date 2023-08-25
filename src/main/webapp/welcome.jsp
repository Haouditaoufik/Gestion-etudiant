<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form  method="get"   action="ServletWelcome">

  <h1>Bienvenue, <%= request.getAttribute("username") %>!</h1>
    <a href="ServletOut">Déconnexion</a>




</form>
</body>
</html>