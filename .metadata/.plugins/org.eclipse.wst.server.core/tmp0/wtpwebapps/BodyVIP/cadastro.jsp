<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
	<form action="SalvoCadastro.jsp" method="post">
		<label>Nome:</label>
		<input type="text" name="nome">
		<label>CPF:</label>
		<input type="text" name="cpf">
		<label>Matrícula:</label>
		<input type="text" name="matricula">
		<label>E-mail:</label>
		<input type ="text" name="email">
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>