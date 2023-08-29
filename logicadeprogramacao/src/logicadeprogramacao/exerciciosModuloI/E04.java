package logicadeprogramacao.exerciciosModuloI;

import java.util.Scanner;
/*
 	Dona Maria foi comprar uma bolsa. As formas de pagamento que eram oferecidas
	foram:
	a. A vista com 10% de desconto
	b. Parcelado em 1+2 vezes sem desconto
	c. Dividido em 10 vezes com juros de 5% sobre o valor total
 */
public class E04 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto");
		double valor = leitor.nextDouble();
		
		double aVista = valor - (valor*0.1);
		
		double parcelado03 = valor, parcela03 = valor/3;
		
		double parcelado10 = valor + (valor*0.05), parcela10 = parcelado10/10;

		System.out.println("à vista: "+aVista+" uma parcela: "+aVista);
		
		System.out.printf("parcelado em três: %.2f três parcelas: %.2f\n",parcelado03,parcela03);
		
		System.out.printf("parcelado em dez: %.2f dez parcelas: %.2f\n",parcelado10,parcela10);	
	}
}
