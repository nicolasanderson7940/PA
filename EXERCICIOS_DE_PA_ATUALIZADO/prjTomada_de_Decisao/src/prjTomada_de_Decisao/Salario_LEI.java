package prjTomada_de_Decisao;

import java.util.Scanner;

public class Salario_LEI {
 public static void main(String [] args) {
	 Scanner read = new Scanner (System.in);
	 
	 double Salario, SalarioM;
	 
	 System.out.println("Insira o valor do salário");
	 Salario = read.nextDouble();
	 
	 System.out.println("Insira o valor do salário mínimo na Lei");
	 SalarioM = read.nextDouble();	 
	 
	 if (Salario<SalarioM) {
		 System.out.println("O salário não está dentro da lei");
		 System.out.println("Você recebe menos que merece, logo busque seus direitos!");
	 }
	 else {
		 System.out.println("O salário está dentro da lei");
	 }
	 
	 read.close();
 }
}
