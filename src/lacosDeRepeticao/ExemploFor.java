package lacosDeRepeticao;

import javax.swing.JOptionPane;

public class ExemploFor {
    public static void main(String[] args) {
        // Declaração de variáveis
        int quantidadeNumeros, numero, soma = 0;

        // Lê a quantidade de números que o usuário deseja informar
        String entrada = JOptionPane.showInputDialog(null, "Quantos números deseja somar?");
        quantidadeNumeros = Integer.parseInt(entrada);

        // Lê os números informados pelo usuário e acumula a soma
        for (int i = 1; i <= quantidadeNumeros; i++) {
            entrada = JOptionPane.showInputDialog(null, "Digite o número " + i + ":");
            numero = Integer.parseInt(entrada);
            soma += numero;
        }

        // Exibe a soma dos números informados
        JOptionPane.showMessageDialog(null, "A soma dos " + quantidadeNumeros + " números informados é: " + soma);
    }
}