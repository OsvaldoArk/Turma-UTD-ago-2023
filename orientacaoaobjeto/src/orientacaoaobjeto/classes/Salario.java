package orientacaoaobjeto.classes;

public interface Salario {

	public double descontoAlimentacao(double salario);
	public double descontoTransporte(double salario);
	public double ganhoProducao(double salario);
	public double participacaoLucros(double salario);
	
	public static double bonusAniversario(double salario) {
		return salario * 0.3;
	}
}
