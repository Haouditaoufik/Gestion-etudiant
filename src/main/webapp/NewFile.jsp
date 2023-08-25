<%@page import="Metier.Etudiant"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	 List<Etudiant> listDesEtudiants =(List<Etudiant>) request.getAttribute("etudiantList");
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form method="get" action="ServletSelectionner">
  
  
  <h1>Bienvenue ,  ${username}!</h1>
    
     <div> 
      <input type="radio" name="chek" value="id">
         <label>
        
         Chercher par Id 
         </label>
         
 
        </div> 
        
         <div> 
         <input type="radio" name="chek" value="filiere">
         <label>
         
         Chercher par Filiere
         </label>
         
 
        </div>
        
        
        
         <div>
            <input type="radio" name="chek" value="matricule"> 
         <label>
       
         Chercher par Matricule
         </label>
        
 
        </div>
     <div>
      <label>
       
         Chercher par ....
         </label>
            <input type="text" name="chercher"> 
        
        
 
        </div>
        <button type="submit">Envoyer</button>
</form>

	 <table border="1">
	    <tr>
	         <th>Id</th>
	         <th>Nom</th>
	         <th>Prenom</th>
	         <th>Matricule</th>
	         <th>Filiere</th>
	         <th>Modifier</th>
	         <th>Supprimer</th>
	    </tr>
	    <%
	    for(int i = 0;i<listDesEtudiants.size();i++){
	    
	    %>
	 <tr>
	 <td><%=listDesEtudiants.get(i).getId() %></td>
	  <td><%=listDesEtudiants.get(i).getNom()%></td>
	   <td><%=listDesEtudiants.get(i).getPrenom()%></td>
	    <td><%=listDesEtudiants.get(i).getMatricule()%></td>
	     <td><%=listDesEtudiants.get(i).getFiliere()%></td>
	     <td><a href="ServletId?id=<%=listDesEtudiants.get(i).getId()%>">Modifier</a></td>
	     <td><a href="ServletSupprimer?id=<%=listDesEtudiants.get(i).getId()%>">Supprimer</a></td>
	 </tr>
	 <%} %>
	 
	 
	 
	 
	 
	 </table>
	 <a href="ServletAjouter">Ajouter...</a>
	 
	 
	 
	 
	 
    <a href="ServletLogin">Déconnexion</a>
	 
</body>
</html>