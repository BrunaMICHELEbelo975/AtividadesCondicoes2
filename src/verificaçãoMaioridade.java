import java.util.Scanner;

class VerificaçãodeMaioridade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer idade = 0;

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Esta pessoa é maior de idade.");
        } else {
            System.out.println("Esta pessoa não é maior de idade.");

        }
    }
}