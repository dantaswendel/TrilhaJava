package estruturaCondicional;

import java.util.Scanner;

public class Exercicio05 {
public static void main(String[] args) {
	
	int codigo, qtd;
	double preco = 0;
	Scanner sc = new Scanner(System.in);
	
	codigo = sc.nextInt();
	qtd = sc.nextInt();
	
	if(codigo==1) {
		preco=4.00;
	}else if(codigo==2) {
		preco=4.50;
	}else if(codigo==3) {
		preco=5.00;
	}else if(codigo==4)
	preco=2.00;
	else if(codigo==5) {
		preco=1.50;
	}
	
	double vf = qtd * preco ;
	
	System.out.printf("Total: %.2f", vf);
	
	sc.close();
}
}
