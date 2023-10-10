package logicadeprogramacao.javabasico;

import java.util.Scanner;

public class Porcentagem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double valor = scan.nextDouble();		
		
		System.out.println(valor+= valor*0.05);
		
		scan.close();

	}

}
