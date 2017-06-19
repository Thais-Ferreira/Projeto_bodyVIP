<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="css/style.css" />
	<title>Cadastro</title>
</head>
<body>
	<div id="main">
    <div id="header">
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="home.jsp">Body<span class="logo_colour">VIP</span></a></h1>
          <h2>Enfrente a pregui�a, derrote o cansa�o e supere os desafios.</h2>
        </div>
      </div>
      <div id="menubar">
        <ul id="menu">
          <!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
          <li><a href="home.jsp">Home</a></li>
          <li class="selected"><a href="AlunoController?acao=cadastro">Cadastrar Aluno</a></li>
          <li><a href="AlunoController?acao=buscaLista">Listar Alunos</a></li>
          <li><a href="page.html">Turmas</a></li>
          <li><a href="another_page.html">Professores</a></li>
          <li><a href="contact.html">Login</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
    <h1>Cadastro de Aluno</h1>
    <div class="form_settings">
    	<form action="SalvoCadastro.jsp" method="post">
            <p><span>Nome</span><input class="contact" type="text" name="nome"/></p>
            <p><span>CPF</span><input class="contact" type="text" name="cpf"/></p>
            <p><span>Matr�cula</span><input class="contact" type="text" name="matricula"/></p>
            <p><span>E-mail</span><input class="contact" type="text" name="email"/></p>
            <p style="padding-top: 15px"><span>&nbsp;</span><input class="submit" type="submit" name="enviar" value="Cadastrar" /></p>
         </form>
    </div>
    </div>
    <br><br><br><br><br><br><br><br><br><br><br><br><br>
    <div id="content_footer"></div>
    <div id="footer">
      <p><a href="home.jsp">Home</a> | <a href="AlunoController?acao=buscaLista">Listar Alunos</a> | <a href="another_page.html">Turmas</a> | <a href="contact.html">Login</a></p>
      <p>@BodyVIP 2010 todos os direitos reservados.</p> 
    </div>
    </div>
</body>
</html>