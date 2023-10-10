package logicadeprogramacao.javabasico;

import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double salario = leitor.nextDouble();
		
		double salarioMinimoQtd = salario / 788.0;
		
		System.out.printf("Você ganhar %.2f salários minimos", salarioMinimoQtd);

	}

}
