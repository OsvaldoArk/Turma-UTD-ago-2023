package pradroesdeprojeto.builder;

import java.time.LocalDate;
import java.time.Month;

public class Escola {

	public static void main(String[] args) {
		
		/*				
		Matricula m01 = new Matricula(1124L,a01,r01);
		
		System.out.println(m01);
		*/
		
		LocalDate d01 = LocalDate.of(2016, Month.FEBRUARY, 3);
		
		LocalDate d02 = LocalDate.of(2002, Month.JUNE, 29);
		
		Aluno a01 = new Aluno("Rafael",d01,"4º ano","manhã"); 

		ResponsavelFinanceiro r01 = new ResponsavelFinanceiro("Lícia", d02, "(85)999787844","Papicu");

		Matricula m03 = new MatriculaBuilder()
									.setMatricula(1478L)
									.setSituacao(false)
									.setAluno("Luana", d01, "5ª série", "manhã")
									.setResponsavel("Jussara", d02, "(85)979457945", "Icaraí")
									.build();
		
		Matricula m02 = new Matricula(9987L,
						new Aluno("Rafael",d01,"4º ano","manhã"),
						new ResponsavelFinanceiro("Lícia", d02, "(85)999787844","Papicu"));

		
		System.out.println(m03);
		
	}

}
