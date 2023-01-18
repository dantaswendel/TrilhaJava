package estruturaCondicional;

import java.util.Scanner;

public class Exercico08 {
public static void main(String[] args) {
	
	
Scanner sc = new Scanner(System.in);
	
	double renda = sc.nextDouble();
	double ir=0;
	
	if(renda >0 && renda <=2000.00) {
		System.out.println("ISENTO");
	}else if (renda >2000 && renda <= 3000) {
		ir= (renda-2000)*0.08;
		System.out.printf("R$ %.2f", ir);
	}else if (renda >3000 && renda <= 4500) {
		ir= ((renda-3000)*0.18)+80;
		System.out.printf("R$ %.2f", ir);
	} else if(renda >4500) {
		ir = ((renda-4500)*0.28)+80+ (1500*0.18);
		System.out.printf("R$ %.2f", ir);
	}
	
	sc.close();
}
	
	
	}
