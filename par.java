
import java.util.Scanner;
public class par {
    public static void main(String[] Args) {
        Scanner maior = new Scanner(System.in);
        int X;

        System.out.println("Qual e o valor de X?");
        X = maior.nextInt();

        if (X %2==0){
            System.out.println( X + " é par");
        } else {
            System.out.println(X + " é impar");
        
        }
    }
}