package com.Soap.Encryption;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static String getInput(String string) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(string);
		return scanner.nextLine();
	}


	public static void main(String[] args) throws IOException {
		String initString = getInput("What is the String that you would like to encode");
		System.out.print(Encrypt.encrypt(initString));

	}

}
