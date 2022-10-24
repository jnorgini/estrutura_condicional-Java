package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Item code: ");
		int cod = sc.nextInt();
		System.out.print("Amount: ");
		int amount = sc.nextInt();
		
		double total = 0;
			
		if(cod == 1) {
			total = 4.00 * amount;
		}
		else if(cod == 2) {
			total = 4.50 * amount;
		}
		else if(cod == 3) {
			total = 5.00 * amount;
		}
		else if(cod == 4) {
			total = 2.00 * amount;
		}
		else if(cod == 5) {
			total = 1.50 * amount;
		}

		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();

	}

}
