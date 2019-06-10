package com.chris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CaesarCrack caesarCrack = new CaesarCrack();
		VigenereCrack vigenereCrack = new VigenereCrack();
		Caesar ca = new Caesar();
		Vigenere va = new Vigenere();
		//System.out.println(word.words.length);

		Scanner sc = new Scanner(System.in);
		/*System.out.print("Please enter the key: ");
		String keyS = sc.nextLine();
		int key = Integer.parseInt(keyS);
		System.out.print("Please enter the string you would like to encode: ");
		String str = sc.nextLine();*/


		System.out.println(vigenereCrack.crack("rfjfechv"));

		//String cracked = caesarCrack.crack(input);
		//System.out.println(cracked);

	}

}