package lacosDeRepeticao;

import javax.swing.JOptionPane;

public class TrabalhandoComIF {
	public static void main(String[] args) {
		//CRIA UM TELA INTERATIVA EM SWING DANDO OPÇÕES
		Integer opcaoInteger = JOptionPane.showConfirmDialog(null, "Teste IF, deseja prosseguir?");
		//CRIA O IF QUE DIZ CASO A ESCOLHA SEJA SIM = 0
		if(opcaoInteger == 0) {
			//A IMPRESSÃO SERA ESTA
			JOptionPane.showMessageDialog(null, "Você escolheu 'SIM'!");
			//O ELSE IF CONDICIONA CASO A OPÇÃO SEJA NÃO = 1
		}else if (opcaoInteger == 1) {
			//A IMPRESSÃO SERA ESTA
			JOptionPane.showMessageDialog(null, "Você escolheu 'NÃO'!");
			//O ELSE SÓ CONDICIONA CASO SEJA ESCOLHIDA A TERCEIRA E ULTIMA OPÇÃO O CANCELAR = 2
		}else {
			//A IMPRESSÃO SERA ESTA
			JOptionPane.showMessageDialog(null, "Você escolheu 'CANCELAR'!");
		}
	}
}