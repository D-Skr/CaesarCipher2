package utils;
import java.util.List;

public class EncryptFile {
	
	public static Character encryptChar(Character ch, int shift, List<Character> alphabet) {
		if(shift >= alphabet.size() || shift < (-1* alphabet.size())) {
			shift = shift % alphabet.size();
		}

			char chResult = ' ';
			if(alphabet.contains(ch)) {
				if(alphabet.indexOf(ch) + shift < 0) {
					chResult = alphabet.get((char)alphabet.indexOf(ch) + (alphabet.size() + shift));
				} else if(alphabet.indexOf(ch) + shift < alphabet.size()) {
					chResult = alphabet.get((char)(alphabet.indexOf(ch) + shift));
				} else {
					chResult = alphabet.get((char)alphabet.indexOf(ch) - (alphabet.size() - shift));
				}
			}
		return chResult;
	}
}
