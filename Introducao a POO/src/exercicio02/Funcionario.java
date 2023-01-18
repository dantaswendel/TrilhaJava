package exercicio02;

public class Funcionario {

	public String name;
	public double salarioBruto;
	public double imposto;
	
	
	public double salarioLiquido() {
		  
		 return salarioBruto - imposto;
	}
	
	public void incremento(double porcentagem) {
		
		salarioBruto += (salarioBruto *porcentagem)/100;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Nome: "
				+name 
				+ "Salario Liquido: "
				+ salarioLiquido()
				+ "Imposto: "
				+imposto;
	}
}
