import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBDD {
	
	private String userDB="supinfo";
	private String mdpDB="supinfo";
	private String adresseDB="localhost";
	
	public String getUserDB() {
		return userDB;
	}

	public void setUserDB(String userDB) {
		this.userDB = userDB;
	}

	public String getMdpDB() {
		return mdpDB;
	}

	public void setMdpDB(String mdpDB) {
		this.mdpDB = mdpDB;
	}
	
	public ConexionBDD()
		{
			
		}

	
	public String requete()
		{
			String retour="";
			
			try 
				{
					  Class.forName(com.mysql.jdbc.Driver.class.getName());
				} 
			catch(ClassNotFoundException ex) 
				{
					  System.out.println("Can’t load the Driver");
				}

			
			
					  //Class.forName(com.mysql.jdbc.Driver.class.getName());
			try 
				{
					Connection connection = DriverManager.getConnection(adresseDB,userDB,mdpDB);
					System.out.println("conexion à la base de donnée réussie");
				}
			catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			
			
			
			
			return retour;
		}
}
