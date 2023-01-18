package whileExercicios;

import java.util.Scanner;

public class Exercicio03 {
public static void main(String[] args) {
	
	int x;
	int a=0,g=0,d=0;
	Scanner sc = new Scanner(System.in);
	
	x=sc.nextInt();
	
	while( x!=4) {
		
		if(x==1) {
			
			a++;
		}else if(x==2){
			g++;
		}else if (x==3) {
			d++;
		}
		x=sc.nextInt();

	}
	System.out.println("MUITO OBRIGADO");
	System.out.println("ALCOOL: "+a);
	System.out.println("GASOLINA: "+g);
	System.out.println("DIESEL: " +d);
	
	sc.close();
}
}
