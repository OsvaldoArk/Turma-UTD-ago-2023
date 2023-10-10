package programacaoestruturada.exercicios;

import java.util.Scanner;

public class E09_progressao_aritmetica {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro termo da P.A.");
		int primeiroTermo = leitor.nextInt();
		
		System.out.println("Digite a razão da P.A.");
		int razaoDeProgressao = leitor.nextInt();
		
		System.out.println("Digite a quantidade de números a serem mostrados");
		int quantidade = leitor.nextInt();
		
		int[] resposta = 
				mostraElementosDaProgressaoAritmetica(primeiroTermo, razaoDeProgressao, quantidade);
		
		for(int numero : resposta) {
			System.out.println(numero);
		}
		
		leitor.close();
	}

	public static int[] mostraElementosDaProgressaoAritmetica(int a1, int razao, int n) {
		
		int progressao[] = new int[n];
		
		for(int contador = 1; contador<= progressao.length;contador++) {
			
			progressao[contador-1] = a1 + (contador-1)*razao;
		}
	
		return progressao;
	}
}
