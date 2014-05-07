import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class ConexionServeur {
	
	public String nomServeur="localhost";
	public Integer port=18000;
	
	public void envoieRequete()
		{
			try 
				{
					//connexion au serveur
					Socket s = new Socket(nomServeur, port);
					OutputStream out = new FileOutputStream ("");
					InputStream in = s.getInputStream();
					byte[] buffer = new byte[256];
						
					// While there is bytes to read
					while (in.read (buffer) != -1) 
						{
							// Write the current byte
							out.write (buffer);
						}
					// Close the socket
					s.close();
					out.flush();
					out.close();
				} 
			catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

}
