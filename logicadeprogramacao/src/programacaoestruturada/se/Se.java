package programacaoestruturada.se;

//estrutura de decisão
public class Se {

	public static void main(String[] args) {

		int numero = 9; 
		
		if(numero % 2 == 0) 
			numero = (int) Math.pow(numero, 2);
		
		
		System.out.println(numero);
	}
}
