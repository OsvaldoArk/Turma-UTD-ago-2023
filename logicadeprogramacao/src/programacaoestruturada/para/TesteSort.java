package programacaoestruturada.para;

public class TesteSort {

	public static void main(String[] args) {
		
		int vetor[] = {37,2,55,87,26};
		
		BubbleSort.sortInverso(vetor);
		
		System.out.println(BubbleSort.paraString(vetor));

	}
}
