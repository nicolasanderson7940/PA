package prjLista1;

import java.util.Scanner;

public class Gol {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		int golsA, golsB;
		
		System.out.println("Quantos gols o Brasil marcou?");
		golsA = ler.nextInt();
		
		System.out.println("Quantos gols o time adversário marcou?");
		golsB = ler.nextInt();
		
		if (golsA > golsB) {
			System.out.println("O Brasil ganhou de " +golsA + " - " +golsB);
		}
		
		else if (golsA < golsB) {
			System.out.println("O time adversário ganhou de " +golsB + " - " +golsA);
		}
		
		else {
			System.out.println("Teve empate de " +golsA+ " - " +golsB);
		}
		
		ler.close();
	}
}