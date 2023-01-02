import java.io.*;
import java.io.IOException;


class MainClass{
	public static void main() throws IOException {
String folder = request.getParameter("folder");
 String cmd = "mkdir" + folder;
 Runtime.getRuntime().exec(cmd);
 
}	}
