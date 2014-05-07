import interfaceGraphic.BoutonContextAcme;
import interfaceGraphic.LabelAcme;
import interfaceGraphic.PasswordFieldAcme;
import interfaceGraphic.bouttonAcme;
import interfaceGraphic.radioAcme;
import interfaceGraphic.textBoxAcme;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JFrame implements ActionListener{
	  
	//attributs de la fenetre elle meme
	public String typeFenetre;
	
	//liste des bouttons "tuile"
	public bouttonAcme boutonConexion= new bouttonAcme("CONNECTION");
	public bouttonAcme boutonInscription= new bouttonAcme("INSCRIPTION");
	
	//liste des boutons classiques
	public BoutonContextAcme BConexion = new BoutonContextAcme("Connexion");
	public BoutonContextAcme BInscription = new BoutonContextAcme("Inscription");
	
	//liste des textboxes
	public textBoxAcme TBNom = new textBoxAcme(15);
	public textBoxAcme TBPrenom = new textBoxAcme(15);
	public textBoxAcme TBEmail = new textBoxAcme("@supinfo.com",15);
	
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
	
	//liste des panels éventuels de la fenêtre
	public JPanel panelAcceuil = new JPanel();
	
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
			
			panelAcceuil.add(BInscription);
			
			
			
		}
	
	public void enregistrerInscription()
		{
			
		}
	public void enregistrerConexion()
		{
			String nom = TBNom.getText();
			String prenom = TBPrenom.getText();
			String email = TBEmail.getText();
			char mdp = TBMotDePasse.getPassword();
			String motDePasse = String.valueOf(mdp);
			char cmdp = TBConfirmMotDePasse.getPassword();
			String confirmMotDePasse = String.valueOf(cmdp);
			String Statut="0";
			if (RBManager.isSelected())
				{
					Statut = "0";
				}
			
			
		}

	//action des bouttons
	@Override
	public void actionPerformed(ActionEvent e) 
		{
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
			if (e.getSource()==BInscription)
				{
					this.enregistrerInscription();
				}
			
		}

	
		
	
}
