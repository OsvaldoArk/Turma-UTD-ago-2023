package programacaoestruturada.exercicios;

import java.util.Scanner;

public class E08_potencias {

	public static void main(String[] args) {
		int n = 0, m= 0;
		Scanner leitor = new Scanner(System.in);
		
			System.out.println("digite o primeiro número");
			n = leitor.nextInt();
			System.out.println("digite o segundo número");
			m = leitor.nextInt();
			
			if(m == 0 || m == 1 || m == -1) return;
			
			if(m<n) {
				int temp = n;
				n = m;
				m = temp;
			}	
			
			int contador = 1;
			
			while(true) {
				
				double resultado = Math.pow(n, contador);
					
				if(resultado > m) break;
				
				System.out.println((int)resultado);
				
				contador++;
			}
	
		leitor.close();

	}

}
