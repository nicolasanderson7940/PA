package prjLista04Decisao_Composta;

import java.util.Scanner;

public class Bhaskaraa {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, b2, delta, bMenos, deltaRaiz, raiz1, raiz2;
		
		System.out.println("insira o valor de A"); 
		a = ler.nextDouble();
		
		System.out.println("insira o valor de B");
		b = ler.nextDouble();
		
		System.out.println("insira o valor de C");
		c = ler.nextDouble();
		
		b2 = b *b;
		delta = b2 -4*a*c;
		
		System.out.println("seu valor de delta é " +delta);
		
		
		if(delta > 0) {
			System.out.println("Possui duas raízes reais :");
		
			bMenos = b *(-1);
			
			deltaRaiz = Math.sqrt(delta);
			
			raiz1 = (bMenos + deltaRaiz) / (2*a);
			
			System.out.println("A primeira raíz real é " +raiz1);
			
			raiz2 = (bMenos - deltaRaiz) / (2*a);
			
			System.out.println("A segunda raíz real é " +raiz2);
		}
		
		else if (delta == 0) { 
			System.out.println("POSSUI APENAS UMA RAÍZ REAL");
			
			bMenos = b *(-1);
			
			deltaRaiz = Math.sqrt(delta);
			
			raiz1 = (bMenos + deltaRaiz) / (2*a);
			
			System.out.println("A raíz real é " +raiz1);
			
		}
		else {
			System.out.println("Não possui raízes reais");
		}
		
		ler.close();
	}
}
