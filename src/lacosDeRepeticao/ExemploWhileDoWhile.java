package lacosDeRepeticao;

import javax.swing.JOptionPane;

public class ExemploWhileDoWhile {
    public static void main(String[] args) {
        // Declaração de variáveis
        int numero, soma = 0;
        String entrada;

        // Lê o primeiro número do usuário usando do-while
        do {
            entrada = JOptionPane.showInputDialog(null, "Digite um número:");
            numero = Integer.parseInt(entrada);
        } while (numero < 0); // O laço se repete enquanto o número lido for negativo

        // Lê os demais números usando while
        while (numero >= 0) {
            soma += numero; // Adiciona o número à soma
            entrada = JOptionPane.showInputDialog(null, "Digite outro número (ou um número negativo para encerrar):");
            numero = Integer.parseInt(entrada);
        }

        // Exibe a soma dos números positivos
        JOptionPane.showMessageDialog(null, "A soma dos números positivos é: " + soma);
    }
}