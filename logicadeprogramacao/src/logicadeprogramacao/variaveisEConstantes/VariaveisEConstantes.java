package logicadeprogramacao.variaveisEConstantes;

/*
 * 
 *Classe de apresentação de variáveis e constantes. 
 * 
 * autor: Osvaldo Souza
 * 
 * data: 21/08/2023
 * 
 * versão: 1.0.
 * 
 * */

public class VariaveisEConstantes {

	public static void main(String[] args) {
		//binário 0 e 1  bits
		//8 bits => 1 byte
		byte   numeroInteiroByte = 121;
		short  numeroInteiroCurto = 15000;
		int    numeroInteiro = 2_123_456_789;//2.123.456.789;
		long   numeroInteiroLongo = 1_234_567_890_2_345_678L;
		
		float  numeroRacional = 9.123456f, raio = 2;
		double numeroRacionalDePrecisaoDupla = 18.246810121416;
		
		char letra = '%';
		
		boolean verdadeiro = true;
		
		final float VALOR_DO_PI = 3.14f;
		
		float area =(float) (VALOR_DO_PI * Math.pow(raio, 2));
		
		System.out.println("Hello World");
		
		System.out.println("Byte: "+numeroInteiroByte);
		
		System.out.println("Inteiro: "+numeroInteiro);
		
		String numero = String.valueOf(35);
		
		int numero02 = Integer.parseInt("35");
		
		float numero03 = Float.parseFloat("49");
		
		int numero04 = (int) 60.0;
		
		short numero05 = (short) 12345567890128888L;
		
		System.out.println("número long: "+numero05);
	}
}
