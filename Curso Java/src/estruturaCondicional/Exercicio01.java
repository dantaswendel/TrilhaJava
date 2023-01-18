package estruturaCondicional;

import java.util.Scanner;

public class Exercicio01 {
public static void main(String[] args) {
	
	int x;
	
	Scanner sc = new Scanner(System.in);
	
	x= sc.nextInt();
	
	if(x==0) {
		System.out.println("ZERO");		
			}else if(x<0) {
				System.out.println("NEGATIVO");
			}else if (x>0) {
				System.out.println("POSITIVO");
			}
	
	sc.close();
}
}
