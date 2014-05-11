package main;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


public class ConexionServeur {
	
	public String nomServeur="localhost";
	public Integer port=18000;
	
	public void envoieRequete()
		{
			BufferedReader in;
			PrintWriter out;
			try 
				{
					//connexion au serveur
					Socket s = new Socket(nomServeur, port);
					
					   in = new BufferedReader (new InputStreamReader (s.getInputStream()));
				        String message_distant = in.readLine();
				        System.out.println("message du serveur"+message_distant);
					// Close the socket
					s.close();
					//out.flush();
					//out.close();
				} 
			catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
	public String inscription(String nom, String prenom, String email, String mdp, String statut)
		{
			BufferedReader in;
			PrintWriter out;
			String retour="0";
			try 
				{
					System.out.println("envoie de la requete d'inscription");
					//connexion au serveur
					Socket s = new Socket(nomServeur, port);
						OutputStreamWriter writer = new OutputStreamWriter(s.getOutputStream());
						PrintWriter write = new PrintWriter(s.getOutputStream());
	                    write.println("inscription"+";"+nom+";"+prenom+";"+email+";"+mdp+";"+statut);
	                    write.flush();
						
						
					   in = new BufferedReader (new InputStreamReader (s.getInputStream()));
				        String message_distant = in.readLine();
				        System.out.println("message du serveur"+message_distant);
					// Close the socket
					s.close();
					//out.flush();
					//out.close();
					retour = message_distant;
					
				} 
			catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return retour;
		}
	
	public String conexion(String email, String motDePasse)
		{
			BufferedReader in;
			PrintWriter out;
			String retour="0";
			try 
				{
					System.out.println("envoie de la requete de connexion");
					//connexion au serveur
					Socket s = new Socket(nomServeur, port);
						OutputStreamWriter writer = new OutputStreamWriter(s.getOutputStream());
						PrintWriter write = new PrintWriter(s.getOutputStream());
	                    write.println("conexion"+";"+email+";"+motDePasse);
	                    write.flush();
						
						
					   in = new BufferedReader (new InputStreamReader (s.getInputStream()));
				        String message_distant = in.readLine();
				        System.out.println("message du serveur"+message_distant);
					// Close the socket
					s.close();
					//out.flush();
					//out.close();
					retour = message_distant;
					
				} 
			catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			return retour;
		}
	
	public String rechercheProjet(Integer idClient)
		{
			BufferedReader in;
			PrintWriter out;
			String retour="0";
			try 
				{
					System.out.println("envoie de la requete de recherche des projets");
					//connexion au serveur
					Socket s = new Socket(nomServeur, port);
						OutputStreamWriter writer = new OutputStreamWriter(s.getOutputStream());
						PrintWriter write = new PrintWriter(s.getOutputStream());
	                    write.println("rechercheProjet"+";"+idClient);
	                    write.flush();
						
						
					   in = new BufferedReader (new InputStreamReader (s.getInputStream()));
				        String message_distant = in.readLine();
				        System.out.println("message du serveur"+message_distant);
					// Close the socket
					s.close();
					//out.flush();
					//out.close();
					retour = message_distant;
					
				} 
			catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			
			return retour;
		}
	
	public String nouveauProjet(String titre, String dateDebut, String dateFin)
		{
			BufferedReader in;
			PrintWriter out;
			String retour="0";
			try 
				{
					System.out.println("envoie de la requete d'enregistrement");
					//connexion au serveur
					Socket s = new Socket(nomServeur, port);
						OutputStreamWriter writer = new OutputStreamWriter(s.getOutputStream());
						PrintWriter write = new PrintWriter(s.getOutputStream());
	                    write.println("nouveauProjet"+";"+titre+";"+dateDebut+";"+dateFin);
	                    write.flush();
						
						
					   in = new BufferedReader (new InputStreamReader (s.getInputStream()));
				        String message_distant = in.readLine();
				        System.out.println("message du serveur"+message_distant);
					// Close the socket
					s.close();
					//out.flush();
					//out.close();
					retour = message_distant;
					
				} 
			catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return retour;
		}

}
