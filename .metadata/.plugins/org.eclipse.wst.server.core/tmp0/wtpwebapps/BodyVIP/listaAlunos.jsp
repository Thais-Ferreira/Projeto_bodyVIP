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
			<td>Nome</td>
			<td>Matrícula</td>
			<td>E-mail</td>
		</tr>
	<%
	for(Aluno a:listaCompleta) {
	%>
	<tr>
			<td><%= a.getNome() %></td>
			<td><%= a.getMatricula() %></td>
			<td><%= a.getEmail() %></td>
		</tr>
	<%
	}
	%>
	</table>
</html>