
import java.security.SecureRandom;
import java.io.UnsupportedEncodingException;


class MainClass{
	public static void main() throws UnsupportedEncodingException {
try {
 SecureRandom secRanUnpre = new SecureRandom();
   secRanUnpre.setSeed(123456L);
   int secRan_v = secRanUnpre.nextInt(32);
   secRanUnpre = new SecureRandom("abcdefghijklmnop".getBytes("us-ascii"));
   secRan_v = secRanUnpre.nextInt(32);
   }
   catch(UnsupportedEncodingException e) {
   }
 
}	}
