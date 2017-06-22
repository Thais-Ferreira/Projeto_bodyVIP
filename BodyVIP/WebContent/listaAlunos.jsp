<%@page import="br.com.body.entidade.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="css/style.css" />
	<title>Alunos Cadastrados</title>
</head>
<body>
	<div id="main">
    <div id="header">
      <div id="logo">
        <div id="logo_text">
          <h1><a href="home.jsp">Body<span class="logo_colour">VIP</span></a></h1>
          <h2>Enfrente a pregui�a, derrote o cansa�o e supere os desafios.</h2>
        </div>
      </div>
      <div id="menubar">
        <ul class="menu">
          <li><a href="home.jsp">Home</a></li>
          <li><a href="#">Alunos</a>
          	<ul>
          		<li><a href="AlunoController?acao=cadastro">Cadastrar</a>
          		<li class="selected"><a href="AlunoController?acao=buscaLista">Listar</a></li>
          	</ul>
          </li>
          <li><a href="#">Turmas</a>
          	<ul>
          		<li><a href="TurmaController?acao=cadastro">Cadastrar</a></li>
          		<li><a href="TurmaController?acao=buscaLista">Listar</a></li>
          	</ul>
          </li>
          <li><a href="#">Professores</a>
          	<ul>
          		<li><a href="ProfessorController?acao=cadastro">Cadastrar</a></li>
          		<li><a href="ProfessorController?acao=buscaLista">Listar</a></li>
          	</ul>
          </li>
          <li><a href="#">Aluno x Turma</a>
          	<ul>
          		<li><a href="AlunoTurmaController?acao=cadastro">Matricular</a></li>
          		<li><a href="AlunoTurmaController?acao=buscaLista">Listar</a></li>
          	</ul>
          </li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
    <h1>Lista de Alunos Matriculados</h1>
    </div>
    </div>
</body>
	<%
	List<Aluno> listaCompleta = (List<Aluno>)request.getAttribute("listaAlunos");
	%>
	<div id="site_content">
	<table bgcolor="#E7746F">
		<tr>
			<th>NOME</th>
			<th>CPF</th>
			<th>E-MAIL</th>
			<th>MATR�CULA</th>
			<th>DATA MATR�CULA</th>
			<th>DELETAR</th>
			<th>ALTERAR</th>
		</tr>
	<%
	for(Aluno a:listaCompleta) {
	%>
	<tr>
			<th><%= a.getNome() %></th>
			<th><%= a.getCpf() %></th>
			<th><%= a.getEmail() %></th>
			<th><%= a.getMatricula() %></th>
			<th><%= a.getDataMatricula() %></th>
			<th><a href="AlunoController?acao=deletaCadastro&matricula=<%= a.getMatricula() %>">Deletar</a></th>
			<th><a href="AlunoController?acao=alteraCadastro&matricula=<%= a.getMatricula() %>">Alterar</a></th>
	</tr>
	<%
	}
	%>
	</table>
	</div>
	<br><br><br><br>
	<div id="content_footer"></div>
    <div id="footer">
      <p><a href="home.jsp">Home</a> | <a href="AlunoController?acao=buscaLista">Listar Alunos</a> | <a href="TurmaController?acao=buscaLista">Listar Turmas</a> | <a href="ProfessorController?acao=buscaLista">Listar Professores</a></p>
      <p>@BodyVIP 2010 todos os direitos reservados.</p> 
    </div>
    
</html>