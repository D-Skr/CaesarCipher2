package view;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import utils.BruteForce;

public class OptionBruteForceAbsolutePath {
	
	static void run(List<Character> alphabet) throws IOException {
		long currentTime = System.currentTimeMillis();
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter the absolute path and name of your text file:");
		String pathEncryptedFile = console.nextLine();
		String pathDecryptedFile = pathEncryptedFile.substring(0, pathEncryptedFile.length() - 4) + "_bruteforced_"
				+ currentTime + ".txt";
		BruteForce.bruteShift(pathEncryptedFile, pathDecryptedFile, alphabet);

		System.out.println("Your result saved in: " + pathDecryptedFile);
		System.out.println("Please select option 1 - 9");
	}
}
