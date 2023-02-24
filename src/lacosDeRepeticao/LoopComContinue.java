package lacosDeRepeticao;

import javax.swing.JOptionPane;

public class LoopComContinue {
    public static void main(String[] args) {
        int numero = 0;
        while (true) { // Laço de repetição infinito
            String entrada = JOptionPane.showInputDialog(null, "Digite um número (digite -1 para sair):");
            numero = Integer.parseInt(entrada);
            if (numero == -1) {
                JOptionPane.showMessageDialog(null, "Saindo do programa.");
                break; // Parando a execução do laço de repetição
            }
            if (numero % 2 == 0) { // Se o número é par
                JOptionPane.showMessageDialog(null, "O número " + numero + " é par.");
                continue; // Pula para a próxima iteração do laço de repetição
            }
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar.");
        }
    }
}