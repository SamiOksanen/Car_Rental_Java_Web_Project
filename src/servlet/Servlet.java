package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Vuokraus;
import dao.Dao;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	public static final String FRONT_PAGE = "index.jsp";
	public static final String SECOND_PAGE = "indexB.jsp";
	

	public static final String SESSION_ATTR_WEBUSER = "kayttajatiedot";

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		RequestDispatcher disp;
		
		if (action == null) {
			disp = request.getRequestDispatcher("index.jsp");
			disp.forward(request,  response);
		}
		else if (action.equalsIgnoreCase("hae kaikki vuokraukset")){
			System.out.println("KAIKKI");
			haeKaikkiVuokraukset(request, response);
		}
		else if (action.equalsIgnoreCase("hae tietyn pvm vuokraukset")){
			System.out.println("PÄIVÄ");
			haePaivanVuokraukset(request,response);
		}
	}

	private void haeKaikkiVuokraukset(HttpServletRequest req, 
			HttpServletResponse res) throws IOException, ServletException
	{
		Dao dao = new Dao();
		RequestDispatcher disp;
		try {
			List<Vuokraus> lista = dao.haeVuokraukset();
			System.out.println(lista);
			if (lista != null) {
			req.setAttribute("vuokraukset",lista);
			disp = req.getRequestDispatcher("vuokraukset.jsp");
			disp.forward(req,  res);
			}
			else
			{
				req.setAttribute("EI_LOYDY", true);
				disp = req.getRequestDispatcher(SECOND_PAGE);
				disp.forward(req,  res);
			}
		}
		catch (Exception e) {
			req.setAttribute("TK_VIRHE", true);
			disp = req.getRequestDispatcher("index.jsp");
			disp.forward(req,  res);
		}
		
	}
	private void haePaivanVuokraukset(HttpServletRequest request, HttpServletResponse response) 
				 throws IOException, ServletException
	{
		Dao dao = new Dao();
		RequestDispatcher disp;
		String date = request.getParameter("date");
		System.out.println("pläälää");
		try {
			List<Vuokraus> lista = dao.haeVuokraukset(date);
			System.out.println(lista);
			
			if (lista != null ) {
				System.out.println("täällä");
				request.setAttribute("vuokraukset", lista);
			
				disp = request.getRequestDispatcher("vuokraukset.jsp");
				disp.forward(request, response);
			}
			else {
				request.setAttribute("tyhja", true);
				request.setAttribute("date", date);
				disp = request.getRequestDispatcher("indexB.jsp");
				disp.forward(request, response);
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("TK_VIRHE", true);
			disp = request.getRequestDispatcher("index.jsp");
			disp.forward(request,  response);
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
