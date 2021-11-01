package com.ya.gruppuppg;

import java.util.Scanner;

public class playerTurn {
	
	public static void main(String[] args) {

	// här tar vi in vad spelaren vill göra för drag
		Scanner scan = new Scanner(System.in);
		System.out.println("I vilken ruta vill du sätta ditt kryss? (1-9)");
		int userInput = scan.nextInt();

		System.out.println("Du gjorde ditt val i ruta: " + userInput);
		
		switch (userInput) {
		case 1:  // Ändrar positionen för 0,0 till X
			spelPlan[0][0] = 'X';
			break;
		case 2:  // Ändrar positionen för 0,2 till X
			spelPlan[0][2] = 'X';
			break;
		case 3:  // Ändrar positionen för 0,4 till X
			spelPlan[0][4] = 'X';
			break;
		case 4:  // Ändrar positionen för 2,0 till X
			spelPlan[2][0] = 'X';
			break;
		case 5:  // Ändrar positionen för 2,2 till X
			spelPlan[2][2] = 'X';
			break;
		case 6:  // Ändrar positionen för 2,4 till X
			spelPlan[2][4] = 'X';
			break;
		case 7:  // Ändrar positionen för 4,0 till X
			spelPlan[4][0] = 'X';
			break;
		case 8:  // Ändrar positionen för 4,2 till X
			spelPlan[4][2] = 'X';
			break;
		case 9:  // Ändrar positionen för 4,4 till X
			spelPlan[4][4] = 'X';
			break;
		default:
			break;
		}
		
		
	}
	
	
}
