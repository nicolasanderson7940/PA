package dowhile;

import java.util.Scanner;

public class maiordeid {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int anoA, anoN, id, resposta;
		
		do {
			System.out.println("Escreva o ano atual:");
			anoA = ler.nextInt();
			
			System.out.println("Escreva sua data de nascimento:");
			anoN = ler.nextInt();
			
			id = anoA - anoN;
			
			if(id>= 18) {
				System.out.println("Você tem " + id + "de idade, você é de maior");
			}else {
				System.out.println("Você tem " + id + "de idade, você é de menor");
			}
			
			System.out.println("Você deseja continuar?\nPressione 1 para sim\nPressione 2 para não");
			resposta = ler.nextInt();
			
		}while(resposta == 1);
		
		ler.close(); 
	}
}