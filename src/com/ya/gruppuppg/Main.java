package com.ya.gruppuppg;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//Declare variables
		
		int turn;
		boolean playerWins;
		boolean machineWins;
		boolean takenCell;
		boolean taken;
		int machineTurn;
		int userInput;
			
		// Skriv ut spelplan
		// rad och kolumn, 2D array
		
		// 1 | 2 | 3		[0][0]	[0][2]	[0][4]
		// - + - + -
		// 4 | 5 | 6		[2][0]	[2][2]	[2][4]
		// - + - + -
		// 7 | 8 | 9		[4][0]	[4][2]	[4][4]
		
		char[][] gameBoard = { {'1', '|', '2', '|', '3'}, 
							  {'-', '+', '-', '+', '-'},
							  {'4', '|', '5', '|', '6'},
							  {'-', '+', '-', '+', '-'},
							  {'7', '|', '8', '|', '9'}};
		
		
		turn = 1;  // Det Ã¤r inte mÃ¶jligt mer Ã¤n 5 turer fÃ¶r spelaren pÃ¥ TicTacToe
		playerWins = false;
		machineWins = false;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
			
		
		while((turn <= 5) && (playerWins == false) && (machineWins == false)) {
					
			// 1- Show gameboard			
			// Visa spelplanen med numner fÃ¶r att spelare ska kunna vÃ¤lja.
			
			System.out.println();
			
			for (char[] rad : gameBoard) {
				System.out.print("   ");
				for (char i : rad) {
					System.out.print(i);
				}
				System.out.println();
			}		
			System.out.println();
			
			
			// 2- Player turn			
			// här tar vi in vad spelaren vill göra för drag
			
			taken = false;
			while (taken == false) {
			
				System.out.println("I vilken ruta vill du sätta ditt kryss? (1-9)");
				userInput = scan.nextInt();

				System.out.println("Du gjorde ditt val i ruta: " + userInput);
				
				
				switch (userInput) {
					case 1:
						if (gameBoard[0][0] == '1') {
							gameBoard[0][0] = 'X';
							taken = true; }
						break;
					case 2:
						if (gameBoard[0][2] == '2') {
							gameBoard[0][2] = 'X';
							taken = true; }
						break;
					case 3:
						if (gameBoard[0][4] == '3') {
							gameBoard[0][4] = 'X';
							taken = true; }
						break;
					case 4:
						if (gameBoard[2][0] == '4') {
							gameBoard[2][0] = 'X';
							taken = true; }
						break;
					case 5:
						if (gameBoard[2][2] == '5') {
							gameBoard[2][2] = 'X';
							taken = true; }
						break;
					case 6:
						if (gameBoard[2][4] == '6') {
							gameBoard[2][4] = 'X';
							taken = true; }
						break;
					case 7:
						if (gameBoard[4][0] == '7') {
							gameBoard[4][0] = 'X';
							taken = true; }
						break;
					case 8:
						if (gameBoard[4][2] == '8') {
							gameBoard[4][2] = 'X';
							taken = true; }
						break;
					case 9:
						if (gameBoard[4][4] == '9') {
							gameBoard[4][4] = 'X';
							taken = true; }
						break;
					default:
						break;
				}// slut på switch
				
				if(taken == false) {
					System.out.println("Platsen upptagen, gör ett nytt försök");
				}
			}// slut på while
						
				
			// 3- Check if player have won
					
			// fÃ¶rsta raden
			if ((gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X') ||
					// andra raden
					(gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X') ||
					// tredje raden
					(gameBoard[4][0] == 'X' && gameBoard[4][2] == 'X' && gameBoard[4][4] == 'X') ||

					// villkor fÃ¶r fÃ¶rsta kolumnen
					(gameBoard[0][0] == 'X' && gameBoard[2][0] == 'X' && gameBoard[4][0] == 'X') ||
					// andra kolumnen
					(gameBoard[0][2] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][2] == 'X') ||
					// tredje kolumnen
					(gameBoard[0][4] == 'X' && gameBoard[2][4] == 'X' && gameBoard[4][4] == 'X') ||

					// villkor fÃ¶r fÃ¶rsta diagonalen
					(gameBoard[0][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][4] == 'X') ||
					// andra diagonalen
					(gameBoard[0][4] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][0] == 'X'))
			{
				playerWins = true;
			}
					
			
			if((playerWins == false) && (turn <= 4)) {
				
				// 4- Machine turn
				//Slumpmässigt drag
							
				takenCell = true;
				machineTurn = 0;
				
				while( takenCell == true ) {
					
					machineTurn = rand.nextInt(9) + 1;
					
					switch(machineTurn) {
					
						case 1:
							if(gameBoard[0][0] == '1') {
								takenCell = false;
							}
							break;
						case 2:
							if(gameBoard[0][2] == '2') {
								takenCell = false;
							}
							break;
						case 3:
							if(gameBoard[0][4] == '3') {
								takenCell = false;
							}
							break;
						case 4:
							if(gameBoard[2][0] == '4') {
								takenCell = false;
							}
							break;
						case 5:
							if(gameBoard[2][2] == '5') {
								takenCell = false;
							}
							break;
						case 6:
							if(gameBoard[2][4] == '6') {
								takenCell = false;
							}
							break;
						case 7:
							if(gameBoard[4][0] == '7') {
								takenCell = false;
							}
							break;
						case 8:
							if(gameBoard[4][2] == '8') {
								takenCell = false;
							}
							break;
						case 9:
							if(gameBoard[4][4] == '9') {
								takenCell = false;
							}
							break;
					}					
				}
					
				switch (machineTurn) {
					case 1:  // Ändrar positionen för 0,0 till O vid rand 1
						gameBoard[0][0] = 'O';
						break;
					case 2:  // Ändrar positionen för 0,2 till O vid rand 2
						gameBoard[0][2] = 'O';
						break;
					case 3:  // Ändrar positionen för 0,4 till O vid rand 3
						gameBoard[0][4] = 'O';
						break;
					case 4:  // Ändrar positionen för 2,0 till O vid rand 4
						gameBoard[2][0] = 'O';
						break;
					case 5:  // Ändrar positionen för 2,2 till O vid rand 5
						gameBoard[2][2] = 'O';
						break;
					case 6:  // Ändrar positionen för 2,4 till O vid rand 6
						gameBoard[2][4] = 'O';
						break;
					case 7:  // Ändrar positionen för 4,0 till O vid rand 7
						gameBoard[4][0] = 'O';
						break;
					case 8:  // Ändrar positionen för 4,2 till O vid rand 8
						gameBoard[4][2] = 'O';
						break;
					case 9:  // Ändrar positionen för 4,4 till O vid rand 9
						gameBoard[4][4] = 'O';
						break;
					default:
						break;
				}
							
				System.out.println("Datorn valde ruta: " + machineTurn);

										
				// 5- Check if machine have won
				// första raden tre i rad
				
				if ((gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O') ||
						// andra raden tre i rad
						(gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O') ||
						// tredje raden tre i rad
						(gameBoard[4][0] == 'O' && gameBoard[4][2] == 'O' && gameBoard[4][4] == 'O') ||
	
						// första kolumnen tre i rad
						(gameBoard[0][0] == 'O' && gameBoard[2][0] == 'O' && gameBoard[4][0] == 'O') ||
						// andra kolumnen tre i rad
						(gameBoard[0][2] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][2] == 'O') ||
						// tredje kolumnen tre i rad
						(gameBoard[0][4] == 'O' && gameBoard[2][4] == 'O' && gameBoard[4][4] == 'O') ||
	
						// diagonal uppifrån ned tre i rad
						(gameBoard[0][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][4] == 'O') ||
						// diagonal nedifrån upp tre i rad
						(gameBoard[0][4] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][0] == 'O'))
				{
					// Om villkoren ovan uppfylls gör detta:
					machineWins = true;
				} 			
			} // slut på if
			
		turn++;	 // NÃ¤sta tur		
		} // slut på while
		
		
		// 6- Show winner message
		
		System.out.println();
		for (char[] rad : gameBoard) {
			System.out.print("   ");
			for (char i : rad) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		
		if(playerWins == true) {
			System.out.println("Grattis!! Du vann!");
		}else if(machineWins == true) {
			System.out.println("Tyvärr, datorn vann.");
		}else {
			System.out.println("Oavgjort.");
		}			 
	}
	
}



