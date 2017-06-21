<%@page import="br.com.body.entidade.Turma"%>
<%@page import="java.util.List"%>
<%@page import="br.com.body.entidade.Professor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="css/style.css" />
	<title>Turmas Cadastradas</title>
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
          <li><a href="AlunoController?acao=cadastro">Novo Aluno</a></li>
          <li><a href="AlunoController?acao=buscaLista">Listar Alunos</a></li>
          <li><a href="TurmaController?acao=cadastro">Nova Turma</a></li>
          <li class="selected"><a href="TurmaController?acao=buscaLista">Ver Turmas</a></li>
          <li><a href="ProfessorController?acao=cadastro">Novo Professor</a></li>
          <li><a href="ProfessorController?acao=buscaLista">Listar Professores</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
    <h1>Lista de Turmas</h1>
    </div>
    </div>

</body>
	<%
	List<Turma> listaCompleta = (List<Turma>)request.getAttribute("listaTurmas");
	%>
	<div id="site_content">
	<table bgcolor="#E7746F">
		<tr>
			<th>C�DIGO</th>
			<th>MODALIDADE</th>
			<th>VAGAS</th>
			<th>DIA DA SEMANA</th>
			<th>HORA IN�CIO</th>
			<th>HORA T�RMINO</th>
			<th>VALOR</th>
			<th>PROFESSOR</th>
			<th>DELETAR</th>
			<th>ALTERAR</th>
		</tr>
	<%
	for(Turma t:listaCompleta) {
	%>
	<tr>
			<th><%= t.getCodigo() %></th>
			<th><%= t.getModalidade() %></th>
			<th><%= t.getQuantidadeVagas() %></th>
			<th><%= t.getDiaDaSemana() %></th>
			<th><%= t.getHoraInicio() %></th>
			<th><%= t.getHoraFim() %></th>
			<th><%= t.getValorTurma() %></th>
			<th><%= t.getCpfProfessor() %></th>
			<th><a href="TurmaController?acao=deletaCadastro&codigo=<%= t.getCodigo() %>">Deletar</a></th>
			<th><a href="TurmaController?acao=alteraCadastro&codigo=<%= t.getCodigo() %>">Alterar</a></th>
	</tr>
	<%
	}
	%>
	</table>
	</div>
	<br><br><br><br>
	<div id="content_footer"></div>
    <div id="footer">
      <p><a href="home.jsp">Home</a> | <a href="AlunoController?acao=buscaLista">Ver Alunos</a> | <a href="TurmaController?acao=buscaLista">Ver Turmas</a> | <a href="ProfessorController?acao=buscaLista">Ver Professores</a></p>
      <p>@BodyVIP 2010 todos os direitos reservados.</p> 
    </div>
</html>