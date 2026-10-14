package switchCase;

import java.util.Scanner;

public class SignoMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do aluno: ");
        int idade = scanner.nextInt();

        switch (idade) {
            case 6:
                System.out.println("Dente de leite");
                break;
            case 7:
                System.out.println("Júnior");
                break;
            case 8:
                System.out.println("Júnior max");
                break;
            case 9:
                System.out.println("Júnior master");
                break;
            case 10:
                System.out.println("Master");
                break;
            default:
                System.out.println("Essa categoria não existe");
                break;
        }

        scanner.close();
    }
}