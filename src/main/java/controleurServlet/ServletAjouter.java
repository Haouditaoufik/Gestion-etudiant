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
 * Servlet implementation class ServletAjouter
 */
@WebServlet("/ServletAjouter")
public class ServletAjouter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAjouter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

        
		request.getServletContext().getRequestDispatcher("/ajouter.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String matricule=request.getParameter("matricule");
		String filiere=request.getParameter("filiere");
		
       Etudiant e=new Etudiant(nom,prenom,matricule,filiere);
       EtudiantDao.addStudent(e);
	}

}
