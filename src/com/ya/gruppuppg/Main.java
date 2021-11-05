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
		
		char[][] spelPlan = { {'1', '|', '2', '|', '3'}, 
							  {'-', '+', '-', '+', '-'},
							  {'4', '|', '5', '|', '6'},
							  {'-', '+', '-', '+', '-'},
							  {'7', '|', '8', '|', '9'}};
		
		// Skriva ut spelplanen mha 2st for-loopar
		/*
		for(char[] rad : spelPlan)	{
			for(char i : rad)	{
				System.out.print(i);
			}
			System.out.println();
		} // slut pÃ¥ for
		*/
		
		// Provar att visa spelplanen med 'X' och 'O'.
		/*
		System.out.println();
		
		spelPlan[0][0] = 'X';
		spelPlan[0][2] = 'X';
		spelPlan[0][4] = 'X';
		spelPlan[2][0] = 'O';
		spelPlan[2][2] = 'X';
		spelPlan[2][4] = 'O';
		spelPlan[4][0] = 'O';
		spelPlan[4][2] = 'O';
		spelPlan[4][4] = 'O';
		
		for(char[] rad : spelPlan)	{
			System.out.print("   ");
			for(char i : rad)	{
				System.out.print(i);
			}
			System.out.println();
		}
		*/	
		
		turn = 1;  // Det Ã¤r inte mÃ¶jligt mer Ã¤n 5 turer fÃ¶r spelaren pÃ¥ TicTacToe
		playerWins = false;
		machineWins = false;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
			
		/*
		System.out.println();
		char number = 49; // Number 49 is equal to '1' in ASCII code

		for (int i = 0; i <= 4; i = i + 2) {
			for (int j = 0; j <= 4; j = j + 2) {
				spelPlan[i][j] = number;
				number++;
			}
		}
		*/
		
		while((turn <= 5) && (playerWins == false) && (machineWins == false)) {
					
			// 1- Show gameboard			
			// Visa spelplanen med numner fÃ¶r att spelare ska kunna vÃ¤lja.
			
			System.out.println();
			
			for (char[] rad : spelPlan) {
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
			
				//Scanner scan = new Scanner(System.in);
				System.out.println("I vilken ruta vill du sätta ditt kryss? (1-9)");
				userInput = scan.nextInt();

				System.out.println("Du gjorde ditt val i ruta: " + userInput);
				
				
				switch (userInput) {
					case 1:
						if (spelPlan[0][0] == '1') {
							spelPlan[0][0] = 'X';
							taken = true; }
						break;
					case 2:
						if (spelPlan[0][2] == '2') {
							spelPlan[0][2] = 'X';
							taken = true; }
						break;
					case 3:
						if (spelPlan[0][4] == '3') {
							spelPlan[0][4] = 'X';
							taken = true; }
						break;
					case 4:
						if (spelPlan[2][0] == '4') {
							spelPlan[2][0] = 'X';
							taken = true; }
						break;
					case 5:
						if (spelPlan[2][2] == '5') {
							spelPlan[2][2] = 'X';
							taken = true; }
						break;
					case 6:
						if (spelPlan[2][4] == '6') {
							spelPlan[2][4] = 'X';
							taken = true; }
						break;
					case 7:
						if (spelPlan[4][0] == '7') {
							spelPlan[4][0] = 'X';
							taken = true; }
						break;
					case 8:
						if (spelPlan[4][2] == '8') {
							spelPlan[4][2] = 'X';
							taken = true; }
						break;
					case 9:
						if (spelPlan[4][4] == '9') {
							spelPlan[4][4] = 'X';
							taken = true; }
						break;
					default:
						//System.out.println("Platsen upptagen, gör ett nytt försök");
						break;
				}// slut på switch
				
				if(taken == false) {
					System.out.println("Platsen upptagen, gör ett nytt försök");
				}
			}// slut på while
			
			
			
				
			// 3- Check if player have won
					
			// fÃ¶rsta raden
			if ((spelPlan[0][0] == 'X' && spelPlan[0][2] == 'X' && spelPlan[0][4] == 'X') ||
					// andra raden
					(spelPlan[2][0] == 'X' && spelPlan[2][2] == 'X' && spelPlan[2][4] == 'X') ||
					// tredje raden
					(spelPlan[4][0] == 'X' && spelPlan[4][2] == 'X' && spelPlan[4][4] == 'X') ||

					// villkor fÃ¶r fÃ¶rsta kolumnen
					(spelPlan[0][0] == 'X' && spelPlan[2][0] == 'X' && spelPlan[4][0] == 'X') ||
					// andra kolumnen
					(spelPlan[0][2] == 'X' && spelPlan[2][2] == 'X' && spelPlan[4][2] == 'X') ||
					// tredje kolumnen
					(spelPlan[0][4] == 'X' && spelPlan[2][4] == 'X' && spelPlan[4][4] == 'X') ||

					// villkor fÃ¶r fÃ¶rsta diagonalen
					(spelPlan[0][0] == 'X' && spelPlan[2][2] == 'X' && spelPlan[4][4] == 'X') ||
					// andra diagonalen
					(spelPlan[0][4] == 'X' && spelPlan[2][2] == 'X' && spelPlan[4][0] == 'X'))

			{
				playerWins = true;
				// Om villkoren ovan uppfylls skrivs detta ut:
				//System.out.println("Spelare X har vunnit tre i rad!");
			//} else {
				// Annars skrivs detta ut:
				//System.out.println("Spelare X har fÃ¶rlorat");
			}
					
			
			if((playerWins == false) && (turn <= 4)) {
				
				// 4- Machine turn
				
				//Slumpmässigt drag
				
				// Prova valideling
				
				takenCell = true;
				machineTurn = 0;
				
				while( takenCell == true ) {
					
					//Random rand = new Random();
					machineTurn = rand.nextInt(9) + 1;
					
					switch(machineTurn) {
					
					case 1:
						if(spelPlan[0][0] == '1') {
							takenCell = false;
						}
						break;
					case 2:
						if(spelPlan[0][2] == '2') {
							takenCell = false;
						}
						break;
					case 3:
						if(spelPlan[0][4] == '3') {
							takenCell = false;
						}
						break;
					case 4:
						if(spelPlan[2][0] == '4') {
							takenCell = false;
						}
						break;
					case 5:
						if(spelPlan[2][2] == '5') {
							takenCell = false;
						}
						break;
					case 6:
						if(spelPlan[2][4] == '6') {
							takenCell = false;
						}
						break;
					case 7:
						if(spelPlan[4][0] == '7') {
							takenCell = false;
						}
						break;
					case 8:
						if(spelPlan[4][2] == '8') {
							takenCell = false;
						}
						break;
					case 9:
						if(spelPlan[4][4] == '9') {
							takenCell = false;
						}
						break;
					}					
				}
					
				switch (machineTurn) {
					case 1:  // Ändrar positionen för 0,0 till O vid rand 1
						spelPlan[0][0] = 'O';
						break;
					case 2:  // Ändrar positionen för 0,2 till O vid rand 2
						spelPlan[0][2] = 'O';
						break;
					case 3:  // Ändrar positionen för 0,4 till O vid rand 3
						spelPlan[0][4] = 'O';
						break;
					case 4:  // Ändrar positionen för 2,0 till O vid rand 4
						spelPlan[2][0] = 'O';
						break;
					case 5:  // Ändrar positionen för 2,2 till O vid rand 5
						spelPlan[2][2] = 'O';
						break;
					case 6:  // Ändrar positionen för 2,4 till O vid rand 6
						spelPlan[2][4] = 'O';
						break;
					case 7:  // Ändrar positionen för 4,0 till O vid rand 7
						spelPlan[4][0] = 'O';
						break;
					case 8:  // Ändrar positionen för 4,2 till O vid rand 8
						spelPlan[4][2] = 'O';
						break;
					case 9:  // Ändrar positionen för 4,4 till O vid rand 9
						spelPlan[4][4] = 'O';
						break;
					default:
						break;
				}
				
				
				System.out.println("Datorn valde ruta: " + machineTurn);

										
				// 5- Check if machine have won
				// första raden tre i rad
				if ((spelPlan[0][0] == 'O' && spelPlan[0][2] == 'O' && spelPlan[0][4] == 'O') ||
						// andra raden tre i rad
						(spelPlan[2][0] == 'O' && spelPlan[2][2] == 'O' && spelPlan[2][4] == 'O') ||
						// tredje raden tre i rad
						(spelPlan[4][0] == 'O' && spelPlan[4][2] == 'O' && spelPlan[4][4] == 'O') ||
	
						// första kolumnen tre i rad
						(spelPlan[0][0] == 'O' && spelPlan[2][0] == 'O' && spelPlan[4][0] == 'O') ||
						// andra kolumnen tre i rad
						(spelPlan[0][2] == 'O' && spelPlan[2][2] == 'O' && spelPlan[4][2] == 'O') ||
						// tredje kolumnen tre i rad
						(spelPlan[0][4] == 'O' && spelPlan[2][4] == 'O' && spelPlan[4][4] == 'O') ||
	
						// diagonal uppifrån ned tre i rad
						(spelPlan[0][0] == 'O' && spelPlan[2][2] == 'O' && spelPlan[4][4] == 'O') ||
						// diagonal nedifrån upp tre i rad
						(spelPlan[0][4] == 'O' && spelPlan[2][2] == 'O' && spelPlan[4][0] == 'O'))
	
				{
					// Om villkoren ovan uppfylls skrivs detta ut:
					machineWins = true;
					//System.out.println("Tyvärr, datorn vann!");
				} 			
			}				
		turn++;	 // NÃ¤sta tur		
		}
		
		// 6- Show winner message
		System.out.println();
		for (char[] rad : spelPlan) {
			System.out.print("   ");
			for (char i : rad) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		if(playerWins == true) {
			System.out.println("You win!! Congratulations!");
		}else if(machineWins) {
			System.out.println("The machine wins. You lose!");
		}else {
			System.out.println("Draw. Nobody won.");
		}
			 
	}

}

