package main;

public class Project {
	
	private Integer id;
	private String nom;
	private String dateDebut;
	private String dateFin;
	private String description;
	private Integer completion;
	private Integer nombreDEmployee;
	
	
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
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getCompletion() {
		return completion;
	}
	public void setCompletion(Integer completion) {
		this.completion = completion;
	}
	public Integer getNombreDEmployee() {
		return nombreDEmployee;
	}
	public void setNombreDEmployee(Integer nombreDEmployee) {
		this.nombreDEmployee = nombreDEmployee;
	}
	
	public Project()
	{
		
	}
	public Project(Integer id, String nom, String dateDebut, String dateFin, Integer nombreEmploye, Integer completion)
		{
			this.setId(id);
			this.setNom(nom);
			this.setDateDebut(dateDebut);
			this.setDateFin(dateFin);
			this.setNombreDEmployee(nombreEmploye);
			this.setCompletion(completion);
		}
	public Project(Integer id, String nom, String dateDebut, String dateFin)
		{
			this.setId(id);
			this.setNom(nom);
			this.setDateDebut(dateDebut);
			this.setDateFin(dateFin);
			
		}
	
	
	

}
