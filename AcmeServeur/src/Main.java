
import java.io.*;
import java.net.*;


//Main du serveur
public class Main {

	public static void main(String[] args) 
	{
		// Listening Port : 18000 || Max connection queue: 5
		ServerSocket listen;
		try 
			{
				System.out.println("serveur en fonctionnement");
				listen = new ServerSocket(18000, 5);
				Socket service;
				
				while (true) 
					{
						System.out.println("serveur en fonctionnement 1");
						// Ready to accept client connection
						
						service = listen.accept();
						OutputStream out = service.getOutputStream();
						InputStream in = new FileInputStream ("file");
						byte[] buffer = new byte[256];
			
						// While there is byte to read
						while (in.read (buffer) != -1) 
							{
								out.write (buffer);
							}
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
