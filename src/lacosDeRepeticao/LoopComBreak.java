package lacosDeRepeticao;

import javax.swing.JOptionPane;

public class LoopComBreak {
    public static void main(String[] args) {
        int numero = 0;
        while (true) { // Laço de repetição infinito
            String entrada = JOptionPane.showInputDialog(null, "Digite um número (digite -1 para sair):");
            numero = Integer.parseInt(entrada); // Convertendo a entrada para um número inteiro
            if (numero == -1) { // Se o usuário digitou -1, encerra o programa
                JOptionPane.showMessageDialog(null, "Saindo do programa.");
                break; // Parando a execução do laço de repetição
            }
            if (numero % 2 == 0) { // Verifica se o número é par
                JOptionPane.showMessageDialog(null, "O número " + numero + " é par.");
            } else { // Caso contrário, o número é ímpar
                JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar.");
            }
        }
    }
}