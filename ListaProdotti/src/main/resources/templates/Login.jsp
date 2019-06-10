<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form method="POST" modelAttribute="Utente"
action="UserPage">
		<h1>Login</h1>
       <table>
			<tr>
				<td>Email</td>
				<td>
					<input type="text" th:field="*{Utente.Email}" />
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td>
					<input type="text" th:field="*{Utente.Password}" />
				</td>
			</tr>

</table>

	<input type="submit" value="Login">
	</form>
</body>
</html>