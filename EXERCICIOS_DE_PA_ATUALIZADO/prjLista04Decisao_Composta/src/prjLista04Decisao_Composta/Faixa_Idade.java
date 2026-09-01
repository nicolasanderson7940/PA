package prjLista04Decisao_Composta;

import java.util.Scanner;

public class Faixa_Idade {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int aa, an, id;
		
		System.out.println("Entre com o ano de nascimento");
		an = ler.nextInt();
		
		System.out.println("Entre com o ano atual");
		aa = ler.nextInt();
		
		id = aa - an;
		
		System.out.println("Sua idade é " +id+ " anos");
		
		if (id<10) {
			System.out.println("Você é Criança! Brinque muito!");
		}
		else if (id<18) {
			System.out.println("Você é Adolescente! Estude bastante!");
		}
		else if (id<60) {
			System.out.println("Você é Adulto! CLT KK");
		}
		else {
			System.out.println("Você é Idoso! Bença");
		}
		
		ler.close();
	}
}

