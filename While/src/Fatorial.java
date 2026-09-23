import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int numero, resultado = 1;
		
		System.out.println("Informe o numero");
		numero = ler.nextInt();
		
		
		while(numero > 1) {
			resultado = numero * resultado;
			System.out.println(resultado);
			numero = numero - 1;
		}
		System.out.println("o resultado é: " + resultado);

	}

}
