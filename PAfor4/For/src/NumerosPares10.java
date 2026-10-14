import java.util.Scanner;

public class NumerosPares10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num, pares = 0;
		int i = 0;
		
		for (i = 1; i <= 10; i++) {
			System.out.println("Informe um número: ");
			num = ler.nextInt();
			
			if (num % 2 == 0) {
				pares++;
			}
		}
		
		System.out.println("Quantidade de pares: " +pares);

	}

}
