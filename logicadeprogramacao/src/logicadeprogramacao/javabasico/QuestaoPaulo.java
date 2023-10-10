package logicadeprogramacao.javabasico;

import java.util.Scanner;

public class QuestaoPaulo {
/*
	Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo, calcule e
	mostre o salário a receber, seguindo estas regras:
	a) a hora trabalhada vale a metade do salário mínimo. 
	b) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada. 
	c) o imposto equivale a 3% do salário bruto. 
	d) o salário a receber equivale ao salário bruto menos o imposto.
*/
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o número de horas trabalhadas");
		double quantidadeHorasTrabalhadas = leitor.nextDouble();
		
		System.out.println("Digite o valor do salário mínimo");
		double minimo = leitor.nextDouble();
		
		double valorHorasTrabalhadas = minimo / 2;
		
		double salarioBruto = quantidadeHorasTrabalhadas * valorHorasTrabalhadas;
		
		double imposto = salarioBruto * 0.03;
		
		System.out.println(salarioBruto - imposto);
	}
}
