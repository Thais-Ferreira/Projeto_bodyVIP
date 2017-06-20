package br.com.body.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.body.entidade.Aluno;
import br.com.body.jdbc.AlunoDAO;

/**
 * Servlet implementation class AlunoController
 * 
 * @author Thaís
 */
@WebServlet("/AlunoController")
public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlunoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Aluno aluno = new Aluno();
		String acao = request.getParameter("acao");
		AlunoDAO alunoDAO = new AlunoDAO();
		
		if(acao != null && acao.equals("buscaLista")) {
			List<Aluno> listaAlunos = alunoDAO.buscaListaAlunos(aluno);
			
			request.setAttribute("listaAlunos", listaAlunos);
			RequestDispatcher destino = request.getRequestDispatcher("listaAlunos.jsp");
			destino.forward(request, response);
			
		} else if(acao != null && acao.equals("deletaCadastro")) {
			String matricula = request.getParameter("matricula");
			aluno.setMatricula(matricula);
			alunoDAO.deletaCadastroAluno(aluno);
			
			response.sendRedirect("AlunoController?acao=buscaLista");
			
		} else if(acao != null && acao.endsWith("alteraCadastro")) {
			String matricula = request.getParameter("matricula");
			Aluno alu = alunoDAO.buscaAluno(matricula);
			request.setAttribute("alu", alu);
			request.getRequestDispatcher("alteraCadastroAluno.jsp").forward(request, response);
			
		} else if(acao != null && acao.endsWith("cadastro")) {
			RequestDispatcher destino = request.getRequestDispatcher("cadastroAluno.jsp");
			destino.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//capturando parâmetros da tela
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String matricula = request.getParameter("matricula");
		
		
		//criando objeto aluno e atribuindo valores da tela
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setCpf(cpf);
		aluno.setEmail(email);
		aluno.setMatricula(matricula);
		
		//criando um alunoDAO
		AlunoDAO alunoDAO = new AlunoDAO();
		
		//salvando no banco de dados
		alunoDAO.alteraCadastroAluno(aluno);
		response.sendRedirect("AlunoController?acao=buscaLista");
	}

}
