
public class Employee {
	
	
	private Integer id;
	private String nom;
	private String prenom;
	private String email;
	
	
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
	
	public Employee(String id, String nom, String prenom, String email)
		{
			this.setId(Integer.parseInt(id));
			this.setNom(nom);
			this.setPrenom(prenom);
			this.setEmail(email);
		}
	
	public void hydrateDepuisBDD(String email)
		{
			
		}
		

}
