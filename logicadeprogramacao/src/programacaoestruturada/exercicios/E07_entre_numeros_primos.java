package programacaoestruturada.exercicios;

import java.util.Scanner;

public class E07_entre_numeros_primos {

	public static void main(String[] args) {
	
		
		int n = 0, m= 0;
		Scanner leitor = new Scanner(System.in);
		
		do {
			System.out.println("digite o primeiro número");
			n = leitor.nextInt();
			System.out.println("digite o segundo número");
			m = leitor.nextInt();
			
			if(m<n) {
				int temp = n;
				n = m;
				m = temp;
			}	
			
			int contador = n;
			
			while(contador <= m) {
				
				if(E05_primo.ehPrimo(contador)) System.out.println(contador);
				
				contador++;
			}
		}while(n>1 && m>1);
	
		System.out.print("terminou a execução");
		leitor.close();
	}
}
