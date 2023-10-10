package logicadeprogramacao.javabasico;

public class MaiorDeQuatroNumerosTernario {

	public static void main(String[] args) {
		
		int a=15,b = 20,c = 3,d = 14;
		
		/*
		int maiorA = Math.max(a, b);
		
		int maiorB = Math.max(maiorA, c);
		
		int maiorC = Math.max(maiorB, d);
		*/
		
		int maiorA = a > b ? a : b;
		
		int maiorB = maiorA > c ? maiorA : c;
		
		int maiorC = maiorB > d ? maiorB : d;
	}
}
