package exercicio02;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite o nome do funcionario");
		funcionario.name = sc.next();
		System.out.println("Digite o salario bruto do  funcionario");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.println("Digite o imposto cobrado desse funcionario");
		funcionario.imposto = sc.nextDouble();
		
				
		System.out.println(funcionario.toString());
		
		System.out.println("Digite a porcentagem de incremento");
		
		double incremento = sc.nextDouble();
		
		funcionario.incremento(incremento);
		
		System.out.println(funcionario.toString());

	}
	
}
