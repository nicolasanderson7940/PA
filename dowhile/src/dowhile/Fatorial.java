package dowhile;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int numero, resultado = 1;
		
		System.out.println("Informe o numero");
		numero = ler.nextInt();
		
		do {
	
			resultado = numero * resultado;
			System.out.println(resultado);
			numero = numero - 1;
	
		
		} while(numero > 1);

	}

}
