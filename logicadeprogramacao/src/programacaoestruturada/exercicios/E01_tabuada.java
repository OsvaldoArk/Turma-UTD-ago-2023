package programacaoestruturada.exercicios;

public class E01_tabuada {
	//1ª fazer a tabuada de divisão.
	//2ª trocar as estruturas while por for
	public static void main(String[] args) {
		
		int contador = 1, numero = 1;
		
		while(contador <= 10) {
		
			while(numero <= 10) {
				System.out.println(contador+" x "+numero+" = "+(contador*numero));
				numero++;
			}
			System.out.println("------------------------------");
			numero = 0;
			contador++;
		}
	}
}
