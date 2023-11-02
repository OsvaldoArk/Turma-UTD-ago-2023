package padroesdeprojeto.factory;

import java.util.LinkedList;
import java.util.List;

public class TestaFabrica {

	public static void main(String[] args) {
		
		FiguraGeometrica tri = FabricaGeometrica.gerar("triangulo");

		//System.out.println(tri.calcularArea(10));
		/*
		FiguraGeometrica fig = new Quadrado();
		
		fig = new Triangulo();
		
		List<Double> lista = new LinkedList<>();
		*/
	}
}
