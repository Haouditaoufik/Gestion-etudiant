package controleurServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Metier.Etudiant;
import gestionEtudiantDAO.EtudiantDao;

/**
 * Servlet implementation class ServletModifier
 */
@WebServlet("/ServletModifier")
public class ServletModifier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletModifier() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		int id=(Integer) request.getSession().getAttribute("id");
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String matricule=request.getParameter("matricule");
		String filiere=request.getParameter("filiere");
		
		Etudiant e=new Etudiant(nom,prenom,matricule,filiere);
	       EtudiantDao.editStudent(id,e);
	       request.getServletContext().getRequestDispatcher("/Servlet1").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
