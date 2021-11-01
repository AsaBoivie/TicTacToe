package com.ya.gruppuppg;

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
			
			
			
			
			
			
			
			
			
			
			
			
			// 3- Check if player have won
			
			
			
			
			
			
			
			
			
			
			
			if(noPlayerWin) {
				
				// 4- Machine turn
				
				
				
				
				
				
				
				
				
				
				
				
				// 5- Check if machine have won
				
				
				
				
				
				
				
				
				
				
			}			
		
		turn++;	 // Nästa tur
			
		}
		
		// 6- Show winner message
		
		
		
		
		
		
				
	 
	}

}
