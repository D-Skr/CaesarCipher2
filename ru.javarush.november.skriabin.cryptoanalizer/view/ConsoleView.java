package view;

import java.io.IOException;
import java.util.Scanner;

import utils.Alphabets;

public class ConsoleView {

	public static void main(String[] args) throws IOException {
		String language = null;
		System.out.println("Welcome to Caesar Cipher App!");
		while (true) {
			Scanner console = new Scanner(System.in);
			System.out.println("Choose text language: EN or RU");
			language = console.nextLine();
			if (language.equals("RU") || language.equals("EN")) {
				System.out.println("Please choose your option:");
				System.out.println("1. Encrypt text from console");
				System.out.println("2. Encrypt file");
				System.out.println("3. Decrypt from console");
				System.out.println("4. Decrypt file");
				System.out.println("5. Brute force file");
				System.out.println("If you know absolute path please choose option:");
				System.out.println("6. Encrypt file");
				System.out.println("7. Decrypt file");
				System.out.println("8. Brute force file");
				System.out.println("9. EXIT");
				String option = console.nextLine();

				switch (option) {
				case ("1"):
					System.out.println("Console input encryption option selected");
					OptionEncryptConsole.run(Alphabets.chooseLanguage(language));
					break;

				case ("2"):
					System.out.println("File encryption option selected");
					OptionEncryptFile.run(Alphabets.chooseLanguage(language));
					break;

				case ("3"):
					System.out.println("Console input decryption option selected");
					OptionDecryptConsole.run(Alphabets.chooseLanguage(language));
					break;

				case ("4"):
					System.out.println("File decryption option selected");
					OptionDecryptFile.run(Alphabets.chooseLanguage(language));
					break;

				case ("5"):
					System.out.println("File Brute Force option selected");
					OptionBruteForce.run(Alphabets.chooseLanguage(language));
					break;

				case ("6"):
					System.out.println("File encryption option selected");
					OptionEncryptFileAbsolutePath.run(Alphabets.chooseLanguage(language));
					break;

				case ("7"):
					System.out.println("File decryption option selected");
					OptionDecryptFileAbsolutePath.run(Alphabets.chooseLanguage(language));
					break;
					
				case ("8"):
					System.out.println("File Brute Force option selected");
					OptionBruteForceAbsolutePath.run(Alphabets.chooseLanguage(language));
					break;

				case ("9"):
					System.out.println("See you!");
					console.close();
					return;

				default:
					System.out.println("Invalid option, please enter number 1 - 9 only");
					break;
				}
			} else {
				System.out.println("Invalid value, try again");

			}
		}
	}
}
