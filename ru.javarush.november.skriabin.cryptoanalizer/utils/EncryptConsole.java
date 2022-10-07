package utils;
import java.util.List;

public class EncryptConsole {
	
	public static String encryptTextConsole(String text, int shift, List<Character> alphabet) {
		StringBuilder result = new StringBuilder();
		int len = text.length();
		if(shift >= alphabet.size() || shift < (-1* alphabet.size())) {
			shift = shift % alphabet.size();
		}
		for(int i = 0; i < len; i++) {
			char ch = text.charAt(i);
			if(alphabet.contains(ch)) {
				if(alphabet.indexOf(ch) + shift < 0) {
					ch = alphabet.get((char)alphabet.indexOf(ch) + (alphabet.size() + shift));
				} else if(alphabet.indexOf(ch) + shift < alphabet.size()) {
					ch = alphabet.get((char)(alphabet.indexOf(ch) + shift));
				} else {
					ch = alphabet.get((char)alphabet.indexOf(ch) - (alphabet.size() - shift));
				}
			}
			result.append(ch);
		}
		return result.toString();
	}
}
