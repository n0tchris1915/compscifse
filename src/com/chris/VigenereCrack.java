package com.chris;

public class VigenereCrack {

	public String crack(String input) {
		Dictionary word = new Dictionary();
		char[] letters = input.toCharArray();
		String cracked;

		for (int i = 0; i < word.words.length; i++) {
			String key = word.words[i];
			int len = key.length();
			int count = 0;

			for (int j = 0; j < letters.length; j++) {
				if (count == len) {
					count = 0;
				}

				if (Character.isLetter(input.charAt(j))) {
					letters[j] = key.charAt(count);
					count++;
				} else {
					letters[j] = input.charAt(j);
				}
			}
			String str = new String(letters);
			for (int j = 0; j < word.words.length; j++) {
				if (str.equals(word.words[i])) {
					return word.words[i];
				}
			}

		}
		//String cracked = new String(letters);

		return "That ain't' it chief";
	}
}
