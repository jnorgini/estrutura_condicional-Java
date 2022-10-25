package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class E7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois valores:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if(y > x) {
			System.out.println("Q1");
		}
		else if(x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if(x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		

		sc.close();

	}

}
