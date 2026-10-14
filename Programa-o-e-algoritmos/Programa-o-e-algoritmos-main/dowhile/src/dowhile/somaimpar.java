package dowhile;

public class somaimpar {
public static void main(String[] args) {
	        
	        int i = 1, soma = 0;
	        
	        do {
	            if (i % 2 != 0) {
	                soma = soma + i;
	            }
	            i++;
	        } while (i <= 1000);
	        
	        System.out.println("A soma dos impares e: " + soma);
	    }
	}
