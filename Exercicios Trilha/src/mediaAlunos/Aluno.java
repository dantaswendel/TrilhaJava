package mediaAlunos;

public class Aluno {

	public String nome;
	
	
	public double media(double x, double y, double w, double z) {
		
		double media = (x+y+w+z)/4;
		return media;
	}
	
	
	public String resultado(double media) {
		
		if ( media>= 5) {
	return "APROVADO";
		}
		else {
			return "REPROVADO";
		}
	}
}

