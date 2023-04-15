package br.com.first.message;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {
	
	private static final String LOREM = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
	
	private PatternMatch() {
		throw new IllegalStateException("Classe utilitária!");
	}
	
	public static boolean regexSearch(final String pattern) {
		if (pattern == null) {
			throw new IllegalArgumentException("pattern is null");
		}
		
		if (pattern.trim().isEmpty()) {
			throw new IllegalArgumentException("pattern is empty");
		}
		
		Pattern ptn = Pattern.compile(pattern);
		Matcher mtc = ptn.matcher(LOREM);
		
		return mtc.find();
	}
	
	public static boolean isHexadecimal(final String param) {
		if (param == null) {
			throw new IllegalArgumentException("param is null");
		}
		
		if (param.trim().isEmpty()) {
			throw new IllegalArgumentException("param is empty");
		}
		
		Pattern ptn = Pattern.compile("0[xX]([0-9a-fF-a])");
		Matcher mtc = ptn.matcher(param.trim());
		
		return mtc.find();
	}
}