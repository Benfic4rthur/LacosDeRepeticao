package lacosDeRepeticao;

// Importa a classe JOptionPane para utilizar as caixas de diálogo.
import javax.swing.JOptionPane;

public class OperadoresRelacionais {

    public static void main(String[] args) {

        // Solicita que o usuário digite dois números utilizando a caixa de diálogo showInputDialog().
        String numero1 = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
        String numero2 = JOptionPane.showInputDialog(null, "Digite o segundo número:");

        // Converte as strings digitadas pelo usuário em números inteiros.
        int n1 = Integer.parseInt(numero1);
        int n2 = Integer.parseInt(numero2);

        // Utiliza os operadores relacionais para comparar os valores das variáveis n1 e n2.
        boolean igual = (n1 == n2);
        boolean diferente = (n1 != n2);
        boolean maior = (n1 > n2);
        boolean menor = (n1 < n2);
        boolean maiorOuIgual = (n1 >= n2);
        boolean menorOuIgual = (n1 <= n2);

        // Exibe as comparações realizadas utilizando a caixa de diálogo showMessageDialog().
        JOptionPane.showMessageDialog(null, "Os números "+n1+" e "+n2+ " são iguais? "  + igual 
        		+ "\nOs números "+n1+" e "+n2+  " são diferentes? " + diferente 
        		+ "\n O primeiro número ("+n1+") é Maior? " + maior 
        		+ "\n O primeiro número ("+n1+") é Menor? " + menor 
        		+ "\n O primeiro número ("+n1+") é maior ou igual ao segundo ("+n2+")? " 
        + maiorOuIgual + "\n O Primeiro número ("+n1+") é menor ou igual ao segundo ("+n2+")? " + menorOuIgual);
    }
}