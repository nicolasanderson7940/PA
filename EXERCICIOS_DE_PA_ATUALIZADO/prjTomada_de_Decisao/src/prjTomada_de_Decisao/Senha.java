package prjTomada_de_Decisao;

import java.util.Scanner;

public class Senha {
 public static void main(String []args) {
 	Scanner read = new Scanner (System.in);
 	
 	String senha, senhaUsuario;
 	
 	System.out.println("Insira sua senha");
 	senhaUsuario = read.next();
 	
 	if(senhaUsuario.equalsIgnoreCase("roblox")) {
 		
 		System.out.println("Acesso permitido");
 	}
 	
 	else {
 		System.out.println("Acesso negado.");
 	}
 	
 	read.close();
}
}