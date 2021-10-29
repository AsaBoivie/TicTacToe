package com.ya.gruppuppg;

import java.util.Scanner;

public class playerTurn {
	
	public static void main(String[] args) {

	// här tar vi in vad spelaren vill göra för drag
		Scanner scan = new Scanner(System.in);
		System.out.println("I vilken ruta vill du sätta ditt kryss? (1-9)");
		int userInput = scan.nextInt();

		System.out.println("Du gjorde ditt val i ruta: " + userInput);
		
		
	}
	
	
}
