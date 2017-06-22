<%@page import="br.com.body.jdbc.ProfessorDAO"%>
<%@page import="br.com.body.entidade.Professor"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>Cadastro Salvo</title>
</head>
<body>
	<div id="main">
		<div id="header">
			<div id="logo">
				<div id="logo_text">

					<h1>
						<a href="home.jsp">Body<span class="logo_colour">VIP</span></a>
					</h1>
					<h2>Enfrente a preguiça, derrote o cansaço e supere os
						desafios.</h2>
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
        </ul>
      </div>
		</div>

		<div id="content_header"></div>
		<div id="site_content">
			<div id="content">
				<h1>Salvo com sucesso!</h1>
				<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
			</div>
		</div>
		<div id="content_footer"></div>
		<div id="footer">
			<p>
				<a href="home.jsp">Home</a> | <a href="AlunoController?acao=buscaLista">Listar Alunos</a> | <a href="TurmaController?acao=buscaLista">Listar Turmas</a> | <a href="ProfessorController?acao=buscaLista">Listar Professores</a>
			</p>
			<p>@BodyVIP 2010 todos os direitos reservados.</p>
		</div>
	</div>
	<%
	String nomeProf = request.getParameter("nome");
	String cpfProf = request.getParameter("cpf");
	String emailProf = request.getParameter("email");
	Date data = new java.sql.Date(Calendar.getInstance().getTime().getTime());
	
	Professor professor = new Professor();
	professor.setNome(nomeProf);
	professor.setCpf(cpfProf);
	professor.setEmail(emailProf);
	professor.setDataContratacao(data);
	
	ProfessorDAO professorDAO = new ProfessorDAO();
	professorDAO.cadastroProfessor(professor);
	Professor profOK = professorDAO.buscaProfessor(professor.getCpf());
	
	if(profOK != null) {
		response.sendRedirect("sucessoCadastro.jsp");
	} else {
		response.sendRedirect("erroCadastro.jsp");
	}
	%>

</body>
</html>