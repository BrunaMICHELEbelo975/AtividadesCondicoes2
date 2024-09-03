import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double segundoNumero = leitor.nextDouble();

        System.out.print("Digite a operação desejada (+, -, *, /): ");
        char operacaoEscolhida = leitor.next().charAt(0);

        double resultadoOperacao;

        switch (operacaoEscolhida) {
            case '+':
                resultadoOperacao = primeiroNumero + segundoNumero;
                System.out.println("Resultado da adição: " + resultadoOperacao);
                break;
            case '-':
                resultadoOperacao = primeiroNumero - segundoNumero;
                System.out.println("Resultado da subtração: " + resultadoOperacao);
                break;
            case '*':
                resultadoOperacao = primeiroNumero * segundoNumero;
                System.out.println("Resultado da multiplicação: " + resultadoOperacao);
                break;
            case '/':
                if (segundoNumero != 0) {
                    resultadoOperacao = primeiroNumero / segundoNumero;
                    System.out.println("Resultado da divisão: " + resultadoOperacao);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        leitor.close();
    }
}
