import java.util.Scanner;

public class VerificaçãoDeLogin {
    public static void main(String[] args) {

        String UsuarioCorreto = "Admin";
        String SenhaCorreto = "adm123";

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu usuario :");
        String Usuario = sc.nextLine();
        System.out.println("Digite sua senha :");
        String Senha = sc.nextLine();


        if (UsuarioCorreto.equals(Usuario) && SenhaCorreto.equals(Senha)) {
            System.out.println("Login efetuado com sucesso!");
        }
        else {
            System.out.println("Nome de Usuario ou Senha Incorreto!");


        }
    }
}