public class calculadoraScanner {
    /**
     * Somo dois numeros do tipo {@code int}
     * 
     * @param var1 Primerio valor
     * @param var2 Segundo valor
     * @return a adição de {@code var1} e {@code var2}
     */
    protected static int soma(int var1, int var2) {
        return var1 + var2;
    }

    public static void main(String[] args) {
        int varTotal = 0;
        varTotal = soma(2,3);
        System.out.println("o valor total é: " + varTotal);
    }
}
