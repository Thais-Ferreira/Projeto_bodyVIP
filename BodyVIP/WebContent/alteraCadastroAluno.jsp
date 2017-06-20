<%@page import="br.com.body.entidade.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="css/style.css" />
	<title>Altera Cadastro</title>
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
        <ul id="menu">
          <li><a href="home.jsp">Home</a></li>
          <li><a href="AlunoController?acao=cadastro">Cadastrar Aluno</a></li>
          <li><a href="AlunoController?acao=buscaLista">Ver Alunos</a></li>
          <li><a href="page.html">Turmas</a></li>
          <li><a href="ProfessorController?acao=cadastro">Cadastrar Professor</a></li>
          <li><a href="ProfessorController?acao=buscaLista">Ver Professores</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
    <h1>Dados do Aluno</h1>
    <div class="form_settings">
        <%
		Aluno aluno = (Aluno)request.getAttribute("alu");
		%>
		<form action="AlunoController" method="post">
			<input type="hidden" name="acao" value="Salvar">
			
			<p><span>Nome</span>
			<input class="contact" type="text" name="nome" value="<%= aluno.getNome()%>"></p>
			<p><span>CPF</span>
			<input class="contact" type="text" name="cpf" value="<%= aluno.getCpf()%>"></p>
			<p><span>E-mail</span>
			<input class="contact" type="text" name="email" value="<%= aluno.getEmail()%>"></p>
			<p><span>Matr�cula</span>
			<input class="contact" type="text" name="matricula" value="<%= aluno.getMatricula()%>"></p>
			<p style="padding-top: 15px"><span>&nbsp;</span><input class="submit" type="submit" name="enviar" value="Salvar" /></p>
		</form>
      </div>
    </div>
    <br><br><br><br><br><br><br><br><br><br>
    <div id="content_footer"></div>
    <div id="footer">
      <p><a href="home.jsp">Home</a> | <a href="AlunoController?acao=buscaLista">Ver Alunos</a> | <a href="another_page.html">Turmas</a> | <a href="ProfessorController?acao=buscaLista">Ver Professores</a></p>
      <p>@BodyVIP 2010 todos os direitos reservados.</p> 
    </div>
  </div>

</body>
</html>