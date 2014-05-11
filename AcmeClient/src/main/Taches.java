package main;

public class Taches {
	private Integer id;
	private String nom;
	private String dateDebut;
	private String dateFin;
	private Integer autheur;
	private String description;
	private Integer statut;
	private Integer idProject;
	private Integer idEmployee;
	
	
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
	public Integer getAutheur() {
		return autheur;
	}
	public void setAutheur(Integer autheur) {
		this.autheur = autheur;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getStatut() {
		return statut;
	}
	public void setStatut(Integer statut) {
		this.statut = statut;
	}
	public Integer getIdProject() {
		return idProject;
	}
	public void setIdProject(Integer idProject) {
		this.idProject = idProject;
	}
	public Integer getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}
	public Taches(Integer id, String nom, String dateDebut, String dateFin,
			Integer autheur, String description, Integer statut,
			Integer idProject, Integer idEmployee) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.autheur = autheur;
		this.description = description;
		this.statut = statut;
		this.idProject = idProject;
		this.idEmployee = idEmployee;
	}
	

}
