package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class E8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Salário: ");
		double salario = sc.nextDouble();
		
		double imposto = 0.0;
		
		if(salario <= 2000.0) {
			System.out.println("Isento");
		}
		else if(salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.8;
		}
		else if(salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.8;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		System.out.printf("R$ %.2f%n", imposto);
		

		sc.close();

	}

}
