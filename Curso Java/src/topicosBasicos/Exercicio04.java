package topicosBasicos;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		int numero, horas;
		double valor;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Numero do funcionario");
		numero = sc.nextInt();

		System.out.println("Digite a quantidade de horas trabalhadas");
		horas = sc.nextInt();

		System.out.println("Digite o valor pago por hora");
		valor = sc.nextDouble();

		double salario = valor * horas;
		System.out.println();

		System.out.println("Funcionario Numero " + numero);
		System.out.printf("Salario= R$ %.2f ", salario);
		
		sc.close();
	}
}
