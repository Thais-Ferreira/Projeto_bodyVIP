package br.com.body.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.body.entidade.Turma;
import br.com.body.jdbc.TurmaDAO;

/**
 * Servlet implementation class TurmaController
 * 
 * @author Thaís
 */
@WebServlet("/TurmaController")
public class TurmaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TurmaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Turma turma = new Turma();
		String acao = request.getParameter("acao");
		TurmaDAO turmaDAO = new TurmaDAO();
		
		if(acao != null && acao.equals("buscaLista")) {
			List<Turma> listaTurmas = turmaDAO.buscaListaTurmas(turma);
			
			request.setAttribute("listaTurmas", listaTurmas);
			RequestDispatcher destino = request.getRequestDispatcher("listaTurmas.jsp");
			destino.forward(request, response);
			
		} else if(acao != null && acao.equals("deletaCadastro")) {
			String codigo = request.getParameter("codigo");
			turma.setCodigo(codigo);
			turmaDAO.deletaTurma(turma);
			
			response.sendRedirect("TurmaController?acao=buscaLista");
			
		} else if(acao != null && acao.endsWith("alteraCadastro")) {
			String codigo = request.getParameter("codigo");
			Turma tur = turmaDAO.buscaTurma(codigo);
			request.setAttribute("tur", tur);
			request.getRequestDispatcher("alteraCadastroTurma.jsp").forward(request, response);
			
		} else if(acao != null && acao.endsWith("cadastro")) {
			RequestDispatcher destino = request.getRequestDispatcher("cadastroTurma.jsp");
			destino.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//capturando parâmetros da tela
		String codigo = request.getParameter("codigo");
		String modalidade = request.getParameter("modalidade");
		String quantVagas = request.getParameter("qtd_vagas");
		String diaSemana = request.getParameter("dia_semana");
		String horaInicio = request.getParameter("horario_inicio");
		String horaFim = request.getParameter("horario_fim");
		String valor = request.getParameter("valor");
		String cpfProf = request.getParameter("cpf_professor");
		
						
		//criando objeto turma e atribuindo valores da tela
		Turma turma = new Turma();
		turma.setCodigo(codigo);
		turma.setModalidade(modalidade);
		turma.setQuantidadeVagas(Integer.parseInt(quantVagas));
		turma.setDiaDaSemana(diaSemana);
		turma.setHoraInicio(Integer.parseInt(horaInicio));
		turma.setHoraFim(Integer.parseInt(horaFim));
		turma.setValorTurma(Double.parseDouble(valor));
		turma.setCpfProfessor(cpfProf);
				
		//criando uma turmaDAO
		TurmaDAO turmaDAO = new TurmaDAO();
						
		//salvando no banco de dados
		turmaDAO.alteraTurma(turma);
		response.sendRedirect("TurmaController?acao=buscaLista");
	}

}
