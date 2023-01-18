package estruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio06 {
public static void main(String[] args) {
	
	int x;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um numero");
	x= sc.nextInt();
	
	for(int i=1; i<=x; i++) {
		
		if(x%i==0 ) {
			System.out.println(i);
		}
		
	}
	sc.close();
}
}
