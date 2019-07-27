//this method is used to hash the data
package src;
import java.security.MessageDigest;
public class HashHelper {
	public static String applySha256(String input) {
		try {
			MessageDigest messageDigest=MessageDigest.getInstance("SHA-256");
			//now apply SHA-256 to the input
			byte[] hash=messageDigest.digest(input.getBytes("UTF-8"));
			StringBuffer hexString=new StringBuffer(); //this will store the hash of the String
			for (int i = 0; i < hash.length; i++) {
				String hex=Integer.toHexString(0xff & hash[i]);
				if(hex.length()==1) hexString.append(0);
				hexString.append(hex);
			}
			return hexString.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
