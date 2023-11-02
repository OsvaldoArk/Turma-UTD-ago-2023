package padroesdeprojeto.factory;

public class FabricaGeometrica {

	public static FiguraGeometrica gerar(String forma) {
		if(forma.toUpperCase().equals("TRIANGULO")) {
			return new Triangulo();
		}
		else if(forma.toUpperCase().equals("QUADRADO")) {
			return new Quadrado();
		}
		
		return null;
	}
	
}
