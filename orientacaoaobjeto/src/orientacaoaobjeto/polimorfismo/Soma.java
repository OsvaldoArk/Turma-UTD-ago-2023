package orientacaoaobjeto.polimorfismo;

public abstract class Soma {

	public static int e(int a, int b) {
		return a +b;
	}
	
	public static Double e(double a, double b) {
		return a +b;
	}
	
	public static Float e(float a, float b) {
		return a +b;
	}
	
	public static String e(String a, String b) {
		
		Integer resultado = Integer.parseInt(a) + Integer.parseInt(b);
		
		return resultado.toString();
	}
}
