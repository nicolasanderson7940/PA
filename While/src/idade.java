import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int i = 1, idade, pri = 0, seg = 0, ter = 0, qua = 0, quin = 0;
		
		while(i <= 10) {
			System.out.println("Infome a idade da pessoa numero " + i);
			idade = ler.nextInt();
			
			if(idade <= 15) {
				pri++;
			}
			
			else if(idade <= 30) {
				seg++;
			}
			
			else if(idade <= 45) {
				ter++;
			}
			
			else if(idade <= 60) {
				qua++;
			}
			
			else{
				quin++;
			}
			i++;
		}
		System.out.println("Na primeira faixa etaria tem " + pri + " pessoas");
		System.out.println("Na segunda faixa etaria tem " + seg + " pessoas");
		System.out.println("Na terceira faixa etaria tem " + ter + " pessoas");
		System.out.println("Na quarta faixa etaria tem " + qua + " pessoas");
		System.out.println("Na quinta faixa etaria tem " + quin + " pessoas");
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("A porcentagem da primeira faixa etaria é de: " + pri + "0%");
		System.out.println("A porcentagem da segunda faixa etaria é de: " + seg+ "0%");
		System.out.println("A porcentagem da terceira faixa etaria é de: " + ter + "0%");
		System.out.println("A porcentagem da quarta faixa etaria é de: " + qua + "0%");
		System.out.println("A porcentagem da quinta faixa etaria é de: " + quin + "0%");
		

	}

}
