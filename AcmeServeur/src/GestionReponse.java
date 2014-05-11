
public class GestionReponse {
	
	
	public String inscription(String[] liste)
		{
			String retour="";
			
			//split de la liste dans des variables
			String nom=liste[1];
			String prenom=liste[2];
			String email=liste[3];
			String mdp=liste[4];
			String statut=liste[5];
			
			int statutInt=Integer.parseInt(statut);
					
			ConexionBDD BDD = new ConexionBDD();
			retour = BDD.inscription(nom, prenom, email, mdp, statutInt);
			
			
			return retour;
		}
	
	public String conexion(String[] liste)
		{
			String retour="";
			
			String email=liste[1];
			String mdp=liste[2];
			
			ConexionBDD BDD = new ConexionBDD();
			retour = BDD.conexion(email, mdp);
			
			return retour;
		}
	public String rechercheProjet(String[] liste)
		{
			String retour="";
			
			String idClient=liste[1];
			
			ConexionBDD BDD = new ConexionBDD();
			retour = BDD.rechercheProjet(idClient);
			
			return retour;
		}
	public String nouveauProjet(String[] liste)
		{
			String retour="";
			
			String titre=liste[1];
			String dateDebutString=liste[2];
			String dateFinString=liste[3];
			
			
			ConexionBDD BDD = new ConexionBDD();
			retour = BDD.nouveauProjet(titre, dateDebutString, dateFinString);
			
			return retour;
		}

}
