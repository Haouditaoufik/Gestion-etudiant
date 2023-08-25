<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form  method="get"   action="ServletModifier">

 <div> 
         <label>
         Nom
         </label>
         <input type="text" name="nom">
 
        </div> 
        
         <div> 
         <label>
         Prenom
         </label>
         <input type="text" name="prenom">
 
        </div>
        
        
        
         <div> 
         <label>
         Matricule
         </label>
         <input type="text" name="matricule">
 
        </div>
        
        
         <div> 
         <label>
         Filiere
         </label>
         <input type="text" name="filiere">
 
        </div>
<button type="submit">Envoyer</button>
<a href="Servlet1">Annuler</a>


</form>


</body>
</html>