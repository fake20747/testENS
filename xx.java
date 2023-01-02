
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;


class MainClass{
	public static void main() throws IOException {
void xfkowms() throws IOException {
         URL url = new URL("https://example.org/");
         HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
         urlConnection.setHostnameVerifier(new HostnameVerifier() {
             @Override             public boolean verify(String requestedHost, SSLSession remoteServerSession) {
                 return true;
             }
         }
);
         InputStream in = urlConnection.getInputStream();
     }
 
}	}
