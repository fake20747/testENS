import java.io.*;

 class MainClass{ 
	 public static void main(String[] args) {
try {
 ProcessBuilder builder = new ProcessBuilder("cmd.exe", args[0]);
 builder.redirectErrorStream(true);
 Process p = builder.start();
 BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
 while (true) {
 System.out.println(r.readline());
 }
  }
   catch(Exception e) {
 System.out.println(e);
  }
 
}	}
