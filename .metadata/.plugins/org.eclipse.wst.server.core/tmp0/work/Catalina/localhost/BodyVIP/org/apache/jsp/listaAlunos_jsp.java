/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.78
 * Generated at: 2017-06-22 01:35:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.body.entidade.Aluno;
import java.util.List;

public final class listaAlunos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("\t<title>Alunos Cadastrados</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("    <div id=\"header\">\r\n");
      out.write("      <div id=\"logo\">\r\n");
      out.write("        <div id=\"logo_text\">\r\n");
      out.write("          <h1><a href=\"home.jsp\">Body<span class=\"logo_colour\">VIP</span></a></h1>\r\n");
      out.write("          <h2>Enfrente a preguiça, derrote o cansaço e supere os desafios.</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"menubar\">\r\n");
      out.write("        <ul class=\"menu\">\r\n");
      out.write("          <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("          <li><a href=\"#\">Alunos</a>\r\n");
      out.write("          \t<ul>\r\n");
      out.write("          \t\t<li><a href=\"AlunoController?acao=cadastro\">Cadastrar</a>\r\n");
      out.write("          \t\t<li class=\"selected\"><a href=\"AlunoController?acao=buscaLista\">Listar</a></li>\r\n");
      out.write("          \t</ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li><a href=\"#\">Turmas</a>\r\n");
      out.write("          \t<ul>\r\n");
      out.write("          \t\t<li><a href=\"TurmaController?acao=cadastro\">Cadastrar</a></li>\r\n");
      out.write("          \t\t<li><a href=\"TurmaController?acao=buscaLista\">Listar</a></li>\r\n");
      out.write("          \t</ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li><a href=\"#\">Professores</a>\r\n");
      out.write("          \t<ul>\r\n");
      out.write("          \t\t<li><a href=\"ProfessorController?acao=cadastro\">Cadastrar</a></li>\r\n");
      out.write("          \t\t<li><a href=\"ProfessorController?acao=buscaLista\">Listar</a></li>\r\n");
      out.write("          \t</ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li><a href=\"#\">Aluno x Turma</a>\r\n");
      out.write("          \t<ul>\r\n");
      out.write("          \t\t<li><a href=\"AlunoTurmaController?acao=cadastro\">Matricular</a></li>\r\n");
      out.write("          \t\t<li><a href=\"AlunoTurmaController?acao=buscaLista\">Listar</a></li>\r\n");
      out.write("          \t</ul>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"content_header\"></div>\r\n");
      out.write("    <div id=\"site_content\">\r\n");
      out.write("    <h1>Lista de Alunos Matriculados</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\t");

	List<Aluno> listaCompleta = (List<Aluno>)request.getAttribute("listaAlunos");
	
      out.write("\r\n");
      out.write("\t<div id=\"site_content\">\r\n");
      out.write("\t<table bgcolor=\"#E7746F\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>NOME</th>\r\n");
      out.write("\t\t\t<th>CPF</th>\r\n");
      out.write("\t\t\t<th>E-MAIL</th>\r\n");
      out.write("\t\t\t<th>MATRÍCULA</th>\r\n");
      out.write("\t\t\t<th>DATA MATRÍCULA</th>\r\n");
      out.write("\t\t\t<th>DELETAR</th>\r\n");
      out.write("\t\t\t<th>ALTERAR</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t");

	for(Aluno a:listaCompleta) {
	
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t\t<th>");
      out.print( a.getNome() );
      out.write("</th>\r\n");
      out.write("\t\t\t<th>");
      out.print( a.getCpf() );
      out.write("</th>\r\n");
      out.write("\t\t\t<th>");
      out.print( a.getEmail() );
      out.write("</th>\r\n");
      out.write("\t\t\t<th>");
      out.print( a.getMatricula() );
      out.write("</th>\r\n");
      out.write("\t\t\t<th>");
      out.print( a.getDataMatricula() );
      out.write("</th>\r\n");
      out.write("\t\t\t<th><a href=\"AlunoController?acao=deletaCadastro&matricula=");
      out.print( a.getMatricula() );
      out.write("\">Deletar</a></th>\r\n");
      out.write("\t\t\t<th><a href=\"AlunoController?acao=alteraCadastro&matricula=");
      out.print( a.getMatricula() );
      out.write("\">Alterar</a></th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");

	}
	
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br><br><br><br>\r\n");
      out.write("\t<div id=\"content_footer\"></div>\r\n");
      out.write("    <div id=\"footer\">\r\n");
      out.write("      <p><a href=\"home.jsp\">Home</a> | <a href=\"AlunoController?acao=buscaLista\">Listar Alunos</a> | <a href=\"TurmaController?acao=buscaLista\">Listar Turmas</a> | <a href=\"ProfessorController?acao=buscaLista\">Listar Professores</a></p>\r\n");
      out.write("      <p>@BodyVIP 2010 todos os direitos reservados.</p> \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
