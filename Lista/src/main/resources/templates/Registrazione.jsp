
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
			<td>Nome</td>
				<td>
					<input path="Nome"/>
				</td>
				<td>Cognome</td>
				<td>
					<input path="Cognome"/>
				</td>
				<td>Email</td>
				<td>
					<input path="Email"/>
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td>
					<input path="Password"/>
				</td>
				<input type="submit" value="Registrazione">
			</tr>
</table>
</form>
</body>
</html>