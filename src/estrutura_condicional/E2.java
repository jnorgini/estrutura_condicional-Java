package estrutura_condicional;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
		

		sc.close();

	}

}
