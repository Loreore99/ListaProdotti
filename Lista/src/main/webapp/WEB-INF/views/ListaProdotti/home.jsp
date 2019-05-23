<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<s:form method="get" modelAttribute="utente"
		action="${pageContext.request.contextPath }/utente/registrazione">
<h3>Non sei ancora regitrato?</h3>
<button>Registrati</button>
</s:form>
</body>
</html>