<%@page import="java.util.List"%>
<%@page import="br.com.body.entidade.Professor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="css/style.css" />
	<title>Professores Cadastrados</title>
</head>
<body>
	<div id="main">
    <div id="header">
      <div id="logo">
        <div id="logo_text">
          <h1><a href="home.jsp">Body<span class="logo_colour">VIP</span></a></h1>
          <h2>Enfrente a preguiça, derrote o cansaço e supere os desafios.</h2>
        </div>
      </div>
      <div id="menubar">
        <ul id="menu">
          <li><a href="home.jsp">Home</a></li>
          <li><a href="AlunoController?acao=cadastro">Cadastrar Aluno</a></li>
          <li><a href="AlunoController?acao=buscaLista">Ver Alunos</a></li>
          <li><a href="page.html">Turmas</a></li>
          <li><a href="ProfessorController?acao=cadastro">Cadastrar Professor</a></li>
          <li class="selected"><a href="ProfessorController?acao=buscaLista">Ver Professores</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
    <h1>Lista de Professores</h1>
    </div>
    </div>

</body>
	<%
	List<Professor> listaCompleta = (List<Professor>)request.getAttribute("listaProfessores");
	%>
	<div id="site_content">
	<table bgcolor="#E7746F">
		<tr>
			<th>NOME</th>
			<th>CPF</th>
			<th>E-MAIL</th>
			<th>DATA CONTRATAÇÃO</th>
			<th>DELETAR</th>
			<th>ALTERAR</th>
		</tr>
	<%
	for(Professor p:listaCompleta) {
	%>
	<tr>
			<th><%= p.getNome() %></th>
			<th><%= p.getCpf() %></th>
			<th><%= p.getEmail() %></th>
			<th><%= p.getDataContratacao() %></th>
			<th><a href="ProfessorController?acao=deletaCadastro&cpf=<%= p.getCpf() %>">Deletar</a></th>
			<th><a href="ProfessorController?acao=alteraCadastro&cpf=<%= p.getCpf() %>">Alterar</a></th>
	</tr>
	<%
	}
	%>
	</table>
	</div>
	<br><br><br><br>
	<div id="content_footer"></div>
    <div id="footer">
      <p><a href="home.jsp">Home</a> | <a href="AlunoController?acao=buscaLista">Ver Alunos</a> | <a href="another_page.html">Turmas</a> | <a href="ProfessorController?acao=buscaLista">Ver Professores</a></p>
      <p>@BodyVIP 2010 todos os direitos reservados.</p> 
    </div>
</html>