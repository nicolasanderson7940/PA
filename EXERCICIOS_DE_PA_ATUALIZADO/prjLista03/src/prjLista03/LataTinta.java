package prjLista03;

import java.util.Scanner;

public class LataTinta {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double comprimento, largura, area, QL, quantidadeLatas;
		
		System.out.println("insira o valor do comprimento");
		comprimento = ler.nextDouble();
		
		System.out.println("insira o valor da largura");
		largura = ler.nextDouble();
		
		area = comprimento*largura;
		QL = 3.8;
		quantidadeLatas = area/QL;
		
		System.out.printf ("A quantidade de latas necessárias para a pintura da parede é %.2f" ,quantidadeLatas);
	}

}
