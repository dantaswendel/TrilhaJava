package mediaAlunos;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Digite o nome do aluno");
		aluno.nome = sc.next();

		System.out.println("Digite as notas do aluno");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		System.out.println("Nome: " +aluno.nome);
		System.out.println("A media do aluno eh: " + aluno.media(a, b, c, d));
		System.out.println("O aluno foi, " + aluno.resultado(aluno.media(a, b, c, d)));

		
		sc.close();
	}
}
