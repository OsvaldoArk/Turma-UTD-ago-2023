package lambdaexpression.highorder;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImplementandoFilter {

	private static Predicate<Integer> pares(){
		return x -> x % 2 == 0;
	};
	
	private static Predicate<Integer> impares(){
		return x -> x % 2 != 0;
	};
	
	public static void main(String[] args) {
	/*
		List<String> itens = Arrays.asList("sabão","amaciante","detergente","shampoo");
		
		List<String> banho = itens.stream().filter(item -> item.equals("shampoo") || item.equals("sabão")).collect(Collectors.toList());
		
		banho.stream().forEach(item -> System.out.println(item));
	*/
		
	List<Integer> numeros = Arrays.asList(2,3,4,5,6,7,8);
	
	List<Integer> pares = numeros.stream().filter(pares()).collect(Collectors.toList());
	
	List<Integer> impares = numeros.stream().filter(impares()).collect(Collectors.toList());
	
	System.out.println("pares");	
	pares.stream().forEach(System.out::println);
	
	System.out.println("ímpares");
	impares.stream().forEach(System.out::println);

	
	}
}
