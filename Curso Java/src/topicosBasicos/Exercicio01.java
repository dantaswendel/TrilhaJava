package topicosBasicos;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Digite um numero");
		x = sc.nextInt();
		System.out.println( "Digite outro numero");
		y = sc.nextInt();
		
		int soma = x+y;
		
		System.out.println("SOMA = " + soma );
		
		sc.close();
	}

}
