package estruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		int x;
		int s = 0, n = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");

		x = sc.nextInt();

		for (int i = 0; i < x; i++) {

			int y = sc.nextInt();

			if (y >= 10 && y >= 20) {

				s++;
			} else {
				n++;
			}

		}
		System.out.println(s + "Estao dentro");
		System.out.println(n + "Estao fora");

		sc.close();
	}
}
