package com.ya.gruppuppg;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//Declare variables
		
		int turn;
		boolean noPlayerWin;
		boolean noMachineWin;
		
		
		// Skriv ut spelplan
		// rad och kolumn, 2D array
		
		// 1 | 2 | 3		[0][0]	[0][2]	[0][4]
		// - + - + -
		// 4 | 5 | 6		[2][0]	[2][2]	[2][4]
		// - + - + -
		// 7 | 8 | 9		[4][0]	[4][2]	[4][4]
		
		char[][] spelPlan = {{' ', '|', ' ', '|', ' '}, 
							  {'-', '+', '-', '+', '-'},
							  {' ', '|', ' ', '|', ' '},
							  {'-', '+', '-', '+', '-'},
							  {' ', '|', ' ', '|', ' '}};
		
		// Skriva ut spelplanen mha 2st for-loopar
		for(char[] rad : spelPlan)	{
			for(char i : rad)	{
				System.out.print(i);
			}
			System.out.println();
		} // slut pÃ¥ for
		
		// Provar att visa spelplanen med 'X' och 'O'.
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
		
		
		
		
		turn = 1;  // Det Ã¤r inte mÃ¶jligt mer Ã¤n 5 turer fÃ¶r spelaren pÃ¥ TicTacToe
		noPlayerWin = true;
		noMachineWin = true;
		
		System.out.println();

		char number = 49; // Number 49 is equal to '1' in ASCII code

		for (int i = 0; i <= 4; i = i + 2) {
			for (int j = 0; j <= 4; j = j + 2) {
				spelPlan[i][j] = number;
				number++;
			}
		}
		
		
		while((turn <= 5) && (noPlayerWin == true) && (noMachineWin == true)) {
					
			// 1- Show gameboard			
			// Visa spelplanen med numner fÃ¶r att spelare ska kunna vÃ¤lja.
			
			for (char[] rad : spelPlan) {
				System.out.print("   ");
				for (char i : rad) {
					System.out.print(i);
				}
				System.out.println();
			}
			
			
			
			
			
			
			// 2- Player turn
			
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
				noPlayerWin = false;
				// Om villkoren ovan uppfylls skrivs detta ut:
				//System.out.println("Spelare X har vunnit tre i rad!");
			} else {
				// Annars skrivs detta ut:
				//System.out.println("Spelare X har fÃ¶rlorat");
			}
			
			
			
			
			
			
			
			
			
			if(noPlayerWin) {
				
				// 4- Machine turn
				
				//Slumpmässigt drag
				Random rand = new Random();
				int machineTurn = rand.nextInt(9) + 1;
					
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
				noMachineWin = false;
				//System.out.println("Tyvärr, datorn vann!");
			} 
				
				
				
				
				
			}			
		
		turn++;	 // NÃ¤sta tur
			
		}
		
		// 6- Show winner message
		
		if(noPlayerWin == false) {
			System.out.println("Spelaren har vunnit");
		}
		
		
		if(noMachineWin == false) {
			System.out.println("Maskinen har vunnit");
		}
		
		
		
				
	 
	}

}

