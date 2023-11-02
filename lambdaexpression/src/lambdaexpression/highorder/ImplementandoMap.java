package lambdaexpression.highorder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImplementandoMap {
	static int cont = 0;

	public static void main(String[] args) {
		/*
		List<Integer> numeros = Arrays.asList(2,3,4,5,6,7);
		
		List<Double> nova = numeros.stream().map(variavel -> Math.pow(variavel, 2)).collect(Collectors.toList());

		nova.stream().forEach(System.out::println);
		
		numeros.stream().forEach(x-> System.out.println(x));
		*/
		/*
		List<String> itens = Arrays.asList("sabão","amaciante","detergente","shampoo");
		
		
		List<String> resultado = itens.stream().map(item ->{ 
			cont++;
			
			return cont+" - "+item;
			
		}).collect(Collectors.toList());
		
		resultado.stream().forEach(System.out::println);
		*/
        List<String> produtos = Arrays.asList("sabão", "shampoo", "amaciante", "detergente");

        List<String> selecionados = IntStream.range(0, produtos.size())
            .filter(i -> i == 0 || i == 2) // índices 0 e 2
            .mapToObj(produtos::get)
            .collect(Collectors.toList());
		
        selecionados.stream().forEach(System.out::println);
        
	}

}
