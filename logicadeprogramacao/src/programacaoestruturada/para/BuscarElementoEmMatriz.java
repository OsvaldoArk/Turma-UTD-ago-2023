package programacaoestruturada.para;

public class BuscarElementoEmMatriz {

	public static void main(String[] args) {
		
		String alunos[][] = {{"Maria",""},{"João",""},{"Lúcio",""},{"Ana",""}};
		
		double alunosMedia[] = new double[4];
		
		int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int linha =0; linha < 4;linha++) {
			int soma = 0;
			for(int coluna =0; coluna <4;coluna++) {
				soma+= matrix[linha][coluna];
			}
			alunosMedia[linha] = soma/4.0;
			alunos[linha][1] = String.valueOf(alunosMedia[linha]);
		}
		/*	
		
		String numero = "7.5";
		
		System.out.println(numero.compareTo("7.6"));
		
		*/
		//o método compareTo 
		sort(alunos);
		
		for(int linha =0; linha < 4;linha++) {
			System.out.println(alunos[linha][0]+" "+alunos[linha][1]);
		}
	}
	
	public static String[][] sort(String matriz[][]){
		
		for(int atual = 0;atual<4; atual++) {
			
			for(int proximo=atual+1;proximo<4;proximo++) {
				
				double numero01 = Double.parseDouble( matriz[atual][1]);
				
				double numero02 = Double.parseDouble( matriz[proximo][1]);
				
				if(numero01 > numero02) {
					String temp[] = new String[2];   
							
					temp[0] = matriz[atual][0];
					temp[1] = matriz[atual][1];
					
					matriz[atual][0] = matriz[proximo][0];
					matriz[atual][1] = matriz[proximo][1];
					
					matriz[proximo][0] = temp[0];
					matriz[proximo][1] = temp[1];
				}
			}
		}
		
		return matriz;
	}
}
