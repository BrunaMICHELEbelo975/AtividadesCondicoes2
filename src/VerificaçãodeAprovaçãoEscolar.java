import java.util.Scanner;

public class VerificaçãodeAprovaçãoEscolar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a média final do aluno: ");
        double media = scanner.nextDouble();

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}