package logicadeprogramacao.javabasico;

public class CalculoAlturaDoPredio {

	public static void main(String[] args) {
		
		double minhaAltura = 1.63, tamanhoMinhaSombra = 0.25,
				alturaPredio = 0, tamanhoSombraPredio = 4.5;

		alturaPredio = minhaAltura / tamanhoMinhaSombra * tamanhoSombraPredio;
		
		System.out.println(alturaPredio);
		
		/*
		 * 
		 *   o     p
		 *  --- = ---- == p * so = o * sp => o * sp
		 *  so     sp                       ---------
		 *                                     so 
		 * */
	}
}
