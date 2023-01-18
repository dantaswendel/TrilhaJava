package positivoOuNegativo;

import java.util.Scanner;

public class Programa {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um numero");
	int numero = sc.nextInt();
	
	if(numero == 0) {
		System.out.println("o numero eh Zero");
	} else if (numero >0) {
		System.out.println("O numero eh positivo");
	}else if (numero<0) {
		System.out.println("O numero eh negativo");
	}
	
	sc.close();
}
}
