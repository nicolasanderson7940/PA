package switchCase;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Escolha um número inteiro para fazer a tabuada.");
		int n = in.nextInt();
		
		int i = 1;
		while(i<=10) {
			System.out.println(n+ "x" +i+ "=" + (n*i));
			i++;
		}
	in.close();
	}

}
