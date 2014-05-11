
import java.io.*;
import java.net.*;
import java.util.LinkedList;
import java.util.StringTokenizer;


//Main du serveur
public class Main {

	public static void main(String[] args) 
	{
		// Listening Port : 18000 || Max connection queue: 5
		ServerSocket listen;
		InputStreamReader ISR = null;
		BufferedReader in;
		PrintWriter out;
		try 
			{
				System.out.println("serveur en fonctionnement");
				listen = new ServerSocket(18000, 5);
				Socket service;
				ConexionBDD baseDeDonnee = new ConexionBDD();
				
				while (true) 
					{
						System.out.println("serveur en fonctionnement 1");
						// Ready to accept client connection
						
						service = listen.accept();
						System.out.println("connexion accept�e");
						
						ISR = new InputStreamReader(service.getInputStream());
						
						in = new BufferedReader(ISR);
						
						String texteRecu = in.readLine();
						
						System.out.println("texte recu: "+texteRecu);
						
						//d�coupage en tableau de la chaine de caractere recue
						String[] liste = texteRecu.split(";");
						
						//appel de la m�thode correspondante
						GestionReponse gestion = new GestionReponse();
						String resultatTraitement="0"; //cette variable sert � savoire si tout s'est bien pass�. dans le cas d'une r�ponse (par ex: un SELECT), elle contiendra la r�ponse
						if (liste[0].equals("inscription"))
							{
								resultatTraitement=gestion.inscription(liste);
							}
						else if (liste[0].equals("conexion"))
							{
								resultatTraitement=gestion.conexion(liste);
								System.out.println("resutat req co: "+ resultatTraitement);
							}
						else if (liste[0].equals("rechercheProjet"))
							{
								resultatTraitement=gestion.rechercheProjet(liste);
								System.out.println("resutat req co: "+ resultatTraitement);
							}
						else if (liste[0].equals("nouveauProjet"))
							{
								resultatTraitement=gestion.nouveauProjet(liste);
								System.out.println("resutat req co: "+ resultatTraitement);
							}
						else if (liste[0].equals("rechercheProjetParIdProjet"))
							{
								resultatTraitement=gestion.rechercheProjetParIdProjet(liste);
								System.out.println("resutat req co: "+ resultatTraitement);
							}
						
							
						
						 out = new PrintWriter(service.getOutputStream());
						 out.println(resultatTraitement);
						 out.flush();
						System.out.println("serveur en fonctionnement");
			
					}
			
			} 
		catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("serveur � l'arret");
			

		

	}
	
	
}
