    <!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<s:form method="POST" modelAttribute="Utente"
		action="${pageContext.request.contextPath }/Utente/Login">
		<h1>Benvenuto Utente</h1>
<h2>Hai gia un account?</h2>
 <a th:href="@{/Login}">Login</a>
</s:form>
<s:form method="POST" modelAttribute="Utente"
		action="${pageContext.request.2contextPath }/Utente/Registrazione">
<h2>Non ti sei ancora iscritto?</h2>
 <a th:href="@{/Registrazione}">Registrati</a>
</s:form>

</body>
</html>