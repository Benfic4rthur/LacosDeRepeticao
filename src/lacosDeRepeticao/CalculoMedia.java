package lacosDeRepeticao;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.Period;
import javax.swing.*;

public class CalculoMedia {
    public static void main(String[] args) {
        // Obter informações pessoais do aluno
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        String email = JOptionPane.showInputDialog("Digite o e-mail do aluno:");
        String dataNascimentoStr = JOptionPane.showInputDialog("Digite a data de nascimento do aluno:");

        // Verificar se a data foi digitada no formato correto (dd/MM/yyyy)
        boolean formatoCorreto = false;
        try {
            LocalDate.parse(dataNascimentoStr, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            formatoCorreto = true;
        } catch (DateTimeParseException e) {
            formatoCorreto = false;
        }
        
        // Adicionar barras automaticamente caso necessário
        if (!formatoCorreto) {
            StringBuilder dataNascimentoBuilder = new StringBuilder(dataNascimentoStr);
            if (dataNascimentoStr.length() == 6) {
                dataNascimentoBuilder.insert(2, "/");
                dataNascimentoBuilder.insert(5, "/");
            } else if (dataNascimentoStr.length() == 7) {
                if (dataNascimentoStr.contains("/")) {
                    dataNascimentoBuilder.insert(5, "/");
                } else {
                    dataNascimentoBuilder.insert(2, "/");
                    dataNascimentoBuilder.insert(5, "/");
                }
            } else if (dataNascimentoStr.length() == 8) {
                dataNascimentoBuilder.insert(2, "/");
                dataNascimentoBuilder.insert(5, "/");
            } else {
                JOptionPane.showMessageDialog(null, "Data de nascimento inválida!");
                return;
            }
            dataNascimentoStr = dataNascimentoBuilder.toString();
        }

        // Converter a data de nascimento para o formato LocalDate
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // Calcular idade do aluno
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        int idade = periodo.getYears();

        // Obter notas do aluno
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));

        // Calcular média do aluno
        double media = (nota1 + nota2 + nota3) / 3.0;

        // Verificar situação do aluno
        String situacao;
        if (media >= 70.0) {
            situacao = "Aprovado";
        } else if (media >= 60.0) {
            situacao = "Em recuperação";
        } else {
            situacao = "Reprovado";
        }

        // Criar JProgressBar para mostrar o loading
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setIndeterminate(true);
        progressBar.setString("Carregando...");
        progressBar.setStringPainted(true);

        // Criar JOptionPane com a barra de loading
        JOptionPane optionPane = new JOptionPane(progressBar, JOptionPane.PLAIN_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
        JDialog dialog = optionPane.createDialog("Aguarde");

        // Iniciar Timer para fechar o JOptionPane após 3 segundos
        Timer timer = new Timer(3000, (event) -> {
            dialog.dispose();

            // Exibir informações do aluno e resultado final
            String mensagem = "Nome: " + nome + "\nE-mail: " + email + "\nIdade: " + idade + " anos" + "\nMédia: " + media + "\nSituação: " + situacao;
            JOptionPane.showMessageDialog(null, mensagem);
        });
        timer.setRepeats(false);
        timer.start();

        // Mostrar o JOptionPane com a barra de loading
        dialog.setVisible(true);
    }
}