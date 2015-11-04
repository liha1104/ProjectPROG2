
public class Utility {

	public static int bitLength(String bit) {
		if(24 < bit.length()) 
			throw new IllegalArgumentException("Bit is too long");

		return bit.length();
	}
}
