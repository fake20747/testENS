import java.io.File;
import java.io.IOException;


class MainClass{
	public static void main() throws IOException {
try {
   File insecureTempDir = File.createTempFile("", ".");
   insecureTempDir.delete();
   insecureTempDir.mkdir();
   }
   catch(IOException e) {
   }
 
}	}
