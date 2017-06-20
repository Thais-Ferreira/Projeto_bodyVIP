<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="css/style.css" />
	<title>Home</title>
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
          <li class="selected"><a href="home.jsp">Home</a></li>
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
      <div id="banner"></div>
	  
      <div id="content">
        <h1>Bem vindo(a) a academia BodyVIP!</h1>
        <p>Inaugurada em 2010, a academia BodyVIP conta com mais de 250 unidades, localizadas em 22 estados brasileiros 
        e no Distrito Federal, al�m de presen�a no Chile, M�xico, Rep�blica Dominicana, Peru e Col�mbia. 
        A rede foi criada com o prop�sito de democratizar o fitness de alto padr�o e oferece planos 
        a partir de R$ 59,90 mensais, no Brasil.
		</p>
        <h1>Confira a estrutura de nossas academias!</h1>
        <p>- Todas as unidades possuem vesti�rios com arm�rios.</p>
        <p>- Todas as unidades possuem chuveiros exceto as unidades Leblon, Miguel de Frias e Cambu�.</p>
        <p>- Na p�gina de cada unidade � poss�vel verificar a disponibilidade de biciclet�rios. </p>
        <p>- Para saber se existe disponibilidade para estacionamento, basta acessar a p�gina na unidade de 
        interesse. L� informa se a unidade possui ou n�o estacionamento e se ele � gratuito ou conveniado. </p>
      </div>
    </div>
    <div id="content_footer"></div>
    <div id="footer">
      <p><a href="home.jsp">Home</a> | <a href="AlunoController?acao=buscaLista">Ver Alunos</a> | <a href="another_page.html">Turmas</a> | <a href="ProfessorController?acao=buscaLista">Ver Professores</a></p>
      <p>@BodyVIP 2010 todos os direitos reservados.</p> 
    </div>
  </div>
</body>
</html>