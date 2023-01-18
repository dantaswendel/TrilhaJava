package estruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		int x;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		x = sc.nextInt();

		for (int i = 1; i <= x; i++) {

			System.out.print(i+ " ");
			System.out.print(i * i+ " ");
			System.out.print(i * i * i);
			System.out.println();

		}
	}
}
