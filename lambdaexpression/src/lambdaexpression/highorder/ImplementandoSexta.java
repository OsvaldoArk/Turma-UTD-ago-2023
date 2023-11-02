package lambdaexpression.highorder;

import java.util.Arrays;
import java.util.List;

public class ImplementandoSexta {

	static int soma = 0;

	public static void main(String[] args) {
	
		List<Integer> numeros = Arrays.asList(2,3,4,5,6);
		
		//numeros.stream().forEach(numero -> System.out.println(numero));	
		
		numeros.stream().forEach(System.out::println);
	}
}
