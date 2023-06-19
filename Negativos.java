public class Negativos {
    public static void main(String[] args) {
        int total = 0;
        int[] valores = { -4, 5, -6, 7, -8, 2, -4, -5, -3, 6 };

        for (int i = 0; i < 10; i++) {
            if (valores[i] < 0) {
                total = total + 1;
            }

        }
        System.out.println("Possui " + total + " numeros negativos");
    }
}