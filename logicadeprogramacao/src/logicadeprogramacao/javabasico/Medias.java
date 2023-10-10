package logicadeprogramacao.javabasico;

public class Medias {

	public static void main(String[] args) {
		
		int a = 8, b = 9, c = 7, peso01 = 2, peso02 = 3, peso03 = 5;
	
		double mediaAritmetica  = (a + b + c) / 3.0;
		
		double mediaAritmetica02  = (4 + 5 + 6) / 3.0;
		/*
		double mediaPonderada = (a * peso01 + b * peso02 + c * peso03) / 10.0;
		
		
		System.out.println("média aritmética: "+mediaAritmetica);
		
		System.out.println("média ponderada: "+mediaPonderada);
		*/
		
		System.out.println(mediaAritmetica + mediaAritmetica02);
		
		System.out.println((mediaAritmetica + mediaAritmetica02)/2);
	}

}
