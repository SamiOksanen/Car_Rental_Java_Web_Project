package servlet;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.WebUser;
import dao.Dao;
import dao.DaoPoikkeus;

/*
 * Sami Oksanen ja Ossi Pihlaniemi
 */

@WebServlet("/kirjaudu")
public class SisaankirjautumisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 /**
     * @see HttpServlet#HttpServlet()
     */
    public SisaankirjautumisServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		
		try {
			//haetaan käyttäjä tietokannasta
			Dao dao = new Dao();
			WebUser kayttajaKannasta = dao.hae(username);
			
			boolean validiKayttaja = kayttajaKannasta.vertaaSalasanaa(password);
			
			if(validiKayttaja) {
				// siisaankirjatuneesta session attribuutti
				session.setAttribute (Servlet.SESSION_ATTR_WEBUSER, kayttajaKannasta);
				// tai
				// request.getSession().setAttribute(SiteServlet.SESSION_ATTR_WEBUSER, kayttajaKannasta);
				response.sendRedirect("indexB.jsp");
			} else {
				request.setAttribute("error", "Käyttäjätunnus tai salasana väärin!");
				request.setAttribute("prev_login_username", username);
				request.getRequestDispatcher(Servlet.FRONT_PAGE).forward(request, response);
			}
		} catch(SQLException e) {
			String virheviesti = "Tietokantaan ei nyt saada yhteyttä. Korjaamme vian tuotapikaa!";
			takaisinVirheviestilla(virheviesti, username, request, response);
		} catch (NoSuchAlgorithmException e) {
			throw new ServletException("Salausalgoritmia ei löydy.", e);
		}
			
			
			
	}
	private void takaisinVirheviestilla(String viesti, String username, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("error", viesti);
		request.setAttribute("prev_reg_username", username);
		request.getRequestDispatcher(Servlet.FRONT_PAGE).forward(request, response);
		
	}
}
