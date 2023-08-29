package logicadeprogramacao.variaveisEConstantes;

import javax.swing.JOptionPane;

public class ComandoDeEntradaIG {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		
		JOptionPane.showMessageDialog(null, "Olá "+nome+" você tem "+idade+" anos de idade.");

	}

}
