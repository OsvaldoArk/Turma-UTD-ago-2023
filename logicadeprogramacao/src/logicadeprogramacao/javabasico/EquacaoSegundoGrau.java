package logicadeprogramacao.javabasico;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		
		int a = 1, b = -5, c = 6; 
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(delta)) / 2 * a;
		
		double x2 = (-b - Math.sqrt(delta)) / 2 * a;

		System.out.printf("delta = %.2f x1 = %.2f x2 = %.2f",delta,x1,x2);
		
	}

}
