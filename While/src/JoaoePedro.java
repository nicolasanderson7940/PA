import java.util.Scanner;

public class JoaoePedro {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double joao = 1.34, pedro = 1.45;
        int ano;

        System.out.println("Informe o ano");
        ano = ler.nextInt();

        while (joao < pedro) {
            System.out.printf("no ano de %d o joão tinha %.2f metros%n", ano, joao);
            System.out.printf("no ano de %d o pedro tinha %.2f metros%n", ano, pedro);
            
            joao = joao + 0.25;
            pedro = pedro + 0.20;
            ano++;
        }
        System.out.println();
    }
}