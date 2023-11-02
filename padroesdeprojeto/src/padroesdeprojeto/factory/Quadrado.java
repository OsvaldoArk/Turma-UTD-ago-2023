package padroesdeprojeto.factory;

public class Quadrado implements FiguraGeometrica{

	@Override
	public Double calcularPerimetro(int lado) {
		// TODO Auto-generated method stub
		return lado * 4.0;
	}

	@Override
	public Double calcularArea(int lado) {
		// TODO Auto-generated method stub
		return Math.pow(lado, 2);
	}

}
