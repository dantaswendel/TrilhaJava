package topicosBasicos;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int c1 , c2 , n1 , n2;
		double vu1,vu2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Codigo da peca 1");
		c1 = sc.nextInt();
		
		System.out.println("Digite o numero de pecas 1");
		n1 = sc.nextInt();
		
		System.out.println("Digite o valor unitario da pecas 1");
		vu1 = sc.nextDouble();
		
		System.out.println("__________________________");

		System.out.println("Digite o Codigo da peca 2");
		c2 = sc.nextInt();
		
		System.out.println("Digite o numero de pecas 2");
		n2 = sc.nextInt();
		
		System.out.println("Digite o valor unitario da pecas 2");
		vu2 = sc.nextDouble();
		
		double vap= vu1*n1 +vu2*n2;
		
		System.out.printf("Valor a Pagar %.2f", vap);
		
		sc.close();
		
	}
}
