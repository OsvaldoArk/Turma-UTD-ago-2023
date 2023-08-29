package logicadeprogramacao.exerciciosModuloI;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

//Questão de Idade
public class E02 {

	public static void main(String[] args) {
		int idadeAnos = 25, idadeMeses = 10, idadeDias = 2;
		
		double idadeSomenteEmDias = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;
		
		LocalDate aniversario = LocalDate.of(1997, Month.OCTOBER, 26);
		
		long dias = aniversario.until(LocalDate.now(), ChronoUnit.DAYS);
		
		System.out.println("meu cálculo: "+idadeSomenteEmDias);
		
		System.out.println("tempo real: "+dias);
	}
}
