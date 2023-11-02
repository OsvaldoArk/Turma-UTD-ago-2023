package lambdaexpression.exercicios;

import java.util.Arrays;
import java.util.List;

public class E02_incidencia {

	public static void main(String[] args) {
		/*
		int contador = Arrays.asList(937,501, 5, 395, 402, 501, 333, 502, 781, 3, 691,501).stream()
								.reduce(0,(total,item)-> {
									if(item == 501) total++;
									return total;
								});

		System.out.println(contador);
		*/
		
		String texto = "O rato roeu a roupa do rei de roma que rato ruim";

		
		String array[] = texto.split(" ");
		
		List<String> palavras = Arrays.asList(array);
		
		int contador = Integer.parseInt(Arrays.asList(array).stream()
				.reduce("0",(total,item)-> {
					
					if(item.equals("rato")) { 
						Integer aux = Integer.parseInt(total);
						
						aux++;
						
						total = aux.toString();
					} ;
					return total;
				}));

System.out.println(contador);
		
		
		
	}

}
