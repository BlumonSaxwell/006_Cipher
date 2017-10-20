package Caesar;

public class CaesarCipher {
	
	private String alpha = "abcdefghijklmnopqrstuvwxyz";

	public String encode(String plainText, int key) {
		
		String secretText = "";
		int index;
		String keyAdded = "";
		
		System.out.println("test, alpha length = " + alpha.length());
		System.out.println("Test, First char is: " + alpha.charAt(0));
		System.out.println("Test, last char is: " + alpha.charAt(alpha.length()-1));
		
		for (int i = 0; i < alpha.length()-1; i++) {
			System.out.println(alpha.charAt(i));
		}
		
		System.out.println("/n/n");
		
		for (int i=0; i < plainText.length() ; i++)
			System.out.println(plainText.charAt(i));
		/*
		 * each har that i read from plainText i find the index in slpha
		 * for example, read A look up index fo A get 0
		 * read M look up index for M get 12
		 * then, add key to that index, so A index 0 becomes 0+key
		 * 
		 */
		for (int i=0; i<plainText.length();i++) {
			
			alpha.indexOf(plainText.charAt(i));
			System.out.println("index = " + index);
			
			keyAdded = index + key;
			
			System.out.println("encoded is " + alpha.charAt(keyAdded));
		}
		
		return secretText;
	}
		
}
