package view;

import java.util.List;
import java.util.Scanner;

import utils.Alphabets;
import utils.EncryptConsole;

public class OptionEncryptConsole {

	static void run(List<Character> alphabet) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter your text:");
		String text = console.nextLine();
		System.out.println("Please enter shift key:");
		int shift = Integer.parseInt(console.nextLine());
		System.out.println("Your result is:");
		System.out.println(EncryptConsole.encryptTextConsole(text, shift, alphabet));
		System.out.println("Please select option 1 - 6");
	}
}
