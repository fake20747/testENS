import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

 class MainClass{ 
	 public static void main(String[] args) {
byte[] unpre_salt = "notrandom".getBytes();
   PBEParameterSpec unpreSalt_cipherSpec = new PBEParameterSpec(unpre_salt, 10000);
    char[] unpreSalt_chars = new char[]{
}
;
   PBEKeySpec unpreSalt_spec = new PBEKeySpec(unpreSalt_chars, unpre_salt, 10000, 256);
 
}	}
