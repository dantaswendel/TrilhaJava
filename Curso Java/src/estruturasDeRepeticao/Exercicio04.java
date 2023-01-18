package estruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		x = sc.nextInt();
		
		for(int i=0; i<x; i++) {
			
			double a,b;
			System.out.println("Digite dois numeros");
			a=sc.nextDouble();
			b = sc.nextDouble();
			
			if(b!=0) {
				
				double c = a/b;
				System.out.printf("%.1f \n", c);
			}else System.out.println("Divisao impossivel");

			
		}
		
		sc.close();
	}
	
}
