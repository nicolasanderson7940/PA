import java.util.Scanner;

public class Tabuada1á10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i, num = 0, resultado;

		System.out.println("Digite um número inteiro: ");
		num = ler.nextInt();
		
		for(i=1; i<=10; i++) {
			resultado = num * i;
			System.out.println(num + "x" + i + "=" + resultado);
	}
	}
}
