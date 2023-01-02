import org.h2.security.SHA256;
import java.io.*;


class MainClass{
	public static void main() throws  {
String inputString = "s3cr37";
 byte[] key = inputString.getBytes();
 SHA256.getHMAC(key, message);
 
}	}
