package view;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import utils.BruteForce;

public class OptionBruteForce {

	static void run(List<Character> alphabet) throws IOException {
		long currentTime = System.currentTimeMillis();
		Scanner console = new Scanner(System.in);
		System.out.println("Please copy your file into 'input' folder");
		System.out.println("Please enter the name of your text file:");
		String pathEncryptedFile = "input/" + console.nextLine();
		System.out.println(pathEncryptedFile);
		String pathDecryptedFile = "output/bruteforced" + currentTime + ".txt";
		BruteForce.bruteShift(pathEncryptedFile, pathDecryptedFile, alphabet);

		System.out.println("Your result saved in: " + pathDecryptedFile);
		System.out.println("Please select option 1 - 6");
	}
}