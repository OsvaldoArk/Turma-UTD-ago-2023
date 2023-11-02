package lambdaexpression.highorder;

import java.util.Arrays;
import java.util.List;

public class ImplementandoReduce {

	public static void main(String[] args) {
	/*
		List<Integer> numeros = Arrays.asList(2,3,4,5,6,7,8);
		
		int somatorio = numeros.stream().reduce((numero,soma) -> soma += numero).get();
		System.out.println(somatorio);
		*/
		List<String> lista = Arrays.asList("um","dois","três");
		
		String resultado = lista.stream().reduce("",(frase,item)-> frase.concat(item+" "));
		
		System.out.println(resultado);
	}
}
