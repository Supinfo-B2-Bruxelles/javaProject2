
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
			BDD.inscription(nom, prenom, email, mdp, statutInt);
			
			
			return retour;
		}

}
