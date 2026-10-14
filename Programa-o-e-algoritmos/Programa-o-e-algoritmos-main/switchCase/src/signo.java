package switchCase;

import java.util.Scanner;

public class Exercicio2 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia do nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês do nascimento (1 a 12): ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
                if (dia <= 19) {
                    System.out.println("capricórnio");
                } else {
                    System.out.println("aquário");
                }
                break;
            case 2:
                if (dia <= 19) {
                    System.out.println("aquário");
                } else {
                    System.out.println("peixes");
                }
                break;
            case 3:
                if (dia <= 20) {
                    System.out.println("peixes");
                } else {
                    System.out.println("áries");
                }
                break;
            case 4:
                if (dia <= 20) {
                    System.out.println("áries");
                } else {
                    System.out.println("touro");
                }
                break;
            case 5:
                if (dia <= 20) {
                    System.out.println("touro");
                } else {
                    System.out.println("gêmeos");
                }
                break;
            case 6:
                if (dia <= 21) {
                    System.out.println("gêmeos");
                } else {
                    System.out.println("câncer");
                }
                break;
            case 7:
                if (dia <= 21) {
                    System.out.println("câncer");
                } else {
                    System.out.println("leão");
                }
                break;
            case 8:
                if (dia <= 22) {
                    System.out.println("leão");
                } else {
                    System.out.println("virgem");
                }
                break;
            case 9:
                if (dia <= 22) {
                    System.out.println("virgem");
                } else {
                    System.out.println("libra");
                }
                break;
            case 10:
                if (dia <= 22) {
                    System.out.println("libra");
                } else {
                    System.out.println("escorpião");
                }
                break;
            case 11:
                if (dia <= 21) {
                    System.out.println("escorpião");
                } else {
                    System.out.println("sagitário");
                }
                break;
            case 12:
                if (dia <= 21) {
                    System.out.println("sagitário");
                } else {
                    System.out.println("capricórnio");
                }
                break;
            default:
                System.out.println("mês inválido");
                break;
        }

        scanner.close();
    }
}