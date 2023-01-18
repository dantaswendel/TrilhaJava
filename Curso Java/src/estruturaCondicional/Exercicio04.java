package estruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {

		int ini, fim;

		Scanner sc = new Scanner(System.in);

		ini = sc.nextInt();
		fim = sc.nextInt();

		if (fim > ini) {
			int duracao = fim - ini;
			System.out.printf("O jogo durou %d horas", duracao);
		} else {
			int duracao = 24 - ini + fim;
			System.out.printf("O jogo durou %d horas", duracao);
		}
		sc.close();
	}

}
