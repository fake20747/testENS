import javax.crypto.KeyGenerator;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECGenParameterSpec;


class MainClass{
	public static void main() throws InvalidAlgorithmParameterException, NoSuchAlgorithmException {
try {
   KeyPairGenerator robustKeyPairGen1 = KeyPairGenerator.getInstance("RSA");
   robustKeyPairGen1.initialize(1024);
   KeyPairGenerator robustKeyPairGen5 = KeyPairGenerator.getInstance("EC");
   ECGenParameterSpec ecSpec1_robust = new ECGenParameterSpec("secp112r1");
   robustKeyPairGen5.initialize(ecSpec1_robust);
   KeyGenerator robustKeyGen1 = KeyGenerator.getInstance("AES");
   robustKeyGen1.init(64);
   }
   catch(NoSuchAlgorithmException|InvalidAlgorithmParameterException e) {
   }
 
}	}
