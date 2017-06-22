package br.com.body.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.body.entidade.AlunoTurma;
import br.com.body.jdbc.AlunoTurmaDAO;

/**
 * Servlet implementation class AlunoTurmaController
 */
@WebServlet("/AlunoTurmaController")
public class AlunoTurmaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlunoTurmaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AlunoTurma alunoTurma = new AlunoTurma();
		String acao = request.getParameter("acao");
		AlunoTurmaDAO alunoTurmaDAO = new AlunoTurmaDAO();
		
		if(acao != null && acao.equals("buscaLista")) {
			List<AlunoTurma> lista = alunoTurmaDAO.buscaListaAlunoTurma(alunoTurma);
			
			request.setAttribute("lista", lista);
			RequestDispatcher destino = request.getRequestDispatcher("listaAlunoTurma.jsp");
			destino.forward(request, response);
			
		} else if(acao != null && acao.equals("deletaCadastro")) {
			String cpf = request.getParameter("cpf");
			alunoTurma.setCpfAluno(cpf);
			alunoTurmaDAO.deletaCadastroAlunoTurma(alunoTurma);
			
			response.sendRedirect("AlunoTurmaController?acao=buscaLista");
			
		} else if(acao != null && acao.endsWith("alteraCadastro")) {
			String cpf = request.getParameter("cpf");
			AlunoTurma alutu = alunoTurmaDAO.buscaAlunoTurma(cpf);
			request.setAttribute("alutu", alutu);
			request.getRequestDispatcher("alteraCadastroAlunoTurma.jsp").forward(request, response);
			
		} else if(acao != null && acao.endsWith("cadastro")) {
			RequestDispatcher destino = request.getRequestDispatcher("cadastroAlunoTurma.jsp");
			destino.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//capturando parāmetros da tela
		String cpf = request.getParameter("cpf");
		String codigo = request.getParameter("codigo");
				
		//criando objeto AlunoTurma e atribuindo valores da tela
		AlunoTurma alunoTurma = new AlunoTurma();
		alunoTurma.setCpfAluno(cpf);
		alunoTurma.setCodTurma(codigo);
				
		//criando um alunoDAO
		AlunoTurmaDAO alunoTurmaDAO = new AlunoTurmaDAO();
				
		//salvando no banco de dados
		alunoTurmaDAO.alteraCadastroAlunoTurma(alunoTurma);
		response.sendRedirect("AlunoTurmaController?acao=buscaLista");
	}

}
