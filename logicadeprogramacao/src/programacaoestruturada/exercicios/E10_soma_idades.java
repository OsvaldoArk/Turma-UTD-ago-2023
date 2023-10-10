package programacaoestruturada.exercicios;

import java.util.LinkedHashMap;
import java.util.Map;

public class E10_soma_idades {

	public static void main(String[] args) {
		
		double[] idadesInput = {18, 10, 20, 5, 22};

		Map<String, Double> resultado = censoPessoas(idadesInput);
		
		for(Map.Entry<String, Double> valores : resultado.entrySet()) {
			System.out.println(valores.getKey()+" "+valores.getValue());
		}
	}
	
	public static Map<String,Double> censoPessoas(double idades[]){
		
		double soma=0, media = 0,contador=0;
		
		for(double idade : idades) {
			if(idade>=18) {
				soma+=idade;
				contador++;
			}
		}
		
		media = soma / contador;
		
		Map<String,Double> mapIdades = new LinkedHashMap<String,Double>();
		
		mapIdades.put("Soma",soma);
		mapIdades.put("Média", media);
		
		return mapIdades;
	}
}
