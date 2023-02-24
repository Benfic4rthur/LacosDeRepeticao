package lacosDeRepeticao;

import javax.swing.JOptionPane;

public class ExemploOperacoesLogicasAninhadas {
	public static void main(String[] args) {
		int escolha = JOptionPane.showConfirmDialog(null, "Programa par ou impar?");
		if (escolha == 0) {
			String entrada = JOptionPane.showInputDialog(null, "Digite um número: "); // exibe uma caixa de diálogo para
																						// o usuário inserir o número
			int numero = Integer.parseInt(entrada); // converte a entrada para inteiro

			if (numero > 0) { // verifica se o número é maior que zero
				if (numero % 2 == 0) { // verifica se o número é par
					JOptionPane.showMessageDialog(null, "O número é positivo e par."); // exibe uma caixa de diálogo com
																						// a mensagem correspondente
				} else { // se o número não é par
					JOptionPane.showMessageDialog(null, "O número é positivo e ímpar."); // exibe uma caixa de diálogo
																							// com a mensagem
																							// correspondente
				}
			} else { // se o número não é maior que zero
				JOptionPane.showMessageDialog(null, "O número não é positivo."); // exibe uma caixa de diálogo com a
																					// mensagem correspondente
			}
		} else {
			JOptionPane.showMessageDialog(null, "Você escolheu não brincar");
		}
	}
}