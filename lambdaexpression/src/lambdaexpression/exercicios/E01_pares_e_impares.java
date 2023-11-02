package lambdaexpression.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E01_pares_e_impares {

	public static void main(String[] args) {
		
		Arrays.asList(10, 30, 15, 25, 50, 40, 5).stream()
													.filter(x -> x % 2 != 0)
													.forEach(System.out::println);

		List<Integer> numeros = Arrays.asList(10, 30, 15, 25, 50, 40, 5);
		
		List<Integer> impares = numeros.stream().filter(numero -> numero % 2 != 0)
												.collect(Collectors.toList());
		
		for(Integer numero : impares) {
			System.out.println(numero);
		}
	}
}
