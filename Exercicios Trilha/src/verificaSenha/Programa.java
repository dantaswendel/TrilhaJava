package verificaSenha;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String senha = "123ABC";

		System.out.println(" Digite a senha");

		String senhadigitada = sc.next();

		while (!senha.equals(senhadigitada)) {

			System.out.println("Acesso Negado.TENTE NOVAMENTE");

			senhadigitada = sc.next();
			
			
		}
		System.out.println("Acesso Permitido");

		sc.close();
	}
}
