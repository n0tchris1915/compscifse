package com.chris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CaesarCrack caesarCrack = new CaesarCrack();
		Caesar ca = new Caesar();
		Vigenere va = new Vigenere();
		//System.out.println(word.words.length);

		Scanner sc = new Scanner(System.in);
		/*System.out.print("Please enter the key: ");
		String keyS = sc.nextLine();
		int key = Integer.parseInt(keyS);
		System.out.print("Please enter the string you would like to encode: ");
		String str = sc.nextLine();*/

		//String str = "accept";
		//String input = "This is a sentence.";
		//int key = 13;
		//String encoded = ca.encode(key, input);
		String word = va.encode("revolution", "viva la revolution");
		System.out.println(word);
		System.out.println(va.decode("revolution", word));
		//System.out.println(encoded);
		//System.out.println(ca.decode(key, encoded));


		//String cracked = caesarCrack.crack(input);
		//System.out.println(cracked);

	}

}