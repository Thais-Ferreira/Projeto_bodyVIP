<%@page import="br.com.body.jdbc.TurmaDAO"%>
<%@page import="br.com.body.entidade.Turma"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.sql.Date"%>
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
          <li><a href="TurmaController?acao=buscaLista">Ver Turmas</a></li>
          <li><a href="ProfessorController?acao=cadastro">Novo Professor</a></li>
          <li><a href="ProfessorController?acao=buscaLista">Listar Professores</a></li>
        </ul>
      </div>
    </div>
    
    <div id="content_header"></div>
    <div id="site_content">
      
	  
      <div id="content">
        <h1></h1>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
      </div>
    </div>
    <div id="content_footer"></div>
    <div id="footer">
      <p><a href="home.jsp">Home</a> | <a href="AlunoController?acao=buscaLista">Ver Alunos</a> | <a href="TurmaController?acao=buscaLista">Ver Turmas</a> | <a href="ProfessorController?acao=buscaLista">Ver Professores</a></p>
      <p>@BodyVIP 2010 todos os direitos reservados.</p> 
    </div>
  </div>
  	
	<%
	String codigo = request.getParameter("codigo");
	String modalidade = request.getParameter("modalidade");
	String vagas = request.getParameter("vagas");
	String diaSemana = request.getParameter("semana");
	String horaInicio = request.getParameter("inicio");
	String horaTermino = request.getParameter("termino");
	String valor = request.getParameter("valor");
	String prof = request.getParameter("professor");
	
	Turma turma = new Turma();
	turma.setCodigo(codigo);
	turma.setModalidade(modalidade);
	turma.setQuantidadeVagas(Integer.parseInt(vagas));
	turma.setDiaDaSemana(diaSemana);
	turma.setHoraInicio(Integer.parseInt(horaInicio));
	turma.setHoraFim(Integer.parseInt(horaTermino));
	turma.setValorTurma(Double.parseDouble(valor));
	turma.setCpfProfessor(prof);
	
	TurmaDAO turmaDAO = new TurmaDAO();
	turmaDAO.cadastraTurma(turma);
	Turma turmaOK = turmaDAO.buscaTurma(turma.getCodigo());
	
	if(turmaOK != null) {
		response.sendRedirect("sucessoCadastro.jsp");
	} else {
		response.sendRedirect("erroCadastro.jsp");
	}
	%>
	
	
</body>
</html>