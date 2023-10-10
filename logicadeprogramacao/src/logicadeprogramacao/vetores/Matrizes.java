package logicadeprogramacao.vetores;

public class Matrizes {

	public static void main(String[] args) {
		
		int matriX[][] = new int[2][3];
		
		int matrix[][] = {
				          {1,3,5},
						  {2,4,6}
				          };
		
		matrix[0][2] = 15;
		
		System.out.println(matrix[0][1]);
	}
}
