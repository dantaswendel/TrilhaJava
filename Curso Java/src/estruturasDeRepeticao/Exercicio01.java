package estruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		int x;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Numero entre 1 e 1000");
		x = sc.nextInt();

		if (1 <= x && x <= 100) {

			for (int y =1 ; y <=x; y++) {
				
				if(y%2 !=0) {
					System.out.println(y);
				}

			}

		} else
			System.out.println("Numero Invalido");
	
	sc.close();
	}
	
}
