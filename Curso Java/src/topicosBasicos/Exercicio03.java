package topicosBasicos;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		int a, b, c, d, diferenca;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 4 numeros");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		diferenca = (a*b)- (c*d);
		
		System.out.println();
		System.out.println("DIFERENCA=" + diferenca );
		
		sc.close();

	}
}
