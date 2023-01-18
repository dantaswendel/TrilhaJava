package estruturaCondicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int x,y;
		
		Scanner sc = new Scanner(System.in);
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x%y==0 || y%x==0) {
			System.out.println("SAO MULTIPLOS");
		} else {
			System.out.println("NÃO SAO MULTIPLOS");
		}
	
	sc.close();
	}
}
