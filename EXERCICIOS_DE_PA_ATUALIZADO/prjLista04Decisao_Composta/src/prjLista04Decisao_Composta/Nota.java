package prjLista04Decisao_Composta;

import java.util.Scanner;

public class Nota {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double n1, n2, media, nE, mediaE;
		
		System.out.println("Quanto tirou na primeira prova ?");
		n1 = ler.nextDouble();
		
		System.out.println("E na segunda prova ?");
		n2 = ler.nextDouble();
		
		media = (n1 + n2) / 2;
		System.out.println("Sua média é " +media);
		
		if (media < 3) {
			System.out.println("Você foi reprovado! :(");
		}
		else if (media >= 6) {
			System.out.println("Você foi aprovado! :)");
		}
		else {
			System.out.println("Você não passou, mas fará um exame e terá uma segunda chance!");
			
			System.out.println("Quanto tirou no exame?");

			nE = ler.nextDouble();
			
			mediaE = (media + nE) / 2;
			
			System.out.println("Sua média é " +mediaE);
			
			if (mediaE >= 6) {
				System.out.println("Você passou!");
			}
			else {
				System.out.println("Infelizmente Reprovado!");
			}
		}
		ler.close();
	}
}
