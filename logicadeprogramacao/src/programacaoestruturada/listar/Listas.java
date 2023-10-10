package programacaoestruturada.listar;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		List<String> alunos = new ArrayList<>();
		
		alunos.add("Laura");
		alunos.add("Júlio");
		alunos.add("Bruce Wayne");
		//alunos.remove("laura");
		
		alunos.sort(null);
		
		//alunos.clear();
		
		//System.out.println(alunos.contains("Júlio"));
	
		//System.out.println(alunos.get(1));
		
		//System.out.println(alunos.indexOf("Júlio"));
		
		//System.out.println(alunos.toString());
		
		//alunos.set(0, "Batman");
		
		//System.out.println("Tamanho da lista: "+alunos.size());
		
		//System.out.println(alunos.isEmpty());
		
		for(String aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
