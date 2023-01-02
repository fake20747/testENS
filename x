
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;


class MainClass{
	public static void main() throws NoSuchAlgorithmException, NoSuchPaddingException {
try {
 Cipher padScheCip1 = Cipher.getInstance("AES");
   Cipher padScheCip2 = Cipher.getInstance("AES/ECB/NoPadding");
   Cipher padScheCip3 = Cipher.getInstance("RSA/None/NoPadding");
   }
   catch(NoSuchAlgorithmException|NoSuchPaddingException e) {
   }
 
}	}
