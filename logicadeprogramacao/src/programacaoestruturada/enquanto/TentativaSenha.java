package programacaoestruturada.enquanto;

import java.util.Scanner;

public class TentativaSenha {

	public static void main(String[] args) {
		
		String senha = "";
		
		int tentativa = 0;
		
		Scanner leitor = new Scanner(System.in);
		/*
		while(tentativa>0) {
			
			System.out.println("Digite a sua senha");
			senha = leitor.next();
			
			if(senha.equals("12345")) {
				System.out.println("usuário logado");
				break;
			}
			
			if(tentativa-1 == 0) break;
			
			System.out.println("Você tem : "+(--tentativa)+" restantes");
		}
		
		System.out.println("sistema bloqueado! Entrar em contato com a manutenção");
		*/
		
		do {
			System.out.println("Digite a sua senha");
			senha = leitor.next();
			
			if(senha.equals("12345")) {
				System.out.println("usuário logado");
				break;
			}
			
			if(tentativa-1 == 0) { 
				System.out.println("sistema bloqueado");
				break;
			}
			
			System.out.println("Você tem : "+(--tentativa)+" restantes");
		}while(tentativa > 0);
	}

}
