package gestionEtudiantDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class cnx {
	public static Connection getCnx()
	{
		Connection co=null;
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/sql";
		String user="root";
		String pass="";
		co=DriverManager.getConnection(url, user, pass);
		
			
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return co;
	 
	}

}
