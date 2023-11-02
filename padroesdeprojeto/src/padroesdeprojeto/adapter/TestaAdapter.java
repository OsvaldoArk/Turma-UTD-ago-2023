package padroesdeprojeto.adapter;

public class TestaAdapter {

	public static void main(String[] args) {

		Adapter escala = new Adapter();
		
		escala.setTemperatura(30);
		
		System.out.println(escala.getTemperatura());
		
		System.out.println(escala.getTemperaturaFahrenheit());
		
		System.out.println(escala.getTemperaturaKelvin());
	}

}
