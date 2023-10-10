package programacaoestruturada.para;

import java.util.Scanner;

public class ForMelhoradoExercicio {

	public static void main(String[] args) {
		
		int vetor[] = {37,2,55,87,26};
		
		Scanner leitor = new Scanner(System.in);
		
		boolean estaNaLista = false;
		
		int escolhido = leitor.nextInt();
		
		for(int numero : vetor) {
			if(numero != escolhido) {
				System.out.println(numero);
			}else {
				estaNaLista = true;
				break;
			}
		}
		if(estaNaLista)
			System.out.println("o número "+escolhido+" se encontra na lista");
		else
			System.out.println("o número "+escolhido+" não se encontra na lista");
	}
}
