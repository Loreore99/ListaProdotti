
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione</title>
</head>
<body>
<form method="POST" modelAttribute="Utente"
		action="/Utente/ReistrazioneSucc">
		<h1>Inserisci i tuoi dati</h1>
       <table>
			<tr>
			<td>Email</td>
				<td>
					<input type="text" th:field="*{Utente.Email}" />
				</td>
			<td>Password</td>
				<td>
					<input type="text" th:field="*{Utente.Password}" />
				</td>
				<td>Nome</td>
				<td>
					<input type="text" th:field="*{Utente.Nome}" />
				</td>
				<td>Cognome</td>
				<td>
					<input type="text" th:field="*{Utente.Cognome}" />
				</td>
				<input type="submit" value="Registrazione">
			</tr>
</table>
</form>
</body>
</html>