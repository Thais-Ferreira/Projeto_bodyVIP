<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="css/style.css" />
	<title>Erro de Cadastro</title>
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
        <ul class="menu">
          <li><a href="home.jsp">Home</a></li>
          <li><a href="#">Alunos</a>
          	<ul>
          		<li><a href="AlunoController?acao=cadastro">Cadastrar</a>
          		<li><a href="AlunoController?acao=buscaLista">Listar</a></li>
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
      
	  
      <div id="content">
        <h1>Erro - Cadastro não realizado!</h1><br><br>
        <h3><a href="home.jsp">Voltar à Home</a></h3>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
      </div>
    </div>
    <div id="content_footer"></div>
    <div id="footer">
      <p><a href="home.jsp">Home</a> | <a href="AlunoController?acao=buscaLista">Listar Alunos</a> | <a href="TurmaController?acao=buscaLista">Listar Turmas</a> | <a href="ProfessorController?acao=buscaLista">Listar Professores</a></p>
      <p>@BodyVIP 2010 todos os direitos reservados.</p> 
    </div>
  </div>
</body>
</html>