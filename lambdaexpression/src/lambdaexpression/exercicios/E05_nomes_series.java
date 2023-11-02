package lambdaexpression.exercicios;

import java.util.Arrays;
import java.util.List;

public class E05_nomes_series {

	public record Serie(String name, Integer releaseYear) { public String getName(){ return this.name; }};
	
	public static void main(String[] args) {
		
		List<Serie> series = Arrays.asList(
											new Serie("Breaking Bad",2008),
											new Serie("Mr. Robot",2015),
											new Serie("True Dectetive",2014),
											new Serie("Hannibal",2013),
											new Serie("The Handmaid\'s Tale",2017),
											new Serie("House M. D.",2004),
											new Serie("Watchmen",2019));
	
		series.stream().map(x-> x.getName())
						.filter(nome -> nome.toLowerCase().contains("b"))
						.forEach(System.out::println);
	}
}
