package com.ya.gruppuppg;

public class Main {

	public static void main(String[] args) {
		
	
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
		
		// Provar att visa spelplanen med numner för att spelare ska kunna välja.		
		System.out.println();
				
		char number = 49;   // Number 49 is equal to '1' in ASCII code
		
		for(int i=0; i<=4; i=i+2 ) {
			for(int j=0; j<=4; j=j+2) {
				spelPlan[i][j] = number;
				number++;
			}
		}		
		for(char[] rad : spelPlan)	{
			System.out.print("   ");
			for(char i : rad)	{
				System.out.print(i);
			}
			System.out.println();
		}
		
	 
	}

}
