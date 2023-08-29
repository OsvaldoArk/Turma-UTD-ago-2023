package logicadeprogramacao.exerciciosModuloI;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite a primeira nota");
		Double nota01 = leitor.nextDouble();
		
		System.out.println("digite a segunda nota");
		Double nota02 = leitor.nextDouble();
		
		System.out.println("digite a terceira nota");
		Double nota03 = leitor.nextDouble();
		
		int peso01 = 4, peso02 = 5, peso03 = 6, somaPesos = peso01 + peso02 + peso03;
		
		double mediaPonderada = (nota01 * peso01 + nota02 * peso02 + nota03 * peso03)
					/ somaPesos;
		
		String resultado = mediaPonderada >= 6.0 ? "Aprovado" : "Reprovado";
		
		System.out.println(resultado+" nota: "+mediaPonderada );
	}
}
