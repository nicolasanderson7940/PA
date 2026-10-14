import java.util.Scanner;

public class Soma10Num {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int numero, soma = 0;
		int i = 0;
		
		for (i = 1; i <= 10; i++) {
			System.out.println("Informe um número: ");
			numero = ler.nextInt();
			
			soma = soma + numero;
		}
		System.out.println("A soma é: " +soma);

	}

}
