package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO; // � necessario importar a classe DAO e criar um objeto; part 1


/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns={"/Controller" , "/main"}) // Adicionado , main � uma requisi��o que o servlet vai trabalhar
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

       DAO dao = new DAO();    // objeto criado para a importa��o DAO part 2
    
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/* TESTANDO CONEX�O
			dao.testeConexao(); //para fazer o teste de conex�o part 3
		*/
	}

}
