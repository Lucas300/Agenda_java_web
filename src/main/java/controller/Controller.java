package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO; // é necessario importar a classe DAO e criar um objeto; part 1

@WebServlet(urlPatterns = { "/Controller", "/main" }) // Adicionado , main é uma requisição que o servlet vai trabalhar
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DAO dao = new DAO(); // objeto criado para a importação DAO part 2

	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath(); // a variavel vai armazenar o caminho da requição
		System.out.println(action);
		if (action.equals("/main")) {
			contatos(request, response);
		}
	}

	// listar contatos
	protected void contatos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("agenda.jsp");
	}
}
