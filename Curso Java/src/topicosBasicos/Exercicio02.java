package topicosBasicos;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		double pi=3.14159;
		double raio;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio");
		
		raio = sc.nextDouble();
		
		double area= raio*raio*pi;
		
		System.out.printf("Area = %.4f",area);
				
		sc.close();
	}
}
