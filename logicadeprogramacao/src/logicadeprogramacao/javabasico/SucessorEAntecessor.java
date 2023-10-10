package logicadeprogramacao.javabasico;

import java.util.Scanner;

public class SucessorEAntecessor {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número");
		
		int numero = leitor.nextInt();
		/*
		System.out.println("antecessor: "+--numero);
		
		numero++;
		
		System.out.println("suscessor: "+(++numero));
		*/
		System.out.println("antecessor: "+(numero-1));
		
		System.out.println("suscessor: "+(numero+1));
	}
}
