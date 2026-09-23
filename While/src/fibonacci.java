import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 1, numero, a = 0, b = 1, c;
		
		System.out.println("Informe ate onde vôce quer que a sequencia vá");
		numero = ler.nextInt();
		
		while(i <= numero) {
			c = a + b;
            a = b;
            b = c;
            System.out.println(a);
            i++;
		}
	}

}
