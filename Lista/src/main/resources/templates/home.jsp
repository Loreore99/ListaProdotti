<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<s:form method="post" modelAttribute="Utente"
		action="${pageContext.request.contextPath }/Utente/Registrazione">
<h1>Benvenuto Utente</h1>
<h2>Non ti si ancora iscritto?</h2>
</s:form>
<input type="submit" value="Registrazione">
<s:form method="post" modelAttribute="Utente"
		action="${pageContext.request.contextPath }/Utente/Login">
<h2>Hai gia un account?</h2>
<input type="submit" value="Login">
</s:form>
</body>
</html>