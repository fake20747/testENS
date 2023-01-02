import java.io.*;


class MainClass{
	public static void main()  {
String encoding = Base64Encoder.encode ("login:passwd");
 org.apach.http.client.methods.HttpPost httppost = new HttpPost(url);
 httppost.setHeader("Authorization", "Basic" + encoding);
 
}	}
