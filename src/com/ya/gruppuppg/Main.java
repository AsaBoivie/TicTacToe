package com.ya.gruppuppg;

public class Main {

	public static void main(String[] args) {
		// Skriv ut spelplan
		// rad och kolumn, 2D array
		
		// 3 rader, 3 kolumner = spelbrickan
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

	}

}
