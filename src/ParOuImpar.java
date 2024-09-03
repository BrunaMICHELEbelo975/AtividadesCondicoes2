import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer num = Integer.parseInt(sc.nextLine());
        System.out.println(num % 2 == 0 ? "O numero é Par" : "O numero é Impar");

    }
}