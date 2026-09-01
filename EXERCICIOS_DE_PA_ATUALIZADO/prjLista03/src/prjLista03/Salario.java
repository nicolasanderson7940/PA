package prjLista03;

import java.util.Scanner;

public class Salario {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		double salarioAnterior, reajuste, reajuste2, multiplicacao, novoSalario;
		
		System.out.println("insira o valor do salário");
		salarioAnterior = ler.nextDouble();
		
		System.out.println("Aplicando reajuste... ");
		
		reajuste = 10;
		reajuste2 = reajuste/100;
		multiplicacao = salarioAnterior*reajuste2;
		novoSalario = salarioAnterior+multiplicacao;
		
		System.out.println("O valor do novo salário é " +novoSalario);
		
		
	}

}
