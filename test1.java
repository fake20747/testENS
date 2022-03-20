import javax.crypto.KeyGenerator;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECGenParameterSpec;

class MainClass{ 
	public static void method() throws InvalidAlgorithmParameterException, NoSuchAlgorithmException {

	for(int aa = 0; aa < 3; aa++) {
		try {
	KeyPairGenerator bdrcgvylok = KeyPairGenerator.getInstance("RSA");
	bdrcgvylok.initialize(1024);
	KeyPairGenerator ztuhdkwyas = KeyPairGenerator.getInstance("EC");
	ECGenParameterSpec ndtpuobmax = new ECGenParameterSpec("secp112r1");
	ztuhdkwyas.initialize(ndtpuobmax);
	KeyGenerator aljwrqgfey = KeyGenerator.getInstance("AES");
	aljwrqgfey.init(64);
	}
	catch(NoSuchAlgorithmException|InvalidAlgorithmParameterException e) {
	}
	}}}
