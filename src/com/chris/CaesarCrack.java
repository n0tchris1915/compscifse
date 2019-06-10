package com.chris;

public class CaesarCrack {
	public String crack(String input) {
		Caesar ca = new Caesar();
		WordArr word = new WordArr();

		String decoded;
		for (int i = 1; i < 26; i++) {
			decoded = ca.decode(i, input);
			System.out.println(i + " " + decoded);
			for (int j = 0; j < word.words.length; j++) {
				if (decoded.equals(word.words[j])) {
					return "Key: " + i + "\n" + "Message: " + decoded;
				}
			}
		}
		return "Could not find a match.";
	}
}
