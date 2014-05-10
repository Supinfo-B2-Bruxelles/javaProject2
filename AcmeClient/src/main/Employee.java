package main;
import javax.swing.JOptionPane;


public class Employee {
	
	
	private Integer id;
	private String nom;
	private String prenom;
	private String email;
	private Project[] listeProjet;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Project[] getListeProjet() {
		return listeProjet;
	}
	public void setListeProjet(Project[] listeProjet) {
		this.listeProjet = listeProjet;
	}
	

	
	public Employee(String id, String nom, String prenom, String email)
		{
			this.setId(Integer.parseInt(id));
			this.setNom(nom);
			this.setPrenom(prenom);
			this.setEmail(email);
		}
	
	public void ListeProjetBDD()
		{
			String rechercheProjets="0";
			ConexionServeur requete = new ConexionServeur();
			rechercheProjets = requete.rechercheProjet(this.getId());
			
			if (!rechercheProjets.equals("0"))
				{
					//découpage en tableau de la chaine de caractere recue
					String[] conexion;
					conexion = rechercheProjets.split(";");
					
					
				}
			else
				{
					
				}
		}
		

}
