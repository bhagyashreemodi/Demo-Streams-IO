import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtils {

	public void writePrimitives(OutputStream out) throws IOException{
		
		try(DataOutputStream dout = new DataOutputStream(out)){
			dout.writeLong(1);
			dout.writeDouble(12.34f);
			dout.writeBoolean(false);
		}
		
		
		
	}
	
	public void readPrimitives(InputStream in) throws Exception{
		
		try(DataInputStream din = new DataInputStream(in)){
			System.out.println(din.readLong() + "\t" + din.readDouble() + "\t" + din.readBoolean());
			
		}
		
	}
	
}
