package lacosDeRepeticao;

import javax.swing.JOptionPane;

public class DivisaoRestoMod {
    public static void main(String[] args) {
        // Solicita ao usuário o primeiro número
        String num1String = JOptionPane.showInputDialog("Digite o primeiro número:");
        // Converte a string do primeiro número para inteiro
        int num1 = Integer.parseInt(num1String);
        // Solicita ao usuário o segundo número
        String num2String = JOptionPane.showInputDialog("Digite o segundo número:");
        // Converte a string do segundo número para inteiro
        int num2 = Integer.parseInt(num2String);
        // Calcula a divisão dos números
        int divisao = num1 / num2;
        // Calcula o resto da divisão dos números
        int resto = num1 % num2;
        // Exibe os resultados na tela
        JOptionPane.showMessageDialog(null, "A divisão de " + num1 + " por " + num2 + " é igual a " + divisao +
                "\nO resto da divisão de " + num1 + " por " + num2 + " é igual a " + resto);
    }
}