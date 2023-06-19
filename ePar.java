
public class ePar {
    /**
     * Retorna um {@code boolean} indicando se o valor {@code int}
     * é par
     * em caso afirmativo retorna {@code true}
     * Caso contrário, retorna {@code false}
     * 
     * @param valor um número inteiro
     * @return {@code boolean} indicando se o número é par
     */
     protected static boolean ePar(int valor) {
        return valor % 2 == 0;
    }

    public static void main(String[] args) {
        
        if (ePar(4)) {
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }
    }
}
