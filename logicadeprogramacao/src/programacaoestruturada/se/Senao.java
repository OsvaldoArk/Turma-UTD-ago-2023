package programacaoestruturada.se;

public class Senao {

	public static void main(String[] args) {

		int numero = 8; 
		
		if(numero % 2 == 0) 
			numero = (int) Math.pow(numero, 2);
		else 
			numero = (int) Math.pow(numero, 3);
			System.out.println(numero);
	}
}
