package lambdaexpression.exercicios;

import java.util.Arrays;

public class E03_quadrado_de_um_numero {

	public static void main(String[] args) {
		
		Arrays.asList(5,7,3).stream().map(x -> Math.pow(x, 2)).forEach(System.out::println);

	}

}
