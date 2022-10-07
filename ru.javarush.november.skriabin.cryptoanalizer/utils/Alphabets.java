package utils;

import java.util.Arrays;
import java.util.List;

public class Alphabets {
	
	public static final List<Character> EN = Arrays.asList(
    		// 60 characters as a total
    		'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
    		'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
    		'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 
    		'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 
            'Y', 'Z', '.', ',', '"', ':', '-', '!', '?', ' '
	);
	
	private static final List<Character> RU = Arrays.asList(
			// 71 characters as a total
			'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 
			'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 
			'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 
			'э', 'ю', 'я', 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 
			'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 
			'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 
			'Э', 'Ю', 'Я', '.', ',', '"', ':', '-', '!', '?', 
			' ');
	
	public static List<Character> chooseLanguage(String language){
		if(language.equals("RU")) 
			return RU;
		else 
			return EN;
	}
} 