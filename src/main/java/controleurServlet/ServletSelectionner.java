package controleurServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Metier.Etudiant;
import gestionEtudiantDAO.EtudiantDao;

/**
 * Servlet implementation class ServletSelectionner
 */
@WebServlet("/ServletSelectionner")
public class ServletSelectionner extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSelectionner() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Etudiant> listDesEtudiants = new ArrayList<Etudiant>();
		String chek=request.getParameter("chek");
		String chercher=request.getParameter("chercher");
		switch(chek) {
		case "id":
			int id=Integer.parseInt(request.getParameter("chercher"));
			EtudiantDao.getStudentById(id);
			Optional<Etudiant> optEtudiant=EtudiantDao.getStudentById(id);
			if(optEtudiant.isPresent()) {
				listDesEtudiants.add(optEtudiant.get());
				
			}
			
			break;
		case "matricule":
			listDesEtudiants.addAll(EtudiantDao.getStudentsHaveMatriculeStartedWith(chercher));
			
			break;
		case "filiere":
			listDesEtudiants.addAll(EtudiantDao.getStudentsByFiliere(chercher));
	
			break;
		}
		
		request.setAttribute("etudiantList", listDesEtudiants);
		
		
		request.getServletContext().getRequestDispatcher("/NewFile.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
