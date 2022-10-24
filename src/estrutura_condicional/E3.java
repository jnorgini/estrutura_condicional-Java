package estrutura_condicional;

import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite dois valores inteiros:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a % 2 == 0 && b % 2 == 0) {
			System.out.println("São múltiplos");
		}
		else {
			System.out.println("Não são múltiplos");
		}
		
		
		sc.close();

	}

}
