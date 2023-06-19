import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner non = new Scanner(System.in);
        int senha;

        System.out.println("Digite sua senha:");
        senha = non.nextInt();

        switch (senha) {
            case 1234:
                System.out.println("Senha correta!");
                break;
            default:
                System.out.println("Senha incorreta, tente novamente!");
                break;
        }
    }

}
