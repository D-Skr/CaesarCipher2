package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BruteForce {
	public static void bruteShift(String pathEncryptedFile, String pathDecryptedFile, List<Character> alphabet)
			throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader(pathEncryptedFile))) {
			BufferedWriter writer = Files.newBufferedWriter(Paths.get(pathDecryptedFile));
			StringBuilder sb = new StringBuilder();
			List<String> list = new ArrayList<>();
			while (reader.ready()) {

				String string = reader.readLine();
				System.out.println(string);
				sb.append(string);
				list.add(string);
			}

			int textNumber = 1;
			for (int i = 0; i < alphabet.size(); i++) {
				String decryptedText = DecryptConsole.decryptTextConsole(sb.toString(), i, alphabet);
				if (isValid(decryptedText)) {
					for (String string : list) {
						String decrypted = DecryptConsole.decryptTextConsole(string, i, alphabet);
						writer.write("~~~~~~~~~~~~~ #" + textNumber + " decrypted text with shift " + i + " ~~~~~~~~~~~~~");
						writer.newLine();
						writer.write(decrypted + System.lineSeparator());
						textNumber++;
					}
					System.out.println("Found shift: " + i);
				}
			}
			writer.close();
		}

	}

	public static boolean isValid(String text) {
		boolean isValid = false;

		int start = new Random().nextInt(text.length() / 2);
		String subString = text.substring(start, start + (int) Math.sqrt(text.length()));

		String[] words = subString.split(" ");
		for (String word : words) {
			if (word.length() > 25)
				return false;
		}
		if (subString.contains(". ") 
				|| subString.contains(", ") 
				|| subString.contains("! ")
				|| subString.contains("? ")
				|| subString.contains(": ")) {
			isValid = true;
		}
		return isValid;
	}
}
