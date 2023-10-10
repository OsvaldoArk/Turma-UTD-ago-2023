package programacaoestruturada.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class E10_segunda_parte {

	public static void main(String[] args) {
		//18, 10, 20, 5, 22
		Scanner leitor = new Scanner(System.in);
		
		List<Double> idades = new ArrayList<>();
		
		boolean continua = true;
		
		while(continua) {
			
			System.out.println("digite um número");
			double numero = leitor.nextDouble();
			
			idades.add(numero);
			
			System.out.println("você deseja digitar mais uma idade?");
			continua = leitor.nextBoolean();
		}
		
		double[] arrayDouble = deListaParaArray(idades);
		
		Map<String, Double> resultado = E10_soma_idades.censoPessoas(arrayDouble);
		
		for(Map.Entry<String, Double> valores : resultado.entrySet()) {
			System.out.println(valores.getKey()+" "+valores.getValue());
		}
	}
	
	public static double[] deListaParaArray(List<Double> lista) {
		
		double[] array = new double[lista.size()];
		
		for(int contador = 0; contador<lista.size(); contador++) {
			array[contador] = lista.get(contador);
		}
		
		return array;
	}
}
