package main;
import interfaceGraphic.BoutonContextAcme;
import interfaceGraphic.BoutonLabel;
import interfaceGraphic.BoutonTableAcme;
import interfaceGraphic.ButtonRenderer;
import interfaceGraphic.LabelAcme;
import interfaceGraphic.PasswordFieldAcme;
import interfaceGraphic.TableAcme;
import interfaceGraphic.bouttonAcme;
import interfaceGraphic.radioAcme;
import interfaceGraphic.textBoxAcme;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Fenetre extends JFrame implements ActionListener{
	  
	//attributs de la fenetre elle meme
	public String typeFenetre;
	
	//liste des bouttons "tuile"
	public bouttonAcme boutonConexion= new bouttonAcme("CONNECTION");
	public bouttonAcme boutonInscription= new bouttonAcme("INSCRIPTION");
	
	//liste des boutons classiques
	public BoutonContextAcme BConexion = new BoutonContextAcme("Connexion");
	public BoutonContextAcme BInscription = new BoutonContextAcme("Inscription");
	public BoutonContextAcme BIdProjet = new BoutonContextAcme("Voire le projet");
	public BoutonContextAcme BNouveauProjet = new BoutonContextAcme("Ajouter le projet");
	
	//tableau de boutons classiques
	public Object[][] BModiferProjet;
	
	//liste des textboxes
	public textBoxAcme TBNom = new textBoxAcme(15);
	public textBoxAcme TBPrenom = new textBoxAcme(15);
	public textBoxAcme TBEmail = new textBoxAcme("@supinfo.com",15);
	public textBoxAcme TBIdProjet = new textBoxAcme(15);
	public textBoxAcme TBNouveauProjetTitre = new textBoxAcme(15);
	public textBoxAcme TBNouveauProjetDateDebut = new textBoxAcme(15);
	public textBoxAcme TBNouveauProjetDateFin = new textBoxAcme(15);
	
	//liste des champs pour mot de passe
	public PasswordFieldAcme TBMotDePasse = new PasswordFieldAcme(15);
	public PasswordFieldAcme TBConfirmMotDePasse = new PasswordFieldAcme(15);
	
	//liste des bouttons radio
	public radioAcme RBEmployee = new radioAcme("Employé", true);
	public radioAcme RBManager = new radioAcme("Manager");
	
	//liste des groupes de boutons radio
	ButtonGroup groupeRadioStatut = new ButtonGroup();
	
	//liste des labels
	public LabelAcme LNom = new LabelAcme("Nom:");
	public LabelAcme LPrenom = new LabelAcme("Prenom:");
	public LabelAcme LEmail = new LabelAcme("E-mail:");
	public LabelAcme LMotDePasse = new LabelAcme("Mot de passe:");
	public LabelAcme LConfirmMotDePasse = new LabelAcme("Confirmer le mot de passe:");
	public LabelAcme LFonction = new LabelAcme("Fonction:");
	public LabelAcme LTitrePrincipale = new LabelAcme("Bonjour");
	public LabelAcme LIdProjet = new LabelAcme("Id du projet à atteindre: ");
	public LabelAcme LNouveauProjet = new LabelAcme("Nouveau Projet");
	public LabelAcme LNouveauProjetTitre = new LabelAcme("Titre: ");
	public LabelAcme LNouveauProjetDateDebut = new LabelAcme("Date de début (yyyy-mm-dd-hh-mm): ");
	public LabelAcme LNouveauProjetDateFin = new LabelAcme("Date de fin (yyyy-mm-dd-hh-mm): ");
	
	//liste checkbox
	public JCheckBox CBReference = new JCheckBox();
	
	//liste des tables
	public TableAcme listeProjet = new TableAcme();
	
	//liste des panels éventuels de la fenêtre
	public JPanel panelAcceuil = new JPanel();

	private Project listeProjets[];
	
	//initialisation de la fenêtre
	public Fenetre(String typeF)
		{
			this.typeFenetre=typeF;
			
			//parametres de toutes les fenêtres
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("Acme");
			this.setBackground(Color.BLUE);
			
			//choix du type de fenêtre
			if (typeF=="conexion")
				{
					this.FenetreConexion();
				}
		}
	
	//mise en forme de l'écrant d'acceuil non connecté
	public void FenetreConexion()
		{
			this.setSize(500, 500); 
			this.setLayout(new BorderLayout());
			
			
			panelAcceuil.setBackground(Color.BLUE);			
			
			
			boutonConexion.addActionListener(this);
			boutonInscription.addActionListener(this);
			this.setContentPane(panelAcceuil);
			this.panelAcceuil.add(boutonConexion, BorderLayout.CENTER);
			this.panelAcceuil.add(boutonInscription, BorderLayout.CENTER);
			
			
			

			
			
	
		}
	
	//mise en forme de la fenêtre pour la conexion
	public void panelConexion()
		{
			
			this.setContentPane(panelAcceuil);
			panelAcceuil.removeAll();
			
			panelAcceuil.revalidate();
			System.out.println("panneau de conexion");
			
			
			//ajout des champs et bouttons
			panelAcceuil.add(LEmail);
			panelAcceuil.add(TBEmail);
			panelAcceuil.add(LMotDePasse);
			panelAcceuil.add(TBMotDePasse);
			BConexion.addActionListener(this);
			panelAcceuil.add(BConexion);
			
		}
	
	//mise en forme de la fenêtre pour l'inscription
	public void panelInscription()
		{
			this.setContentPane(panelAcceuil);
			panelAcceuil.removeAll();
			
			panelAcceuil.revalidate();
			System.out.println("panneau d'inscription");
			
			
			
			groupeRadioStatut.add(RBEmployee);
			groupeRadioStatut.add(RBManager);
			
			//ajout des champs et bouttons
			panelAcceuil.add(LNom);
			panelAcceuil.add(TBNom);
			panelAcceuil.add(LPrenom);
			panelAcceuil.add(TBPrenom);
			panelAcceuil.add(LEmail);
			panelAcceuil.add(TBEmail);
			panelAcceuil.add(LMotDePasse);
			panelAcceuil.add(TBMotDePasse);
			panelAcceuil.add(LConfirmMotDePasse);
			panelAcceuil.add(TBConfirmMotDePasse);
			panelAcceuil.add(LFonction);
			panelAcceuil.add(RBEmployee);
			panelAcceuil.add(RBManager);
			BInscription.addActionListener(this);
			panelAcceuil.add(BInscription);
			
			
			
		}
	
	//pannel d'accueil du client conecté
	public void panelAcceuilConnexte(String[] infoEmployee)
		{
			Employee client;
			String classe="employee";

			if (infoEmployee[4].equals("0"))
				{
					client= new Employee(infoEmployee[0], infoEmployee[1], infoEmployee[2], infoEmployee[3]);
				}
			else if (infoEmployee[4].equals("1"))
				{
					client= new Manager(infoEmployee[0], infoEmployee[1], infoEmployee[2], infoEmployee[3]);
					classe="manager";
				}
			else
				{
					client= new Employee(infoEmployee[0], infoEmployee[1], infoEmployee[2], infoEmployee[3]);
				}
			
			this.setContentPane(panelAcceuil);
			panelAcceuil.removeAll();
			
			panelAcceuil.revalidate();
			System.out.println("panneau d'accueil");
			
			LTitrePrincipale = new LabelAcme("Bonjour "+client.getNom());
			panelAcceuil.add(LTitrePrincipale);
			
			
			
			//reecherche des projets du client
				ConexionServeur requete = new ConexionServeur();
				String toutProjet=requete.rechercheProjet(client.getId());
				
				String[] liste = toutProjet.split(";");
				
				Project[] listeProjets = new Project[liste.length];
				
				Integer iListeProjet=0;
				
				Object[][] donnee =  new Object[liste.length][];
				if (!toutProjet.equals(""))
					{
						for (String projet : liste) 
							{
								String[] attributProjet=projet.split("@!");
								//listeProjets[iListeProjet]=null;
								listeProjets[iListeProjet]=new Project(Integer.parseInt(attributProjet[0]), attributProjet[1], attributProjet[2], attributProjet[3], Integer.parseInt(attributProjet[4]), Integer.parseInt(attributProjet[5]));
								
								//JCheckBox check= new JCheckBox();
								//BoutonTableAcme BModifierLeProjet = new BoutonTableAcme(check);
								//BModifierLeProjet.id=listeProjets[iListeProjet].getId();
								Object[] attProj ={attributProjet[0], attributProjet[1], attributProjet[2], attributProjet[3], attributProjet[4], attributProjet[5], "Modifier"};
								donnee[iListeProjet]=attProj;
								iListeProjet++;
								
								
							}
						
						client.setListeProjet(listeProjets);
						
						//affichage des projets dans une table
						
						String[] titreCollones= { "Id", "Nom", "Date de début", "Date de fin", "Avancement", "Nombre d'employés", "Modifier"};
						this.listeProjet=new TableAcme(donnee, titreCollones);
						this.listeProjet.getColumn("Modifier").setCellEditor(new BoutonTableAcme(new JCheckBox(),this.listeProjet));
					
						this.listeProjet.getColumn("Modifier").setCellRenderer(new ButtonRenderer("Modifier"));
						JScrollPane scoll = new JScrollPane(listeProjet);
						
						this.add(scoll);
					}
				//ajouter un nouveau projet
				if (classe.equals("manager")) //cette ligne n'est pas propre, à modifier si on a le temps
					{
						//ajout liste champs et bouttons
						this.add(LNouveauProjet);
						this.add(LNouveauProjetTitre);
						this.add(TBNouveauProjetTitre);
						this.add(LNouveauProjetDateDebut);
						this.add(TBNouveauProjetDateDebut);
						this.add(LNouveauProjetDateFin);
						this.add(TBNouveauProjetDateFin);
						this.add(BNouveauProjet);
						BNouveauProjet.addActionListener(this);
						
					}
				
				
			

			
		}
	
	public void panelNouveauProjet()
		{
			String titre = TBNouveauProjetTitre.getText();
			String dateDebut = TBNouveauProjetDateDebut.getText();
			String dateFin = TBNouveauProjetDateFin.getText();
			
			
			String ajoutReussi="0";
			
			ConexionServeur requete = new ConexionServeur();
			ajoutReussi = requete.nouveauProjet(titre, dateDebut, dateFin);
			System.out.println("tout vas bien: "+ajoutReussi);
			//si le nouveau projet a été ajouté, on redirige vers le panneau d'édition de projet
			if (!ajoutReussi.equals("0"))
				{
					JOptionPane.showMessageDialog(this, "Nouveau projet ajouté");
					this.panelModifierProjet(ajoutReussi);
				}
			
			
		}
	
	
	public void panelModifierProjet(String idProjet)
		{
			//on vide l'ancien panneau
			this.setContentPane(panelAcceuil);
			panelAcceuil.removeAll();
			panelAcceuil.revalidate();
			System.out.println("Panneau de modification de projet");
			
			//recherche sur le projet en cour
			String infosProjet="0";
			ConexionServeur requete = new ConexionServeur();
			infosProjet = requete.modifierProjet(idProjet);
			//si le projet existe
			if (!infosProjet.equals("0"))
				{
				
					String[] attributProjet=infosProjet.split(";");
					
					//affichage des données sur le projet
					Project projetEnCour=new Project(Integer.parseInt(attributProjet[0]), attributProjet[1], attributProjet[2],attributProjet[3]);
					this.add(new LabelAcme("<html>Projet: "+projetEnCour.getNom()+"<br/>"+"Date de début: "+projetEnCour.getDateDebut()+"<br/>"+"Date de fin: "+projetEnCour.getDateFin()+"</html>"));
				
				
				}
			else
				{
					JOptionPane.showMessageDialog(this, "Projet Introuvable");
					
				}
		}
	
	public void enregistrerInscription()
		{
			String nom = TBNom.getText();
			String prenom = TBPrenom.getText();
			String email = TBEmail.getText();
			char[] mdp = TBMotDePasse.getPassword();
			String motDePasse = String.valueOf(mdp);
			char[] cmdp = TBConfirmMotDePasse.getPassword();
			String confirmMotDePasse = String.valueOf(cmdp);
			String statut="0";
			
			if (RBManager.isSelected())
				{
					statut = "1";
				}
			if (motDePasse.equals(confirmMotDePasse))
				{
					String inscriptionReussie="0";
					ConexionServeur requete = new ConexionServeur();
					inscriptionReussie = requete.inscription(nom, prenom, email, motDePasse, statut);
					System.out.println("tout vas bien: "+inscriptionReussie);
					//si l'inscription est réussie, on le dis et on redirige vers la page de conexion
					if (inscriptionReussie.equals("1"))
						{
							JOptionPane.showMessageDialog(this, "Inscription réussie");
							this.panelConexion();
						}
				}
		}
	public void enregistrerConexion()
		{
			String email = TBEmail.getText();
			char[] mdp = TBMotDePasse.getPassword();
			String motDePasse = String.valueOf(mdp);
			
			String conexionReussie="0";
			
			ConexionServeur requete = new ConexionServeur();
			conexionReussie = requete.conexion(email, motDePasse);
			
			if (!conexionReussie.equals("0"))
				{
				

					//découpage en tableau de la chaine de caractere recue
					String[] conexion;

					conexion = conexionReussie.split(";");

 					JOptionPane.showMessageDialog(this, "Conexion réussie");

				

 					this.panelAcceuilConnexte(conexion);
					
					
					
				}
			else
				{
					JOptionPane.showMessageDialog(this, "Conexion échouée");
				}
			
			
			
		}

	//action des bouttons
	@Override
	public void actionPerformed(ActionEvent e) 
		{
			System.out.println("truc1");
			
			if (e.getSource()==boutonConexion)
				{
					this.panelConexion();
				}
			if (e.getSource()==boutonInscription)
				{
					this.panelInscription();
				}
			if (e.getSource()==BConexion)
				{
					this.enregistrerConexion();
				}
			if (e.getSource()==BNouveauProjet)
				{
					this.panelNouveauProjet();
				}
			if (e.getSource()==BInscription)
				{
					this.enregistrerInscription();
				}
			if (e.getSource().getClass().equals(CBReference.getClass()))
				{
					this.enregistrerInscription();
					System.out.println("truc");
				}
			
			if (e.getSource()==BIdProjet)
				{
					
				}
				
		}

	
		
	
}
