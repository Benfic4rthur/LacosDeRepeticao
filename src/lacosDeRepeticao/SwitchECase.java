package lacosDeRepeticao;

// Importa a classe JOptionPane para utilizar as caixas de diálogo.
import javax.swing.JOptionPane;

public class SwitchECase {
	public static void main(String[] args) {
		// Solicita que o usuário escolha uma opção, utilizando a caixa de diálogo
		// showInputDialog().
		// A mensagem com as opções é passada como primeiro argumento e o segundo
		// argumento é null para indicar que não há um componente pai para a caixa de
		// diálogo.
		String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção:\n1 - Opção 1\n2 - Opção 2\n3 - Opção 3");
		// Utiliza o comando switch para verificar o valor da variável opcao.
		switch (opcao) {
		// Caso a opção escolhida seja "1", exibe uma mensagem correspondente utilizando
		// a caixa de diálogo showMessageDialog().
		case "1":
			JOptionPane.showMessageDialog(null, "Opção 1 selecionada.");
			break;
		// Caso a opção escolhida seja "2", exibe uma mensagem correspondente utilizando
		// a caixa de diálogo showMessageDialog().
		case "2":
			JOptionPane.showMessageDialog(null, "Opção 2 selecionada.");
			break;
		// Caso a opção escolhida seja "3", exibe uma mensagem correspondente utilizando
		// a caixa de diálogo showMessageDialog().
		case "3":
			JOptionPane.showMessageDialog(null, "Opção 3 selecionada.");
			break;
		// Caso a opção escolhida não seja "1", "2" ou "3", exibe uma mensagem de opção
		// inválida utilizando a caixa de diálogo showMessageDialog().
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida.");
			break;
		}
	}
}