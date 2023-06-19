import java.util.Scanner;

public class caixa {
    public static void main(String[] args) {
        float total = 0;
        float o;
        Scanner p = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o preço: ");
            o = p.nextFloat();
            total = total + o;
        }
        System.out.println("A soma total é igual a: " + total);
    }
}