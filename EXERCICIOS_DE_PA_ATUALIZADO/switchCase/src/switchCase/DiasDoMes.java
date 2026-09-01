package switchCase;

import java.util.Scanner;

public class DiasDoMes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int mes;
        
        System.out.println("Entre com um número de 1 a 12 correspondente ao mês:");
        mes = in.nextInt();
        
        switch (mes) {
            case 2:
                System.out.println("O mês selecionado possui 28 dias.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("O mês selecionado possui 30 dias.");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("O mês selecionado possui 31 dias.");
                break;
            default:
                System.out.println("Número de mês inválido.");
        }
        
        in.close();
    }
}