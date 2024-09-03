import java.util.Scanner;

public class ClassificaçãoDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer nota = 0;
        System.out.println("Informe sua nota: ");
        nota = sc.nextInt();
        if (nota >= 9 && nota <= 10) {
            System.out.println("Nota Excelente");
        }
        else if (nota >= 7 && nota <= 10) {
            System.out.println("Nota Boa");
        }
        else if (nota >= 5 && nota <= 10) {
            System.out.println("Nota Satisfatória");
        }
        else if (nota < 4 && nota <= 10) {
            System.out.println("Nota Insatisfatória");
        }
    }
}