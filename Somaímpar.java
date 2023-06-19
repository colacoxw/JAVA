
public class Somaímpar {
    public static void main(String[] args) {

        int total = 0;
        int j = 1;

        while (j <= 99) {
            System.out.println("Valor de j: " + j + ".");
            total = j + total;
            j = j + 2;
        }

        System.out.println("Valor total é igual a: " + total);
    }
}