import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i;
		int numero;
		
		System.out.println("Informe um número: ");
		numero = ler.nextInt();
		
		for (i = 1; i <= numero; i++) {
			System.out.println(i);
		}

	}

}
