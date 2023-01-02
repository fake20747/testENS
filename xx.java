import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException; import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import java.io.UnsupportedEncodingException;


class MainClass{
	public static void main() throws UnsupportedEncodingException, InvalidAlgorithmParameterException, InvalidKeyException, NoSuchAlgorithmException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException {
try {
   String cbcIv_str = "keystring";
   byte[] cbcBytesIV = "7cVgr5cbdCZVw5WY".getBytes("UTF-8");
   IvParameterSpec cbcSecure_iv = new IvParameterSpec(cbcBytesIV);
   SecretKeySpec cbcIv_skeySpec = new SecretKeySpec(cbcIv_str.getBytes("UTF-8"), "AES");
   Cipher cbcIv_cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
   cbcIv_cipher.init(Cipher.ENCRYPT_MODE, cbcIv_skeySpec, cbcSecure_iv);
   byte[] cbcIv_encryptedBytes = cbcIv_cipher.doFinal(cbcIv_str.getBytes("UTF-8"));
   }
   catch(UnsupportedEncodingException|NoSuchAlgorithmException|NoSuchPaddingException|InvalidKeyException|InvalidAlgorithmParameterException|IllegalBlockSizeException|BadPaddingException e) {
   }
 
}	}
