package logicadeprogramacao.javabasico;

import java.util.Scanner;

public class SelfService {

	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o peso do prato");
		double peso = terminal.nextDouble();
		
		double totalAPagarPelaRefeicao = (peso /1000) * 23;

		System.out.printf("Total a pagar %.2f: ",totalAPagarPelaRefeicao);
		
	}

}
