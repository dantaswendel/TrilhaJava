package topicosBasicos;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		double a, b, c, pi = 3.14159;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os valores de A,B,C,D");

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double triangulo = (a * c)/2;
		double circulo = pi * c * c;
		double trapezio = ((a + b) * c) / 2;
		double quadrado = b * b;
		double retangulo = a * b;
		
		System.out.printf("TRIANGULO = %.3f \n" , triangulo);
		System.out.printf("CIRCULO = %.3f \n" , circulo);
		System.out.printf("TRAPEZIO = %.3f \n" , trapezio);
		System.out.printf("QUADRADO = %.3f \n" , quadrado);
		System.out.printf("TRIANGULO = %.3f \n" , triangulo);
		System.out.printf("RETANGULO %.3f \n" , retangulo);

		sc.close();



	}
}