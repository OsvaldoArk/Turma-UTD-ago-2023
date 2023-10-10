package programacaoestruturada.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapChaveValor {

	public static void main(String[] args) {
		
		//List<String> alunos = new ArrayList<>(); //LinkedList<>();
		
		Map<String,Double> alunosNota = new HashMap<>(); //LinkedHashMap TreeMap
		
		alunosNota.put("João", 9.0);
		alunosNota.put("Joana", 10.0);
		alunosNota.put("Tiago", 9.5);
		alunosNota.put("Sara", 9.0);
		alunosNota.put("Jéssica", 7.0);
		//alunosNota.put("Sara", 3.0);
		
		List<Map.Entry<String, Double>> alunosOrganizado = new LinkedList<>();
		
		alunosOrganizado.addAll(alunosNota.entrySet());
		
		Collections.sort(alunosOrganizado,new Comparator<Map.Entry<String, Double>>(){
			
			public int compare(Map.Entry<String, Double> aluno01, Map.Entry<String, Double> aluno02) {
				
				return (aluno02.getValue()).compareTo(aluno01.getValue());
			}
		});
		
		//System.out.println(alunosOrganizado.toString());
		/*
		for(String chave : alunosNota.keySet()) {
			System.out.println(chave+" "+alunosNota.get(chave));
		}
		for(Map.Entry<String, Double> aluno : alunosNota.entrySet()) {
			System.out.println(aluno.getKey()+" "+aluno.getValue());
		}
		*/
		//System.out.println(alunosNota.toString());
	}

}
