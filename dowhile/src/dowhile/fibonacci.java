package dowhile;

import java.util.Scanner;

public class fibonacci {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 1, numero, a = 0, b = 1, c;
		
		System.out.println("Informe ate onde você quer que a sequencia vá.");
		numero = ler.nextInt();
		
		do{
			c = a + b;
            a = b;
            b = c;
            System.out.println(a);
            i++;
		}while(i <= numero); 
	}

}
