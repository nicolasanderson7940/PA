package prjTomada_de_Decisao;

import java.util.Scanner;

public class ImparPar {
	public static void main(String [] args) {
		Scanner read = new Scanner (System.in);
		
		int impar, resto;
		
		System.out.println("Insira o número inteiro"); 
		impar = read.nextInt();
		
		resto =  impar % 2;
		
		if (resto == 0){
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é ímpar");
		}
		
		read.close();
	}

}
