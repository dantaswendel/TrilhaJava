package estruturaCondicional;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("Primeiro Quadrante");
		} else if (x < 0 && y > 0) {
			System.out.println("Segundo Quadrante");
		} else if (x < 0 && y < 0) {
			System.out.println("Terceiro Quadrante");
		} else if (x > 0 && y < 0) {
			System.out.println("Quarto quadrante");
		} else if (x == 0 && y == 0) {
			System.out.println("ORIGEM");
		} else if (x == 0 && y != 0) {
			System.out.println("Sob eixo x");
		} else if (y == 0 && x != 0) {
			System.out.println("Sob eixo y");
		}

		sc.close();
	}
}
