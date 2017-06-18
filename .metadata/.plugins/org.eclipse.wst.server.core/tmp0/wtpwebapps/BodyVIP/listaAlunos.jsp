<%@page import="br.com.body.entidade.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="cabecalho.jsp"></jsp:include>
</body>
<%
	//List<Aluno> listaAlunos = alunoDAO.buscaListaAlunos(aluno);
	
	List<Aluno> listaCompleta = (List<Aluno>)request.getAttribute("listaAlunos");
	%>
	<table border="1">
		<tr bgcolor="#eaeaea">
			<th>Nome</th>
			<th>Matr�cula</th>
			<th>E-mail</th>
			<th>Deletar</th>
			<th>Alterar</th>
		</tr>
	<%
	for(Aluno a:listaCompleta) {
	%>
	<tr>
			<th><%= a.getNome() %></th>
			<th><%= a.getMatricula() %></th>
			<th><%= a.getEmail() %></th>
			<th><a href="AlunoController?acao=deletaCadastro&matricula=<%= a.getMatricula() %>">Deletar</a></th>
			<th><a href="AlunoController?acao=alteraCadastro&matricula=<%= a.getMatricula() %>">Alterar</a></th>
		</tr>
	<%
	}
	%>
	</table>
</html>