import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyHttpService {

	
	public static void main(String[] args) throws IOException {
		
		int port = 80;
		String info;
		ServerSocket service = new ServerSocket(port);
		System.out.println("Waiting for connection.....");
		Socket clientInfo = service.accept();
		char cbuf[] = null;
		System.out.println(clientInfo);
		/*InputStream in = clientInfo.getInputStream();
		InputStreamReader iReader = new InputStreamReader(in);
	//	BufferedReader bReader = new BufferedReader(iReader);
		iReader.read(cbuf);
		while(true){
			info = bReader.readLine();
			if(info == -1){
				clientInfo.close();
				break;
			}
				
			
			System.out.println(info);
			
		}
		System.out.println(cbuf);*/
		PrintWriter out= new PrintWriter(clientInfo.getOutputStream());
		out.flush();
		out.print("Hello World");
		out.close();
	}
	
	
	
}
