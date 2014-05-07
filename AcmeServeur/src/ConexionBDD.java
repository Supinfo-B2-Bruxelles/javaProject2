import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBDD {
	
	private String userDB="root";
	private String mdpDB="";
	private String adresseDB="jdbc:mysql://127.0.0.1/acme";
	
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
	
	public void inscription(String nom, String prenom, String email, String mdp, int statut)
		{
		
			//chargement du driver
			try 
				{
					  Class.forName(com.mysql.jdbc.Driver.class.getName());
				} 
			catch(ClassNotFoundException ex) 
				{
					  System.out.println("Can’t load the Driver");
				}
	
			
			
			//connexion à la base de donnée
			
			try 
				{
					Connection connection = DriverManager.getConnection(adresseDB,userDB,mdpDB);
					System.out.println("conexion à la base de donnée réussie");
					String requete = "INSERT INTO employee (nom, prenom, e_mail, mot_de_passe, statut)"+ " VALUES ('"+nom+"', '"+prenom+"', '"+email+"','"+mdp+"', "+statut+")";
					connection.createStatement().executeUpdate(requete);
				}
			catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			//envoie de la requete
			
				  
				 
				
			
		
		
		
		
		
		
		}
}
