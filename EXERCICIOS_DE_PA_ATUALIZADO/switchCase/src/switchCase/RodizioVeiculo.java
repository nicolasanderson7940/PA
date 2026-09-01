package switchCase;

import java.util.Scanner;

public class RodizioVeiculo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int placa;
        
        System.out.println("Entre com o último número da placa do veículo (0 a 9):");
        placa = in.nextInt();
        
        switch (placa) {
            case 1:
            case 2:
                System.out.println("Este veículo não pode rodar na segunda-feira.");
                break;
            case 3:
            case 4:
                System.out.println("Este veículo não pode rodar na terça-feira.");
                break;
            case 5:
            case 6:
                System.out.println("Este veículo não pode rodar na quarta-feira.");
                break;
            case 7:
            case 8:
                System.out.println("Este veículo não pode rodar na quinta-feira.");
                break;
            case 9:
            case 0:
                System.out.println("Este veículo não pode rodar na sexta-feira.");
                break;
            default:
                System.out.println("Dígito de placa inválido.");
        }
        
        in.close();
    }
}