import java.util.Scanner;
public class Reajuste {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        float n1;
        float t;

        System.out.println("o seu salário tera um reajuste, seu salário atual é de:");
        n1 = r.nextFloat();
        t = n1 + (n1*5)/100;

        System.out.println("seu salario atual é de " + t);
    }
}