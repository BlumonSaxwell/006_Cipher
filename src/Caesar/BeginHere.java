package Caesar;

import java.util.Scanner;

public class BeginHere {


	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		
		CaesarCipher myCipher = new CaesarCipher();
		
		System.out.println("Please enter the plain text to encode");
		String plainText = kbd.nextLine();
		
		System.out.println("Please enter the key:");
		int key = kbd.nextInt();
		
		String codedText = myCipher.encode(plainText);
		System.out.println("Your secret message is: " + codedText);
	}

}