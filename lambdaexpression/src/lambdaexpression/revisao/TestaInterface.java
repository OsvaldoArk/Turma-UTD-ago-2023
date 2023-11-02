package lambdaexpression.revisao;

public class TestaInterface {

	public static void main(String[] args) {
	
		Expoente quadrado = x -> Math.pow(x,2);
		
		Expoente cubo = x -> Math.pow(x,3);
		
		Expoente quarta = x -> Math.pow(x, 4);
		
		Expoente quinta = x -> Math.pow(x, 5);
		
		double resultado = executa(x-> Math.pow(x, 10),2);
		
		System.out.println(resultado);
	}
	
	public static  double executa(Expoente exp, int numero) {
		return exp.calcular(numero);
	}
	
	public static double qui(int numero) {
		return Math.pow(numero, 5);
	}
}


