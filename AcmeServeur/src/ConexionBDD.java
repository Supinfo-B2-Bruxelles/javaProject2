import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


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
	
	public String inscription(String nom, String prenom, String email, String mdp, int statut)
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
			
			String retour="1";
			return retour;
			
				  
				 
				

		
		}
	
	public String conexion(String email, String mdp)
		{
			String retour="0";
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
					Statement stmt = connection.createStatement();

					//ResultSet rs = stmt.executeQuery("SELECT * FROM employee WERE e_mail ="+email);
					
					ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
					
					
					
					while(rs.next()) 
						{
							
							if (rs.getString("mot_de_passe").equals(mdp) && rs.getString("e_mail").equals(email))
								{
									retour=rs.getString("id")+";"+rs.getString("nom")+";"+rs.getString("prenom")+";"+rs.getString("e_mail")+";"+rs.getString("statut");
								}
							
						}


				}
			catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			return retour;
		}
	
	public String rechercheProjet(String idClient)
		{
			String retour="0";
			
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
					Statement stmt = connection.createStatement();
	
					//ResultSet rs = stmt.executeQuery("SELECT * FROM employee WERE e_mail ="+email);
					
					ResultSet rs = stmt.executeQuery("SELECT * FROM employee_project");
					
					
					retour="";
					while(rs.next()) 
						{
							
							if (rs.getString("id_employee").equals(idClient))
								{
									Statement stmtb = connection.createStatement();
									ResultSet rsb = stmtb.executeQuery("SELECT * FROM project");
									while(rsb.next()) 
									{
										
										if (rsb.getString("id").equals(rs.getString("id_project")))
											{
												//recherche du nombre d'employés qui travaille sur le projet
												Statement stmtEmp = connection.createStatement();
												ResultSet rsEmp = stmtEmp.executeQuery("SELECT * FROM employee_project");
												Integer nombreEmploye=0;
												while (rsEmp.next())
													{
														if (rsEmp.getString("id_project").equals(rs.getString("id_project")))
															{
																nombreEmploye++;
															
															}
													}
												//recherche du pourcentage d'avancement du projet
												Statement stmtAvancementProjet = connection.createStatement();
												ResultSet rsAvancementProjet = stmtAvancementProjet.executeQuery("SELECT * FROM tache");
												Integer tacheFinie=0;
												Integer touteTache=0;
												Integer Avancement;
												while (rsEmp.next())
													{
														if (rsAvancementProjet.getString("id_projet").equals(rs.getString("id_project")))
															{
																if(rsAvancementProjet.getString("statut").equals(1))
																	{
																		tacheFinie++;
																	}
																touteTache++;
															}
													}
												//élimination des éventuelles divisions par 0	
												if (touteTache.equals(0))
													{
														Avancement=0;
													}
												else
													{
														Avancement=(tacheFinie/touteTache)*100;
													}
												//création du message de retour pour le client
												retour+=rsb.getString("id")+"@!"+rsb.getString("nom")+"@!"+rsb.getString("date_debut")+"@!"+rsb.getString("date_fin")+"@!"+Integer.toString(nombreEmploye)+"@!"+Integer.toString(Avancement);
												retour+=";";
											}
									}
								}
							
						}
	
	
				}
			catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			return retour;
		
		}
	
	public String nouveauProjet(String titre, String dateDebutString, String dateFinString)
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
					String requete = "INSERT INTO project (nom, date_debut, date_fin)"+ " VALUES ('"+titre+"', '"+dateDebutString+"', '"+dateFinString+"')";
					connection.createStatement().executeUpdate(requete);
				}
			catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			String retour="1";
			return retour;
			
				  
				 
				
	
		
		}
	
}
