package programacaoestruturada.exercicios;

public class E03_fatorial_for {

	public static void main(String[] args) {
		
		System.out.println(fatorial(6));
	}
	
	public static int fatorial(int numero) {
		int resultado = 1;
		for(int contador= 1; contador <= numero; contador++) {
			resultado*=contador;
		}
		return resultado;
	}
}
