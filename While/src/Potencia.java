import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int i = 0, expoente, numero, resultado = 1;
		
		System.out.println("Informe o numero");
		numero = ler.nextInt();
		
		System.out.println("Informe o expoente");
		expoente = ler.nextInt();
		
		while(i < expoente) {
			resultado = numero * resultado;

			System.out.println(resultado);
			i++;
		}
		
		System.out.println("o resultado é: " + resultado);

	}

}
