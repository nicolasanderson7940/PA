package switchCase;

import java.util.Scanner;

public class maiordeidade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = 0;
		while(i < 6){
			
			System.out.println("Coloque e que ano você nasceu:");
			int ano = in.nextInt();
			
			System.out.println("Em que ano estamos?");
			int atual = in.nextInt();
			
			int idade;
			idade = ano - atual;
			
			if(idade < 18) {
				System.out.println("Você tem" + idade + "anos, sendo menor de idade.");
			}else{
				System.out.println("Você tem" + idade + "anos, sendo maior de idade.");
			}
			
		i++;
		}
		
	}

}
