package com.ya.gruppuppg;

import java.util.Scanner;

public class playerTurn {
	
	public static void main(String[] args) {

	// h�r tar vi in vad spelaren vill g�ra f�r drag
		Scanner scan = new Scanner(System.in);
		System.out.println("I vilken ruta vill du s�tta ditt kryss? (1-9)");
		int userInput = scan.nextInt();

		System.out.println("Du gjorde ditt val i ruta: " + userInput);
		
		switch (userInput) {
		case 1:  // �ndrar positionen f�r 0,0 till X
			spelPlan[0][0] = 'X';
			break;
		case 2:  // �ndrar positionen f�r 0,2 till X
			spelPlan[0][2] = 'X';
			break;
		case 3:  // �ndrar positionen f�r 0,4 till X
			spelPlan[0][4] = 'X';
			break;
		case 4:  // �ndrar positionen f�r 2,0 till X
			spelPlan[2][0] = 'X';
			break;
		case 5:  // �ndrar positionen f�r 2,2 till X
			spelPlan[2][2] = 'X';
			break;
		case 6:  // �ndrar positionen f�r 2,4 till X
			spelPlan[2][4] = 'X';
			break;
		case 7:  // �ndrar positionen f�r 4,0 till X
			spelPlan[4][0] = 'X';
			break;
		case 8:  // �ndrar positionen f�r 4,2 till X
			spelPlan[4][2] = 'X';
			break;
		case 9:  // �ndrar positionen f�r 4,4 till X
			spelPlan[4][4] = 'X';
			break;
		default:
			break;
		}
		
		
	}
	
	
}
