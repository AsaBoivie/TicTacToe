package com.ya.gruppuppg;

import java.util.Scanner;

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
		} // slut på for
		
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
		
		
		
		
		turn = 1;  // Det är inte möjligt mer än 5 turer för spelaren på TicTacToe
		noPlayerWin = true;
		noMachineWin = true;
		
		while((turn <= 5) && noPlayerWin && noMachineWin) {
					
			// 1- Show gameboard			
			// Visa spelplanen med numner för att spelare ska kunna välja.
			System.out.println();

			char number = 49; // Number 49 is equal to '1' in ASCII code

			for (int i = 0; i <= 4; i = i + 2) {
				for (int j = 0; j <= 4; j = j + 2) {
					spelPlan[i][j] = number;
					number++;
				}
			}
			for (char[] rad : spelPlan) {
				System.out.print("   ");
				for (char i : rad) {
					System.out.print(i);
				}
				System.out.println();
			}
			
			
			
			
			
			
			// 2- Player turn
			
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
			
			

			
			
			
			
			
			// 3- Check if player have won
			
			
			// första raden
			if ((spelPlan[0][0] == 'X' && spelPlan[0][2] == 'X' && spelPlan[0][4] == 'X') ||
					// andra raden
					(spelPlan[2][0] == 'X' && spelPlan[2][2] == 'X' && spelPlan[2][4] == 'X') ||
					// tredje raden
					(spelPlan[4][0] == 'X' && spelPlan[4][2] == 'X' && spelPlan[4][4] == 'X') ||

					// villkor för första kolumnen
					(spelPlan[0][0] == 'X' && spelPlan[2][0] == 'X' && spelPlan[4][0] == 'X') ||
					// andra kolumnen
					(spelPlan[0][2] == 'X' && spelPlan[2][2] == 'X' && spelPlan[4][2] == 'X') ||
					// tredje kolumnen
					(spelPlan[0][4] == 'X' && spelPlan[2][4] == 'X' && spelPlan[4][4] == 'X') ||

					// villkor för första diagonalen
					(spelPlan[0][0] == 'X' && spelPlan[2][2] == 'X' && spelPlan[4][4] == 'X') ||
					// andra diagonalen
					(spelPlan[0][4] == 'X' && spelPlan[2][2] == 'X' && spelPlan[4][0] == 'X'))

			{
				// Om villkoren ovan uppfylls skrivs detta ut:
				System.out.println("Spelare X har vunnit tre i rad!");
			} else {
				// Annars skrivs detta ut:
				System.out.println("Spelare X har förlorat");
			}
			
			
			
			
			
			
			
			
			
			if(noPlayerWin) {
				
				// 4- Machine turn
				
				
				
				
				
				
				
				
				
				
				
				
				// 5- Check if machine have won
				
				
				
				
				
				
				
				
				
				
			}			
		
		turn++;	 // Nästa tur
			
		}
		
		// 6- Show winner message
		
		
		
		
		
		
				
	 
	}

}
