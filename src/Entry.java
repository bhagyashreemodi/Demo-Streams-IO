import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Entry {

	public static void main(String[] args) throws Exception {
		
		IOUtils ioutils = new IOUtils();
		try(OutputStream out = new FileOutputStream("test1.prmtv")){
			ioutils.writePrimitives(out);
		}
		/*try(InputStream in = new FileInputStream("test.prmtv")){
			ioutils.readPrimitives(in);
		}*/
	}
	
	
}
