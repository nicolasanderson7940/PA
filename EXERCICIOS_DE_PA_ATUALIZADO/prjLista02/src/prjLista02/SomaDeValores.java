package prjLista02;

import java.util.Scanner;

public class SomaDeValores {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		
		int v1, v2, soma;
		
		System.out.println("Entre com o primeiro valor");
		v1 = ler.nextInt();
		
		System.out.println("Entre com o segundo valor");
		v2 = ler.nextInt(); 
		
		soma = v1+v2;
		
		System.out.println("A soma é = "+soma);
		}

}
