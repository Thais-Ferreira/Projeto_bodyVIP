package br.com.body.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.body.entidade.Professor;
import br.com.body.jdbc.ProfessorDAO;

/**
 * Servlet implementation class ProfessorController
 * 
 * @author Thaís
 */
@WebServlet("/ProfessorController")
public class ProfessorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfessorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Professor professor = new Professor();
		String acao = request.getParameter("acao");
		ProfessorDAO professorDAO = new ProfessorDAO();
		
		if(acao != null && acao.equals("buscaLista")) {
			List<Professor> listaProfessores = professorDAO.buscaListaProfessores(professor);
			
			request.setAttribute("listaProfessores", listaProfessores);
			RequestDispatcher destino = request.getRequestDispatcher("listaProfessores.jsp");
			destino.forward(request, response);
			
		} else if(acao != null && acao.equals("deletaCadastro")) {
			String cpf = request.getParameter("cpf");
			professor.setCpf(cpf);
			professorDAO.deletaCadastroProfessor(professor);
			
			response.sendRedirect("ProfessorController?acao=buscaLista");
			
		} else if(acao != null && acao.endsWith("alteraCadastro")) {
			String cpf = request.getParameter("cpf");
			Professor prof = professorDAO.buscaProfessor(cpf);
			request.setAttribute("prof", prof);
			request.getRequestDispatcher("alteraCadastroProf.jsp").forward(request, response);
			
		} else if(acao != null && acao.endsWith("cadastro")) {
			RequestDispatcher destino = request.getRequestDispatcher("cadastroProfessor.jsp");
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
				
		//criando objeto professor e atribuindo valores da tela
		Professor professor = new Professor();
		professor.setNome(nome);
		professor.setCpf(cpf);
		professor.setEmail(email);
		
		//criando um professorDAO
		ProfessorDAO professorDAO = new ProfessorDAO();
				
		//salvando no banco de dados
		professorDAO.alteraCadastroProfessor(professor);
		response.sendRedirect("ProfessorController?acao=buscaLista");
	}

}
