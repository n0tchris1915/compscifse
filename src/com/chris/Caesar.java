package com.chris;

public class Caesar {
	public String encode(int key, String input) {
		String code = "";

		for (int i = 0; i < input.length(); i++) {
			if (Character.isLetter(input.charAt(i))) {
				if (Character.isUpperCase(input.charAt(i))) {
					code += (char)(((input.charAt(i) - 65 + key) % 26) + 65);
				} else {
					code += (char)(((input.charAt(i) - 97 + key) % 26) + 97);
				}
			} else {
				code += input.charAt(i);
			}
		}

		return code;
	}

	public String decode(int key, String input) {
		String code = "";

		for (int i = 0; i < input.length(); i++) {
			if (Character.isLetter(input.charAt(i))) {
				if (Character.isUpperCase(input.charAt(i))) {
					code += (char)(((input.charAt(i) - 65 + key + 26) % 26) + 65);
				} else {
					code += (char)(((input.charAt(i) - 97 + key + 26) % 26) + 97);
				}
			} else {
				code += input.charAt(i);
			}
		}
		return code;
	}
}