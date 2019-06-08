package com.chris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		WordArr word = new WordArr();
		//System.out.println(word.words.length);

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the key: ");
		String keyS = sc.nextLine();
		int key = Integer.parseInt(keyS);
		System.out.print("Please enter the string you would like to encode: ");
		String str = sc.nextLine();
		String code = "";
		char[] strArr = str.toCharArray();
		for (int i = 0; i < strArr.length; i++) {
			char let = strArr[i];
			if (Character.isUpperCase(let)) {
				if (let + key > 90) {
					let -= key;
				} else {
					let += (key - 65) % 26 + 65;
				}
				code += (char)let;
			} else if (Character.isLowerCase(let)) {
				if (let + key > 122) {
					let += (key - 65) % 26 + 65;
				} else {
					let += (key - 65) % 26 + 65;
				}
				code += (char)let;
			}
		}

		System.out.println(code);
		//System.out.println(str);

	}

}
