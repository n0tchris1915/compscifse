package com.chris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		WordArr word = new WordArr();
		Caesar ca = new Caesar();
		//System.out.println(word.words.length);

		Scanner sc = new Scanner(System.in);
		/*System.out.print("Please enter the key: ");
		String keyS = sc.nextLine();
		int key = Integer.parseInt(keyS);
		System.out.print("Please enter the string you would like to encode: ");
		String str = sc.nextLine();*/

		String st = "hello";
		int key = 2;
		System.out.println(ca.encode(key, st));




	}

}
