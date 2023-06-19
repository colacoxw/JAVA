import java.util.Scanner;
public class Entrada {
    public static void main (String[] args){
        Scanner varEntrada = new Scanner(System.in);
        String varUsuario;
        int varIdade;

        System.out.println("Digite o nome do usuário:");
        varUsuario = varEntrada.nextLine();

        System.out.println("Digite a idade do usuário:");
        varIdade = varEntrada.nextInt();

        System.out.println("O nome do usuário é " + varUsuario + "e possui " +varIdade+ " anos.");
    }
}
