package whileExercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int x, y ;
		
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		y = sc.nextInt();
		
		while(x!=0 && y!=00) {
			
			
			if (x>0 && y>0) {
				System.out.println("Primeiro Quadrante");
			}else if(x<0&&y>0) {
				System.out.println("Segundo Quadrante");
			}else if(x<0&&y<0) {
				System.out.println("Terceiro Quadrante");
			}else if(x>0&&y<0) {
				System.out.println("Quarto quadrante");
			}
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
		sc.close();
	}
	
	
}
