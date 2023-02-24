package lacosDeRepeticao;

import javax.swing.JOptionPane;

public class OperadorTernario {
    public static void main(String[] args) {
    	
    	String idadeString = JOptionPane.showInputDialog("Qual sua idade?");//pergunta a idade ao usuario
    	int idade = Integer.parseInt(idadeString); // converte o valor recebido por uma string acima, para um inteiro e declara a variavel
        String mensagem = (idade >= 18) ? "Você é maior de idade" : "Você é menor de idade"; // valida a idade com o valor recebido acima
        // a linha acima utiliza o operador ternário para verificar se a idade é maior ou igual a 18
        // se for verdadeiro, a variável mensagem recebe a string "Você é maior de idade"
        // caso contrário, recebe a string "Você é menor de idade"
        JOptionPane.showMessageDialog(null, mensagem);; // imprime a mensagem correspondente
    }
}