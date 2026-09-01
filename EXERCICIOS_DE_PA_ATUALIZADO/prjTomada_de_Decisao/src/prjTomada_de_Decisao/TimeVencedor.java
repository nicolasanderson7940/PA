package prjTomada_de_Decisao;

import java.util.Scanner;

public class TimeVencedor {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		int golA, golB;

		System.out.println("Quantos gols o Brasil marcou?");
		golA = read.nextInt();
		
		System.out.println("E quantos gols o país adversário marcou?");
		golB = read.nextInt();
		
		if (golB<golA) {
			System.out.println("O Brasil ganhou de " + golA + " - " + golB);
			
		}
		
		else {
			System.out.println("O País adversário ganhou de: " + golB + " - " +golA);
			System.out.println("O hexa não veio: ");
		}
		
		if (golA==golB)  {
			System.out.println("O Brasil e o país figurante empataram de " + golB + " - " + golA);
		}
		read.close();
	}
}
