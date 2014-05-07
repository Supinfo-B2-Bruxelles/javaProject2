
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
						System.out.println("connexion acceptée");
						
						ISR = new InputStreamReader(service.getInputStream());
						
						in = new BufferedReader(ISR);
						
						String texteRecu = in.readLine();
						
						System.out.println("texte recu: "+texteRecu);
						
						//découpage en tableau de la chaine de caractere recue
						String[] liste = texteRecu.split(";");
						
						//appel de la méthode correspondante
						GestionReponse gestion = new GestionReponse();
						if (liste[0].equals("inscription"))
							{
								gestion.inscription(liste);
							}
						
						System.out.println(baseDeDonnee.requete());
						 out = new PrintWriter(service.getOutputStream());
						 out.println("Vous êtes connecté zéro !");
						 out.flush();
						System.out.println("serveur en fonctionnement");
			
					}
			
			} 
		catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("serveur à l'arret");
			

		

	}
	
	
}
