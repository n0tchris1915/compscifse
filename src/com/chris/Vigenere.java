package com.chris;

public class Vigenere {
	public String encode(String key, String input) {
		String code = "";
		char[] letters = input.toCharArray();
		int len = key.length();
		int count = 0;
		
		for (int i = 0; i < letters.length; i++) {
			if (count == len) {
				count = 0;
			}

			if (Character.isLetter(input.charAt(i))) {
				letters[i] = key.charAt(count);
				count++;
			} else {
				letters[i] = input.charAt(i);
			}
		}

		for (int i = 0; i < input.length(); i++) {
			if (Character.isLetter(input.charAt(i))) {
				if (Character.isUpperCase(input.charAt(i))) {
					code += (char)(((input.charAt(i) - 65 + letters[i] - 65) % 26) + 65);
				} else {
					code += (char)(((input.charAt(i) - 97 + letters[i] - 97) % 26) + 97);
				}
			} else {
				code += input.charAt(i);
			}

		}

		return code;
	}

	public String decode(String key, String input) {
		String code = "";
		char[] letters = input.toCharArray();
		int len = key.length();
		int count = 0;

		for (int i = 0; i < letters.length; i++) {
			if (count == len) {
				count = 0;
			}

			if (Character.isLetter(input.charAt(i))) {
				letters[i] = key.charAt(count);
				count++;
			} else {
				letters[i] = input.charAt(i);
			}
		}

		for (int i = 0; i < input.length(); i++) {
			if (Character.isLetter(input.charAt(i))) {
				if (Character.isUpperCase(input.charAt(i))) {
					code += (char)((((input.charAt(i) - 65) - (letters[i] - 65) + 26) % 26) + 65);
				} else {
					code += (char)((((input.charAt(i) - 97) - (letters[i] - 97) + 26) % 26) + 97);
					//code += (char)(((input.charAt(i) - 97 + key + 26) % 26) + 97);
				}
			} else {
				code += input.charAt(i);
			}

		}

		return code;
	}
}