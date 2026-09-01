package prjLista02;

import java.util.Scanner;

public class MediaArit {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		
		Double nota1, nota2, nota3, nota4, soma, mediaA;
		
		System.out.println("Entre com a primeira nota");
		nota1 = ler.nextDouble();
		
		System.out.println("Entre com a segunda nota");
		nota2 = ler.nextDouble();
		
		System.out.println("Entre com a terceira nota");
		nota3 = ler.nextDouble();
		
		System.out.println("Entre com a quarta nota");
		nota4 = ler.nextDouble();
		
		soma = nota1+nota2+nota3+nota4;
		mediaA = soma/4;
		
		System.out.println(" média aritmética é = "+mediaA);
	}
}
