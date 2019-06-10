package com.chris;

public class Vigenere {
	public String encode(int key, String input) {
		String code = "";

		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				code += (char)(((input.charAt(i) - 65 + key) % 26) + 65);
			} else {
				code += (char)(((input.charAt(i) - 97 + key) % 26) + 97);
			}
		}

		return code;
	}
}
