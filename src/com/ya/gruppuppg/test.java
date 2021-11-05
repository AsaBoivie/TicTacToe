package com.ya.gruppuppg;

import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		int turn;
		boolean noPlayerWin;
		boolean noMachineWin;

		// Skriv ut spelplan
		// rad och kolumn, 2D array

		// 1 | 2 | 3 [0][0] [0][2] [0][4]
		// - + - + -
		// 4 | 5 | 6 [2][0] [2][2] [2][4]
		// - + - + -
		// 7 | 8 | 9 [4][0] [4][2] [4][4]

		char[][] spelPlan = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

		turn = 1; // Det är inte möjligt mer än 5 turer för spelaren på TicTacToe
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

		while ((turn <= 5) && (noPlayerWin == true) && (noMachineWin == true)) {

			// 1- Show gameboard
			// Visa spelplanen med nummer för att spelare ska kunna välja.

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


			boolean taken = false;
			while (taken == false) {
			
				Scanner scan = new Scanner(System.in);
				System.out.println("I vilken ruta vill du sätta ditt kryss? (1-9)");
				int userInput = scan.nextInt();

				System.out.println("Du gjorde ditt val i ruta: " + userInput);
				
				
			switch (userInput) {
			case 1:
				if (spelPlan[0][0] == ' ') {
					spelPlan[0][0] = 'X';
					taken = true; }
				break;
			case 2:
				if (spelPlan[0][2] == ' ') {
					spelPlan[0][2] = 'X';
					taken = true; }
				break;
			case 3:
				if (spelPlan[0][4] == ' ') {
					spelPlan[0][4] = 'X';
					taken = true; }
				break;
			case 4:
				if (spelPlan[2][0] == ' ') {
					spelPlan[2][0] = 'X';
					taken = true; }
				break;
			case 5:
				if (spelPlan[2][2] == ' ') {
					spelPlan[2][2] = 'X';
					taken = true; }
				break;
			case 6:
				if (spelPlan[2][4] == ' ') {
					spelPlan[2][4] = 'X';
					taken = true; }
				break;
			case 7:
				if (spelPlan[4][0] == ' ') {
					spelPlan[4][0] = 'X';
					taken = true; }
				break;
			case 8:
				if (spelPlan[4][2] == ' ') {
					spelPlan[4][2] = 'X';
					taken = true; }
				break;
			case 9:
				if (spelPlan[4][4] == ' ') {
					spelPlan[4][4] = 'X';
					taken = true; }
				break;
			default:
				System.out.println("Platsen upptagen, gör ett nytt försök");
				break;
			}// slut på switch
			}// slut på while
			
// 3- Check if player have won

			if ((spelPlan[0][0] == 'X' && spelPlan[0][2] == 'X' && spelPlan[0][4] == 'X')
					|| (spelPlan[2][0] == 'X' && spelPlan[2][2] == 'X' && spelPlan[2][4] == 'X')
					|| (spelPlan[4][0] == 'X' && spelPlan[4][2] == 'X' && spelPlan[4][4] == 'X') ||

					(spelPlan[0][0] == 'X' && spelPlan[2][0] == 'X' && spelPlan[4][0] == 'X')
					|| (spelPlan[0][2] == 'X' && spelPlan[2][2] == 'X' && spelPlan[4][2] == 'X')
					|| (spelPlan[0][4] == 'X' && spelPlan[2][4] == 'X' && spelPlan[4][4] == 'X') ||

					(spelPlan[0][0] == 'X' && spelPlan[2][2] == 'X' && spelPlan[4][4] == 'X')
					|| (spelPlan[0][4] == 'X' && spelPlan[2][2] == 'X' && spelPlan[4][0] == 'X'))

			{
				noPlayerWin = false;
			}

// 4- Machine turn
			if (noPlayerWin) {

				boolean taken2 = false;
				while (taken2 == false) {
				
					Random rand = new Random();
					int machineTurn = rand.nextInt(9) + 1;
					
				switch (machineTurn) {
				case 1:
					if (spelPlan[0][0] == ' ') {
						spelPlan[0][0] = 'O';
						taken2 = true; }
					break;
				case 2:
					if (spelPlan[0][2] == ' ') {
						spelPlan[0][2] = 'O';
						taken2 = true; }
					break;
				case 3:
					if (spelPlan[0][4] == ' ') {
						spelPlan[0][4] = 'O';
						taken2 = true; }
					break;
				case 4:
					if (spelPlan[2][0] == ' ') {
						spelPlan[2][0] = 'O';
						taken2 = true; }
					break;
				case 5:
					if (spelPlan[2][2] == ' ') {
						spelPlan[2][2] = 'O';
						taken2 = true; }
					break;
				case 6:
					if (spelPlan[2][4] == ' ') {
						spelPlan[2][4] = 'O';
						taken2 = true; }
					break;
				case 7:
					if (spelPlan[4][0] == ' ') {
						spelPlan[4][0] = 'O';
						taken2 = true; }
					break;
				case 8:
					if (spelPlan[4][2] == ' ') {
						spelPlan[4][2] = 'O';
						taken2 = true; }
					break;
				case 9:
					if (spelPlan[4][4] == ' ') {
						spelPlan[4][4] = 'O';
						taken2 = true; }
					break;
				default:
					// System.out.println("Platsen upptagen, gör ett nytt försök");
					break;
				}

				System.out.println("Datorn valde ruta: " + machineTurn);
				}// slut på while
				
// 5- Check if machine have won

				if ((spelPlan[0][0] == 'O' && spelPlan[0][2] == 'O' && spelPlan[0][4] == 'O')
						|| (spelPlan[2][0] == 'O' && spelPlan[2][2] == 'O' && spelPlan[2][4] == 'O')
						|| (spelPlan[4][0] == 'O' && spelPlan[4][2] == 'O' && spelPlan[4][4] == 'O') ||

						(spelPlan[0][0] == 'O' && spelPlan[2][0] == 'O' && spelPlan[4][0] == 'O')
						|| (spelPlan[0][2] == 'O' && spelPlan[2][2] == 'O' && spelPlan[4][2] == 'O')
						|| (spelPlan[0][4] == 'O' && spelPlan[2][4] == 'O' && spelPlan[4][4] == 'O') ||

						(spelPlan[0][0] == 'O' && spelPlan[2][2] == 'O' && spelPlan[4][4] == 'O')
						|| (spelPlan[0][4] == 'O' && spelPlan[2][2] == 'O' && spelPlan[4][0] == 'O'))

				{
					noMachineWin = false;
				}

			} // slut på if noPlayerWin

		} // slut på 	while ((turn <= 5) && (noPlayerWin == true) && (noMachineWin == true)) {

		turn++; // Nästa tur

// 6- Show winner message

		if (noPlayerWin == false) {
			System.out.println("Spelaren har vunnit");
		}

		if (noMachineWin == false) {
			System.out.println("Maskinen har vunnit");
		}

	}

}

	

