package exercicio01;

import java.util.Scanner;
import exercicio01.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo x = new Retangulo();
		
		x.largura = sc.nextDouble();
		x.altura = sc.nextDouble();
		
		System.out.println(x.area());
		System.out.println(x.perimetro());
		System.out.println(x.diagonal());
		
		sc.close();
	}
}
