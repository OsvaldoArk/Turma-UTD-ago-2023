package lambdaexpression.exercicios;

import java.util.Arrays;
import java.util.List;


public class E06_lista_jogos {

	public record Jogo(String name,Double price) {};
	
	public static void main(String[] args) {
		
		/*
	    { name: 'Dark Souls III', price: 95.03 },
  		{ name: 'Shadow of the Tomb Raider', price: 101.19 },
  		{ name: 'Sekiro: Shadows Die Twice', price: 179.99 },
  		{ name: 'Resident Evil 2', price: 119.90 },
  		{ name: 'Death Stranding', price: 149.99 }
		 * */
		
		List<Jogo> jogos = Arrays.asList(
				new Jogo("Dark Souls III",95.03),
				new Jogo("Shadow of Tomb Raider",101.19),
				new Jogo("Sekiro: Shadows Die Twice",179.99),
				new Jogo("Resident Evil",119.90),
				new Jogo("Death Stranding",149.99));

		jogos.stream().map(x-> "-"+x.name+"\n").forEach(System.out::print);
		
	}

}
