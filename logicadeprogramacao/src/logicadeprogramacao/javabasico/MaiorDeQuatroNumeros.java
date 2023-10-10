package logicadeprogramacao.javabasico;

public class MaiorDeQuatroNumeros {

	public static void main(String[] args) {
		
		int a=15,b = 20,c = 3,d = 14;
		
		int maiorA = ((a+b) + Math.abs(a-b)) / 2;
		
		int maiorB = ((maiorA+c) + Math.abs(maiorA-c)) / 2;
		
		int maiorC = ((maiorB+d) + Math.abs(maiorB-d)) / 2;
		
		System.out.println(maiorC);
	}
}