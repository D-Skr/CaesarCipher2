package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import utils.DecryptConsole;

public class OptionDecryptFile {

	static void run(List<Character> alphabet) throws IOException {
		long currentTime = System.currentTimeMillis();
		Scanner console = new Scanner(System.in);
		System.out.println("Please copy your file into 'input' folder");
		System.out.println("Please enter the name of your text file:");
		String pathNotEncryptedFile = "input/" + console.nextLine();
		System.out.println(pathNotEncryptedFile);
		String pathEncryptedFile = "output/decrypted" + currentTime + ".txt";
		System.out.println("Please enter shift key:");
		int shift = Integer.parseInt(console.nextLine());
		System.out.println("Your result saved in: " + pathEncryptedFile);
		try (BufferedReader reader = new BufferedReader(new FileReader(pathNotEncryptedFile))) {
			BufferedWriter writer = Files.newBufferedWriter(Paths.get(pathEncryptedFile));
			while (reader.ready()) {
				String string = reader.readLine();
				String decryptedString = DecryptConsole.decryptTextConsole(string, shift, alphabet);
				writer.write(decryptedString);
			}
			writer.close();
		}
		System.out.println("Please select option 1 - 9");
	}
}