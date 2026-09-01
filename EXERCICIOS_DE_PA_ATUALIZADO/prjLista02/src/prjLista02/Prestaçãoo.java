package prjLista02;

import java.util.Scanner; 

public class Prestaçãoo {
	public static void main(String [] args) {
		Scanner ler = new Scanner (System.in);
		
		Double valor, taxa, taxaCompleta, tempTaxado, valor2, temp, prestacao; 
		
		System.out.println("Entre com o valor original");
		valor = ler.nextDouble();
		
		System.out.println("Entre com o valor da taxa");
		taxa = ler.nextDouble();
		
		System.out.println("Entre com o intervalo de tempo");
		temp = ler.nextDouble(); 
		
		taxaCompleta = taxa/100;
		
		tempTaxado = taxaCompleta*temp;
		
		valor2 = valor*tempTaxado;
		
		prestacao = valor+valor2;
		
		System.out.println("O valor da prestação é = "+prestacao);
				
		
		}

}
