package tictactoe;

import java.util.*;

public class Dashboard {

	public static void main(String[] args) {
		char [][] gameBoard = {{'_','|','_','|','_'},{'_','|','_','|','_'},{' ','|',' ','|',' '}};
		printBoard(gameBoard);
		boolean gameOver = false;		
			while(!gameOver) {
				playerMove(gameBoard);
				gameOver = isGameOver(gameBoard);
				if(gameOver) {
					break;
				}
				
				computerMove(gameBoard); //computerMove
				gameOver = isGameOver(gameBoard);
				if(gameOver) {
					break;
				}
			}
		}
	
public static void printBoard(char [][] gameBoard){
	for(char[] row : gameBoard){
		for(char c: row) {
			System.out.print(c);
		}
/*
 Ovan foreach-loop i klassisk forloopform:
 for (int row = 0; row < gameBoard.length; row++){
 	for(int c = 0; c < gameBoard[0].length; c++){
 		System.out.print(gameBoard[row][c]);
 		}
 */
		System.out.println();
	}
}

public static void updateBoard(int position, int player, char[][] gameBoard){
	char character;
	if(player==1) {
		character = 'X';
	}
	else {
		character = 'O';
		}
	/*
	 I ovan metodförklaring anges heltalsvariablerna position och player.
	 Sen deklareras karaktärerna X till spelare 1 och O till annan spelare.
	 Nedan Switch-sats säger att om heltalet position är '1' ska karaktären (X eller O)
	 skrivas ut på den plats som anges på spelbrädet. Sen skrivs spelbrädet ut igen.
	 */
	
	switch (position) {
		case 1: 
			gameBoard[0][0] = character;
			printBoard(gameBoard);			
			break;
		case 2:
			gameBoard[0][2] = character;
			printBoard(gameBoard);
			break;
		case 3:
			gameBoard[0][4] = character;
			printBoard(gameBoard);
			break;
		case 4:
			gameBoard[1][0] = character;
			printBoard(gameBoard);
			break;
		case 5:
			gameBoard[1][2] = character;
			printBoard(gameBoard);
			break;
		case 6:
			gameBoard[1][4] = character;
			printBoard(gameBoard);
			break;
		case 7:
			gameBoard[2][0] = character;
			printBoard(gameBoard);
			break;
		case 8:
			gameBoard[2][2] = character;
			printBoard(gameBoard);
			break;
		case 9:
			gameBoard[2][4] = character;
			printBoard(gameBoard);
			break;
		default:
			break;
	}
}

public static void playerMove(char[][] gameBoard) {
	/*
	 Denna metod (playerMove) frågar användaren efter en siffra.
	 Siffran blir sedan heltalsvariabeln "move". 
	 eftersom att metoden permanent fyller i heltalsvärdet "move"
	 i metoden "updateBoard":s "position"-argument så kommer det värde
	 användaren anger att heltalsvariabeln "move" ska ha att vara den position
	 som updateBoard uppdaterar spelbrädet med. 
	 
	 Valideringen sker genom metoden "isValidMove".
	 Medan den är falsk (!result) skrivs ogiltigt drag och
	 man får köra igen, se även kommentar i metod "isValidMove".
	 */
	System.out.println("Ditt drag: (ruta 1-9)");
	Scanner scan = new Scanner(System.in);
	int move = scan.nextInt();
	boolean result = isValidMove(move, gameBoard);
	
	while(!result) {
		System.out.println("Ditt drag är inte giltigt! Försök igen...");
		move = scan.nextInt();
		result = isValidMove(move,gameBoard);
	}
	updateBoard(move, 1, gameBoard);
	System.out.println("Du valde ruta " + move);
}

public static boolean isValidMove(int move, char[][] gameboard) {
	/*
	 Metoden är sann om heltalsvariabeln move visar en tom ruta.
	 En tom ruta innebär för ruorna 1-6 ett understreck och för
	 rutorna 7-9 ett mellanslag.
	 Visas något annat så är metoden falsk.
	 Om metoden är falsk så kommer ett meddelande skrivas ut i
	 metoden "playerMove".
	 */
	
	switch (move) {
		case 1:
			if(gameboard[0][0] == '_') {
				return true;
			} else {
				return false;
			}
		case 2:
			if(gameboard[0][2] == '_') {
				return true;
			} else {
				return false;
			}
		case 3:
			if(gameboard[0][4] == '_') {
				return true;
			} else {
				return false;
			}
		case 4:
			if(gameboard[1][0] == '_') {
				return true;
			} else {
				return false;
			}
		case 5:
			if(gameboard[1][2] == '_') {
				return true;
			} else {
				return false;
			}
		case 6:
			if(gameboard[1][4] == '_') {
				return true;
			} else {
				return false;
			}
		case 7:
			if(gameboard[2][0] == ' ') {
				return true;
			} else {
				return false;
			}
		case 8:
			if(gameboard[2][2] == ' ') {
				return true;
			} else {
				return false;
			}
		case 9:
			if(gameboard[2][4] == ' ') {
				return true;
			} else {
				return false;
			}
		default: 
			return false;
	}
}

public static void computerMove(char[][] gameBoard) {
	/*
	 Denna metod (computerMove) tar fram en random siffra mellan 1-9 (0-8 + 1).
	 Siffran blir sedan heltalsvariabeln "move". Eftersom att metoden permanent fyller 
	 i heltalsvärdet "move" inom metoden "updateBoard":s "position"-argument så kommer det värde
	 randomsiffran anger att heltalsvariabeln "move" ska ha att vara den position
	 som updateBoard uppdaterar spelbrädet med för spelaren som inte är player1 (datorn). 
	 
	 Valideringen sker genom metoden "isValidMove".
	 Medan den är falsk (!result) skrivs ogiltigt drag och
	 man får köra igen, se även kommentar i metod "isValidMove".
	 */
	Random rand = new Random();
	int move = rand.nextInt(9) + 1;
	boolean result = isValidMove(move, gameBoard);
	while(!result) {
		move = rand.nextInt(9) + 1;
		result = isValidMove(move, gameBoard);
	}
	updateBoard(move, 2, gameBoard);
	System.out.println("Datorn valde ruta " + move);
}

public static boolean isGameOver(char[][] gameBoard) {
	//Horisontella (varannan spelaren, varannan datorn)
	if(gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X') {
		System.out.println("Grattis, du vann!");
		return true;
	}
	if(gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O') {
		System.out.println("Datorn vann!");
		return true;
	}
	if(gameBoard[1][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[1][4] == 'X') {
		System.out.println("Grattis, du vann!");
		return true;
	}
	if(gameBoard[1][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[1][4] == 'O') {
		System.out.println("Datorn vann!");
		return true;
	}
	if(gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X') {
		System.out.println("Grattis, du vann!");
		return true;
	}
	if(gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O') {
		System.out.println("Datorn vann!");
		return true;
	}
	//Vertikala (varannan spelaren, varannan datorn)
	if(gameBoard[0][0] == 'X' && gameBoard[1][0] == 'X' && gameBoard[2][0] == 'X') {
		System.out.println("Grattis, du vann!");
		return true;
	}
	if(gameBoard[0][0] == 'O' && gameBoard[1][0] == 'O' && gameBoard[2][0] == 'O') {
		System.out.println("Datorn vann!");
		return true;
	}
	if(gameBoard[0][2] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][2] == 'X') {
		System.out.println("Grattis, du vann!");
		return true;
	}
	if(gameBoard[0][2] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][2] == 'O') {
		System.out.println("Datorn vann!");
		return true;
	}
	if(gameBoard[0][4] == 'X' && gameBoard[1][4] == 'X' && gameBoard[2][4] == 'X') {
		System.out.println("Grattis, du vann!");
		return true;
	}
	if(gameBoard[0][4] == 'O' && gameBoard[1][4] == 'O' && gameBoard[2][4] == 'O') {
		System.out.println("Datorn vann!");
		return true;
	}
	//Diagonala (varannan spelaren, varannan datorn)
	if(gameBoard[0][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][4] == 'X') {
		System.out.println("Grattis, du vann!");
		return true;
	}
	if(gameBoard[0][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][4] == 'O') {
		System.out.println("Datorn vann!");
		return true;
	}
	if(gameBoard[2][0] == 'X' && gameBoard[1][2] == 'X' && gameBoard[0][4] == 'X') {
		System.out.println("Grattis, du vann!");
		return true;
	}
	if(gameBoard[2][0] == 'O' && gameBoard[1][2] == 'O' && gameBoard[0][4] == 'O') {
		System.out.println("Datorn vann!");
		return true;
	}
	// Lika om:
	if(gameBoard[0][0] !='_' && gameBoard[0][2] !='_' && gameBoard[0][4] != '_' 
			&& gameBoard[1][0] !='_' && gameBoard[1][2] != '_' && gameBoard[1][4] !='_' 
			&& gameBoard[2][0] !=' ' && gameBoard[2][2] !=' ' && gameBoard[2][4] !=' ') {
		System.out.println("Oavgjort!");
		return true;
	}
	return false;	
}

}
