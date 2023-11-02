package lambdaexpression.exercicios;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class E07_periodo_de_tempo {

	public record Consulta(String medico, LocalDate data){};
	
	public static void main(String[] args) {
		
		List<Consulta> consultas = Arrays.asList(
				new Consulta("Dra. Melissa",LocalDate.of(2022, Month.OCTOBER, 2)),
				new Consulta("Dra. Sara",LocalDate.of(2021, Month.OCTOBER, 10)),
				new Consulta("Dr. João",LocalDate.of(2023, Month.OCTOBER, 8)),
				new Consulta("Dra. Alice",LocalDate.of(2023, Month.OCTOBER, 20)),
				new Consulta("Dr. Paulo",LocalDate.of(2023, Month.OCTOBER, 25)));
		
		LocalDate inicio = LocalDate.of(2022, Month.OCTOBER, 2);
		LocalDate fim = LocalDate.of(2023, Month.OCTOBER, 8);
		
		
		consultas.stream()
				.filter(c-> c.data.isAfter(inicio) && c.data.isBefore(fim) || c.data.isEqual(inicio) || c.data.isEqual(fim))
				.forEach(System.out::println);
	}

}
