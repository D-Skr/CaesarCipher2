package utils;

import java.util.List;

public class DecryptConsole {
	
	public static String decryptTextConsole(String text, int shift, List<Character> alphabet) {
		return EncryptConsole.encryptTextConsole(text, shift*(-1), alphabet);
	}
}
