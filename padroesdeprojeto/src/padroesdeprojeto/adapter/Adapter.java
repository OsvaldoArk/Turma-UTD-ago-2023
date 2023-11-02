package padroesdeprojeto.adapter;

public class Adapter extends Celsius{

	public double getTemperatura() {
		return super.getTemperatura();
	}

	public void setTemperatura(double temperatura) {
		super.setTemperatura(temperatura);
	}
	
	public double getTemperaturaKelvin() {
		return (super.getTemperatura()+273);
	}
	
	public double getTemperaturaFahrenheit() {
		return 1.8 * super.getTemperatura() + 32;
	}
}
