package prjLista02;

import java.util.Scanner;

public class Celsius {
	public static void main(String [] args) {
		Scanner ler = new Scanner (System.in);
		
		Double Cel, fa, faMenos;
		
		System.out.println("Entre com a temperatura em escala Fahrenheit");
		fa = ler.nextDouble();
		
		faMenos = fa-32;
		
		Cel = faMenos* 5/9;
		
		System.out.println("A temperatura em escala Celsius é " +Cel);
	
	}

}
