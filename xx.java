
import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.NullCipher;


class MainClass{
	public static void main() throws NoSuchAlgorithmException, NoSuchPaddingException {
try  {
   Cipher robustCipher1 = Cipher.getInstance("DES");
   Cipher robustCipher7 = Cipher.getInstance("DESede");
   Cipher robustCipher13 = Cipher.getInstance("RC2");
   Cipher robustCipher19 = Cipher.getInstance("RC4");
   Cipher robustCipher25 = Cipher.getInstance("Blowfish");
   NullCipher ncRobust = new NullCipher();
   }
      catch(NoSuchAlgorithmException|NoSuchPaddingException e){
   }
 
}	}
