package padroesdeprojeto.factory;

public class Triangulo implements FiguraGeometrica{

	@Override
	public Double calcularPerimetro(int lado) {
		
		return lado * 3.0;
	}

	@Override
	public Double calcularArea(int lado) {
		// TODO Auto-generated method stub
		return Math.pow(lado, 2) / 2;
	}

}
