package prjLista03;

import java.util.Scanner;

public class DocesGuloseimas {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double qnt_SalgadosH, SalgadosM, SalgadosT, DocesH, DocesM, DocesT , Bolo, Convidados, grama, quilo, mlH, mlM, bebidaH, bebidaM, qnt_BebidaH, qnt_BebidaM, qnt_BebidaT;
		int qnt_H, qnt_M;
		
		System.out.println("insira a quantidade de convidados masculinos");
		qnt_H = ler.nextInt();
		
		System.out.println("insira a quantidade de convidadas femininas");
		qnt_M = ler.nextInt();
		
		qnt_SalgadosH = qnt_H*15;
		
		SalgadosM = qnt_M*10;
		
		SalgadosT = qnt_SalgadosH + SalgadosM;
		
		
		DocesH = qnt_H*6;
		
		DocesM = qnt_M*8;
		
		DocesT = DocesH + DocesM;
		
		
		grama = 100;
		quilo = grama/1000;
		
		Convidados = qnt_H + qnt_M;
		Bolo = Convidados * quilo;
		
		
		mlH = 600;
		mlH = 500;
		
		bebidaH = mlH/1000;
		bebidaM = mlH/1000;
		
		qnt_BebidaH = qnt_H * bebidaH;
		
		qnt_BebidaM = qnt_M * bebidaM;
		
		qnt_BebidaT = qnt_BebidaH + qnt_BebidaM;
		
		
		System.out.println("Lista de compras");
		
		System.out.println("A quantidade a ser comprada: ");
		
		System.out.println("em salgado é " +SalgadosT + " unidades");
		
		System.out.println("em doces é " +DocesT + " unidades");
		
		System.out.println("em bolo é " +Bolo + " kilos");
		
		System.out.println("em bebida é " +qnt_BebidaT + " litros");
		
		
	}

}
