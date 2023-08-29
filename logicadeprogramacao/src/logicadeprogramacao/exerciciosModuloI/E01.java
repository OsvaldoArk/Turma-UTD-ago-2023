package logicadeprogramacao.exerciciosModuloI;

public class E01 {
	//d = V(x2 - x1)^2 + (y2 - y1)^2
	//x2² - 2. x2.x1 + x1²
	public static void main(String[] args) {
		int x1=-5,x2=6,y1=3,y2= 5;
		
		//squareroot
		//double quadradoDaDiferenca01 = (Math.pow(x2, 2) - 2*x2*x1 + Math.pow(x1, 2));
		
		//double quadradoDaDiferenca02 = (Math.pow(y2, 2) - 2*y2*y1 + Math.pow(y1, 2));
		
		//double resposta = Math.sqrt(quadradoDaDiferenca01 + quadradoDaDiferenca02);
		
		double resposta2 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));
		
		System.out.printf("%.2f",resposta2);
	}
}
