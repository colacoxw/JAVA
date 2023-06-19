public class pares {
    public static void main(String[] args) {
        int totalimpar = 0;
        int totalpar = 0;
        int[] valores = { 4, 5, 6, 7, 8, 2, 4, 5, 3, 6 };

        for (int i = 0; i < 10; i++) {
            if (valores[i] % 2 == 0) {
                totalpar = totalpar + 1;
            } else {
                totalimpar = totalimpar + 1;
            }

        }
        System.out.println(
                "Possui o total de " + totalpar + " de numeros pares e possui " + totalimpar + " numeros impares.");
    }

}
