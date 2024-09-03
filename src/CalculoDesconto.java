import java.util.Scanner;

class CalculoDesconto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = entrada.nextDouble();

        double percentualDesconto = 0;
        double valorDesconto = 0;
        double valorFinal = valorCompra;

        // Determina o percentual de desconto com base no valor da compra
        if (valorCompra > 500) {
            percentualDesconto = 20;
        } else if (valorCompra >= 200) {
            percentualDesconto = 10;
        } else if (valorCompra >= 100) {
            percentualDesconto = 5;
        } else {
            percentualDesconto = 0;
        }

        // Calcula o valor do desconto e o valor final da compra
        valorDesconto = valorCompra * percentualDesconto / 100;
        valorFinal = valorCompra - valorDesconto;

        // Exibe os resultados
        System.out.printf("Valor original: R$ %.2f%n", valorCompra);
        System.out.printf("Percentual de desconto: %.2f%%%n", percentualDesconto);
        System.out.printf("Valor descontado: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);

        entrada.close();
    }
}



