import interfaceGraphic.bouttonAcme;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JFrame implements ActionListener{
	 
	//attributs de la fenetre elle meme
	public String typeFenetre;
	
	//liste des bouttons potentiellement sur la fenetre
	public bouttonAcme boutonConexion= new bouttonAcme("CONNECTION");
	public bouttonAcme boutonInscription= new bouttonAcme("INSCRIPTION");
	
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
			
			panelAcceuil.setBackground(Color.BLUE);			
			
			
			boutonConexion.addActionListener(this);
			boutonInscription.addActionListener(this);
			panelAcceuil.add(boutonConexion);
			panelAcceuil.add(boutonInscription);
			this.setContentPane(panelAcceuil);
			
			

			
			
	
		}
	
	//mise en forme de la fenêtre pour la conexion
	public void panelConexion()
		{
			
			this.setContentPane(panelAcceuil);
			panelAcceuil.removeAll();
			
			panelAcceuil.revalidate();
			System.out.println("conexion");
			
		}
	
	//mise en forme de la fenêtre pour l'inscription
	public void panelInscription()
		{
			this.setContentPane(panelAcceuil);
			panelAcceuil.removeAll();
			
			panelAcceuil.revalidate();
			System.out.println("inscription");
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
			
		}

	
		
	
}
