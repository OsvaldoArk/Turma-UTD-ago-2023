package programacaoestruturada.para;

public class BubbleSort {

	public static void main(String[] args) {
		
		int numeros[] = {45,3,61,100,1,50,28};
		
		sort(numeros);
		
		for(int contador=0;contador<numeros.length;contador++) {
			System.out.println(numeros[contador]);
		}
	}
	
	public static int[] sort(int numeros[]){
		
		for(int atual = 0;atual<numeros.length; atual++) {
			
			for(int proximo=atual+1;proximo<numeros.length;proximo++) {
				if(numeros[atual]>numeros[proximo]) {
					int temp = numeros[atual];
					
					numeros[atual] = numeros[proximo];
					
					numeros[proximo] = temp;
				}
			}
		}
		
		return numeros;
	}
	
	public static int[] sortInverso(int numeros[]){
		
		for(int atual = 0;atual<numeros.length; atual++) {
			
			for(int proximo=atual+1;proximo<numeros.length;proximo++) {
				if(numeros[atual]<numeros[proximo]) {
					int temp = numeros[atual];
					
					numeros[atual] = numeros[proximo];
					
					numeros[proximo] = temp;
				}
			}
		}
		
		return numeros;
	}
	
	public static String paraString(int numeros[]) {
		String resultado = "";
		
		for(int contador=0;contador<numeros.length;contador++) {
			resultado.concat(String.valueOf(numeros[contador])+",");
			System.out.println(numeros[contador]);
		}
		
		return resultado;
	} 
}
