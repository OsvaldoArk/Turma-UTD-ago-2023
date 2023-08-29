package logicadeprogramacao.variaveisEConstantes;

public class Operadores {

	public static void main(String[] args) {
	
		//Operadores unários 
		String nome = "UTD";
		
		int numero = 30;
		
		boolean verdadeiro = !true;
		
		//System.out.println(verdadeiro);
		
		//pós incremento
		//System.out.println(numero++);
		//numero+=10;
		//System.out.println(numero/=10);
		
		//Operadores Aritméticos
		//+ - * / %
		double expressao =  20.0 / 5.0 % 2.0 + 3.0 * 4.0 - 10.0 + 1.0;
		
		double divisao = 10 /(double) 3;
		
		double media = (10.0 + 9.0 + 8.0) / 3.0;
		
		//System.out.println(media);
		
		//137 separar as casas decimais.
		
		int numero09 = 872;
		
		int unidade = numero09 % 10;
		
		int dezena = (numero09 % 100) / 10 ;
		
		int centena = numero09 / 100;
		
		//System.out.println("unidade: "+unidade);
		
		//System.out.println("dezena: "+dezena);
		
		//System.out.println("centena: "+centena);
		
		//operadores relacionais - a resposta para os operadores relacionais sempre será true ou false
		// > >= < <= == !=
		
		boolean maiorQue = 74 >= 74;
		
		//System.out.println(maiorQue);
		
		//operadores lógicos
		//&& & || |
		boolean proposicao = false && true & true & true & true & true;
		
		boolean proposicao02 = true || false | false | false;
		
		boolean podeTirarCarteira = false; 
		
		int idade = 18;
		
		boolean passouNaProva = true;
		
		podeTirarCarteira = idade > 18 && passouNaProva; 
		
		System.out.println(podeTirarCarteira);
		
		//operador ternário;
		
		//(proposicao lógica) ? (valor se verdadeiro) : (valor se falso);
		
		String ternario = idade >= 18 && passouNaProva ? "pode tirar a carteira" : "não pode tirar a carteira";
		
		System.out.println(ternario);
	}
}
