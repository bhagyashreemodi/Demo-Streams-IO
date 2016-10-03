import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.CharBuffer;

public class AssignmentIOReaderWriter {

	
	public static void main(String[] args) throws IOException {
		
		char ch;
		int i;
		InputStreamReader in = new InputStreamReader(System.in);
		PrintWriter tout = new PrintWriter(args[0]);
		try{	
		while((i = in.read()) != -1){

				ch = (char) i;
				if(Character.isDigit(ch)){
					ch = '*';
				}
				else if(Character.isLowerCase(ch)){
						ch = Character.toUpperCase(ch);
				}
				else{
					ch = Character.toLowerCase(ch);
				}
				tout.print(ch);
		}
		}finally{
				in.close();
				tout.close();
		}
		
	}
	
	
	
	
	
	
}
