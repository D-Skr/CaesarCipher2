package utils;

import java.util.List;

public class DecryptFile {
	
	public static Character decryptChar(Character ch, int shift, List<Character> alphabet) {
		return EncryptFile.encryptChar(ch, shift*(-1), alphabet);
	}
}
