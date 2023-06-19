import java.util.Scanner;
public class valores {
    public static void main(String[] Args) {
        Scanner maior = new Scanner(System.in);
        int X;
        int Y;

        System.out.println("Qual e o valor de X?");
        X = maior.nextInt();

        System.out.println("Qual e o valor de Y?");
        Y = maior.nextInt();


        if (X > Y){
            System.out.println("O maior numero é: " + X);
        } else if (X < Y){
            System.out.println("O maior numero é: " + Y);
        } else {
            System.out.println("ambos os numeros são iguais: ");
        }
    }
}
