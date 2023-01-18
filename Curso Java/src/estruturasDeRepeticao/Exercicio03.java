package estruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio03 {
public static void main(String[] args) {
	
	
	int x;
	double a=0,b=0,c=0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um numero");
	x= sc.nextInt();
	
	for(int i=0 ; i<x; i++) {
		System.out.println("Digite 3 numero");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double media = (a*2+b*3+c*5)/10;
		
		System.out.printf("MEDIA %.1f \n", media);

	}
	
	sc.close();
}
}
