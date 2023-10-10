package programacaoestruturada.enquanto;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
	
		int cont = 0;
		
		boolean executa = true;
		
		char continua = 's';
		
		Scanner leitor = new Scanner(System.in);
		
		while(executa){
			
			System.out.println(++cont);
			
			System.out.println("deseja continuar? s/n");
			continua = leitor.nextLine().charAt(0);
			
			if(continua == 'n') {
				executa = false;
				//break;
			}else if(continua == 's') {
				System.out.println("continua");
			}else {
				System.out.println("opção inválida");
			}
		}
		System.out.println("parou");
	}
}
