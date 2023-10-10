package logicadeprogramacao.vetores;

import java.util.Scanner;

public class VetorDinamicoEntreAspas {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o número de notas que será informado");
		int tamanhoVetor = leitor.nextInt();
		
		int notas[] = new int[tamanhoVetor];
		
		notas[0] = 3;
		notas[1] = 6;
		notas[2] = 9;
		
		System.out.printf("O vetor tem %d espaços para serem utilizados",notas.length);
		
	}
}
