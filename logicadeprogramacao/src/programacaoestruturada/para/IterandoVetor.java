package programacaoestruturada.para;

public class IterandoVetor {

	public static void main(String[] args) {
		
		char vogais[] = {'a','e','i','o','u'};
		
		for(int indice=vogais.length-1;indice >= 0 ;indice--) {
			
			System.out.println(vogais[indice]);
		}
	}
}
