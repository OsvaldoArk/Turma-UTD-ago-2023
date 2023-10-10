package logicadeprogramacao.javabasico;

public class MaiorDeDoisNumeros {

	public static void main(String[] args) {
		
		int a = 50, b = 1000;
		
		double maiorDeDois = ((a + b) + Math.abs(a - b)) / 2;
		
		System.out.println(maiorDeDois);
	}
}
