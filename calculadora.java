import java.util.Scanner;

public class calculadora {
    /**
     * Somo dois numeros do tipo {@code int}
     * 
     * @param var1 Primerio valor
     * @param var2 Segundo valor
     * @return a adição de {@code var1} e {@code var2}
     */
    protected static double soma(double var1, double var2) {
        return var1 + var2;
    }

    /**
     * Subtraio dois numeros do tipo {@code int}
     * 
     * @param var1 Primerio valor
     * @param var2 Segundo valor
     * @return a subtração de {@code var1} e {@code var2}
     */
    protected static double subtracao(double var3, double var4) {
        return var3 - var4;
    }

    /**
     * Divido dois numeros do tipo {@code int}
     * 
     * @param var1 Primerio valor
     * @param var2 Segundo valor
     * @return a divisão de {@code var1} e {@code var2}
     */
    protected static double divisao(double var5, double var6) {
        return var5 / var6;
    }

    /**
     * Multiplico dois numeros do tipo {@code int}
     * 
     * @param var1 Primerio valor
     * @param var2 Segundo valor
     * @return a de {@code var1} e {@code var2}
     */
    protected static double multiplicacao(double var7, double var8) {
        return var7 * var8;
    }

    protected static double raizquadrado(double var9) {
        return Math.sqrt(var9);
    }

    protected static double elvadoquadrado(double var10) {
        return var10 * var10;
    }

    public static void main(String[] args) {
        double varTotal; // aqui é utilizado para fazer o calculo final, dar a operação dos dois numeros
                         // dados
        int operacao; // aqui é utilizado para saber oque o usuario precisa, no caso qual operação ele
                      // quer fazer
        double num1 = 0; // aqui é o primeiro numero dado pelo usuario
        double num2 = 0;// aqui é o segundo numero dado pelo usuario
        Scanner op = new Scanner(System.in); // aqui é utilizado para saber oque o usuario vai digitar

        System.out.println("Qual operação você deseja efetuar? 1=+, 2=-, 3=/, 4=* 5=raiz/, 6=^/");
        operacao = op.nextInt();
        if (operacao == 5 || operacao ==6) {

            System.out.println("Qual será o primeiro numero? ");
            num1 = op.nextInt();
        } else {
            System.out.println("Qual será o primeiro numero? ");
            num1 = op.nextInt();

            System.out.println("Qual será o segundo numero?");
            num2 = op.nextInt();
        }

        if (operacao == 1)

        {
            varTotal = soma(num1, num2);
            System.out.println("O resultado final é igual a: " + varTotal);
        } else if (operacao == 2) {
            varTotal = subtracao(num1, num2);
            System.out.println("O resultado final é igual a: " + varTotal);
        } else if (operacao == 3) {
            varTotal = divisao(num1, num2);
            System.out.println("O resultado final é igual a: " + varTotal);
        } else if (operacao == 4) {
            varTotal = multiplicacao(num1, num2);
            System.out.println("O resultado final é igual a: " + varTotal);
        } else if (operacao == 5) {
            varTotal = raizquadrado(num1);
            System.out.println("O resultado final é igual a: " + varTotal);
        }  else if (operacao == 6) {
                varTotal =elvadoquadrado(num1);
                System.out.println("O resultado final é igual a: " + varTotal);
        }
    }
}