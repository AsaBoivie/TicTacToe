package com.ya.gruppuppg;

public class hasPlayerWon {
	
	public static void main(String[] args) {

	// En if-sats f�r att kontrollera ifall spelare X har vunnit i 8 olika utfall
		// f�rsta raden
		if ((spelPlan[0][0] == 'X' && spelPlan[0][2] == 'X' && spelPlan[0][4] == 'X') ||
				// andra raden
				(spelPlan[2][0] == 'X' && spelPlan[2][2] == 'X' && spelPlan[2][4] == 'X') ||
				// tredje raden
				(spelPlan[4][0] == 'X' && spelPlan[4][2] == 'X' && spelPlan[4][4] == 'X') ||

				// villkor f�r f�rsta kolumnen
				(spelPlan[0][0] == 'X' && spelPlan[2][0] == 'X' && spelPlan[4][0] == 'X') ||
				// andra kolumnen
				(spelPlan[0][2] == 'X' && spelPlan[2][2] == 'X' && spelPlan[4][2] == 'X') ||
				// tredje kolumnen
				(spelPlan[0][4] == 'X' && spelPlan[2][4] == 'X' && spelPlan[4][4] == 'X') ||

				// villkor f�r f�rsta diagonalen
				(spelPlan[0][0] == 'X' && spelPlan[2][2] == 'X' && spelPlan[4][4] == 'X') ||
				// andra diagonalen
				(spelPlan[0][4] == 'X' && spelPlan[2][2] == 'X' && spelPlan[4][0] == 'X'))

		{
			// Om villkoren ovan uppfylls skrivs detta ut:
			System.out.println("Spelare X har vunnit tre i rad!");
		} else {
			// Annars skrivs detta ut:
			System.out.println("Spelare X har f�rlorat");
		}

	}

}
