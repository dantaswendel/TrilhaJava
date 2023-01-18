package exercicio01;

public class Retangulo {

	public double altura;
	public double largura;
	
	public double area() {
		
		return altura*largura;
	}
	public double perimetro() {
		return largura*2 + altura*2;
	}
	public double diagonal() {
		return Math.sqrt(altura*altura+largura*largura);
	}
}
