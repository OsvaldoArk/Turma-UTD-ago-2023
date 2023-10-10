package logicadeprogramacao.javabasico;

import java.util.Scanner;

public class LojaDeCamisas {

	public static void main(String[] args) {
		
		Scanner reg = new Scanner(System.in);
		
		System.out.println("Digite o preço de venda da camisa tamanho P");
		double precoP = reg.nextDouble();

		System.out.println("Digite o valor de custo da camisa tamanho P");
		double custoP = reg.nextDouble();
		
		System.out.println("Digite o preço de venda da camisa tamanho M");
		double precoM = reg.nextDouble();

		System.out.println("Digite o valor de custo da camisa tamanho M");
		double custoM = reg.nextDouble();
		
		System.out.println("Digite o preço de venda da camisa tamanho G");
		double precoG = reg.nextDouble();

		System.out.println("Digite o valor de custo da camisa tamanho G");
		double custoG = reg.nextDouble();
		
		System.out.println("Digite a quantidade de camisas vendidas do tamanho P");
		double quantidadeP = reg.nextDouble();
		
		System.out.println("Digite a quantidade de camisas vendidas do tamanho M");
		double quantidadeM = reg.nextDouble();
		
		System.out.println("Digite a quantidade de camisas vendidas do tamanho G");
		double quantidadeG = reg.nextDouble();

		double totalVenda = precoP * quantidadeP + precoM * quantidadeM + precoG * quantidadeG;
		
		double totalCusto = custoP * quantidadeP + custoM * quantidadeM + custoG * quantidadeG;
		
		double totalLucro = totalVenda - totalCusto;
		
		System.out.println("Total de vendas: "+totalVenda);
		
		System.out.println("Custos totais: "+totalCusto);
		
		System.out.println("Lucro total mês: "+totalLucro);
		
		reg.close();
		
		
		
	}
}
