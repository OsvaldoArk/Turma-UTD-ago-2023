package programacaoestruturada.exercicios;

public class E05_primo {

	public static void main(String[] args) {
	
		System.out.println(ehPrimo(20));
	}
	
	public static boolean ehPrimo(int numero) {
		int contador = 1,divisores = 0;
		
		while(contador<=numero) {
			if(numero % contador == 0) {
				divisores++;
			}
			contador++;
		}
		
		//System.out.println("número de divisores: "+divisores);
		
		return divisores == 2;
	}
}
