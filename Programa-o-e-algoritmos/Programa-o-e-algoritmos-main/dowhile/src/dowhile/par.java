package dowhile;

public class par {
	public static void main(String[] args) {
		int i = 0;
		
		do {
			if(i % 2 == 0) {
				if (i % 10 == 0) {
					System.out.println(i + " É um multiplo de 10");
				}else {
					System.out.println(i);
				}
			}
			++i;
		}while (i <= 500);
		}
}

