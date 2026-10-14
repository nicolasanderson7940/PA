import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int numero, maior;
		int i;
		
		System.out.println("Informe um número: ");
		numero = ler.nextInt();
		
		maior = numero;
		
		for (i = 2; i <= 10; i++) {
			System.out.println("Informe um número: ");
			numero = ler.nextInt();
			
			if (numero > maior) {
				maior = numero;
			}
		}
		
		System.out.println("O maior número digitado foi:" +maior);

	}

}
