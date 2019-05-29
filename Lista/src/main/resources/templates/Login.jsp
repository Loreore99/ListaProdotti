<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<s:form method="POST" modelAttribute="Utente"
		action="${pageContext.request.contextPath }/Utente/Login">
		<h1>Login</h1>
       <table>
			<tr>
				<td>Email</td>
				<td>
					<s:input path="Email"/>
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td>
					<s:input path="Password"/>
				</td>
			</tr>
</table>
</s:form>
</body>
</html>