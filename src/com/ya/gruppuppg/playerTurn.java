package com.ya.gruppuppg;

import java.util.Scanner;

public class playerTurn {
	
	public static void main(String[] args) {

	// h�r tar vi in vad spelaren vill g�ra f�r drag
		Scanner scan = new Scanner(System.in);
		System.out.println("I vilken ruta vill du s�tta ditt kryss? (1-9)");
		int userInput = scan.nextInt();

		System.out.println("Du gjorde ditt val i ruta: " + userInput);
		
		
	}
	
	
}
