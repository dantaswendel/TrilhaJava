package estruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int x;
		int y=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {

		y=y*i;
		
		}
		System.out.println("RESULTADO = "+ y);

		sc.close();
	}
}
