import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
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

}
