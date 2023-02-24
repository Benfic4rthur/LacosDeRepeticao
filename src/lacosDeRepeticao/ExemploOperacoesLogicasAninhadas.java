package lacosDeRepeticao;

	public class ExemploOperacoesLogicasAninhadas {
	    public static void main(String[] args) {
	        int numero = 10; // declara uma variável numero e atribui o valor 10
	        if (numero > 0) { // verifica se o número é maior que zero
	            if (numero % 2 == 0) { // verifica se o número é par
	                System.out.println("O número é positivo e par."); // imprime mensagem correspondente
	            } else { // se o número não é par
	                System.out.println("O número é positivo e ímpar."); // imprime mensagem correspondente
	            }
	        } else { // se o número não é maior que zero
	            System.out.println("O número não é positivo."); // imprime mensagem correspondente
	        }
	    }
	}