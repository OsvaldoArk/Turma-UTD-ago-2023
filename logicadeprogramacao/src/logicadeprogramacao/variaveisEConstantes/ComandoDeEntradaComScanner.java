package logicadeprogramacao.variaveisEConstantes;

import java.util.Scanner;

public class ComandoDeEntradaComScanner {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite seu nome");
		
		String nome = leitor.next();	
		
		System.out.println("digite sua idade");
		
		int idade = leitor.nextInt();
		
		System.out.println("Olá "+nome+" você tem "+idade+" anos de idade.");
	}
}
