package estrutura_condicional;

import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hora inicial do jogo: ");
		int hI = sc.nextInt();
		System.out.print("Hora final do jogo: ");
		int hF = sc.nextInt();
		
		int tempo;
		
		if(hI < hF) {
			tempo = hF - hI;
		}
		else {
			tempo = 24 - hI + hF;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", tempo);
		

		sc.close();

	}

}
