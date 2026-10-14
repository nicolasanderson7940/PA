
public class Somadospares1a100 {
	public static void main(String[] args) {
			int i, s;
			s = 0;

			for (i=1; i<=100; i++) {
			if (i % 2 == 0) {
			s = s + i;	
		}
		}
		System.out.println(s);
		}
	}