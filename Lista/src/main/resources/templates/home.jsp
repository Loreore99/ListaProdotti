    <!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<form method="POST" modelAttribute="Utente"
		action="/Utente/LoginPage">
		<h1>Benvenuto Utente</h1>
<h2>Hai gia un account?</h2>
 <input type="submit" value=LoginPage></form>
<form method="POST" modelAttribute="Utente"
		action="/Utente/RegistrazionePage">
<h2>Non ti sei ancora iscritto?</h2>
 <input type="submit" value=RegistrazionePage>
</form>

</body>
</html>