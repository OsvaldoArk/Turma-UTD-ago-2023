package lambdaexpression.exercicios;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class E04_filmes_do_tarantino {

	public record Filme(String nome,LocalDate release) {};
	
	public static void main(String[] args) {
		
	List<Filme> filmes = Arrays.asList(new Filme("Bastardos Inglorios",LocalDate.of(2009, Month.JANUARY, 1)),
									   new Filme("Pulp fiction",LocalDate.of(1994, Month.JANUARY, 1)),
									   new Filme("Kill Bill Volume 2",LocalDate.of(2004, Month.JANUARY, 1)),
									   new Filme("Quatro Quartos",LocalDate.of(1995, Month.JANUARY, 1)),
									   new Filme("Sin City",LocalDate.of(2005, Month.JANUARY, 1)),
									   new Filme("Era uma Vez em... Hollywood",LocalDate.of(2019, Month.JANUARY, 1)),
									   new Filme("Djando Livre",LocalDate.of(2012, Month.JANUARY, 1)),
									   new Filme("Cães de Aluguel",LocalDate.of(1992, Month.JANUARY, 1)),
									   new Filme("À prova de morte",LocalDate.of(2007, Month.JANUARY, 1)),
									   new Filme("Kill Bill Volume 1",LocalDate.of(2003, Month.JANUARY, 1)));
		
	filmes.stream().filter(filme -> filme.release.getYear() < 2010 ).forEach(System.out::println);
	
	}

}
