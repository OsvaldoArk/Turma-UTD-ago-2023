package logicadeprogramacao.variaveisEConstantes;

public class ComandosDeSaida {

	public static void main(String[] args) {
	
		String nome = "Osvaldo";
		
		int idade = 36;
		
		float peso = 81;
		
		double altura = 1.63;
		
		char tipoSanguineo = 'A';
		
		char fatorRH = '+';
		
		boolean isDoadorDeSangue = true;
		
		System.out.printf("nome: %s\n",nome);
		
		System.out.printf("idade: %d\n",idade);
		
		System.out.printf("peso: %.2f\n",peso);
		
		System.out.printf("altura: %.2f\n",altura);
		
		System.out.printf("tipo sanguineo: %c%c\n",tipoSanguineo,fatorRH);
		
		System.out.printf("doador de sangue %b\n",isDoadorDeSangue);
	}
}
