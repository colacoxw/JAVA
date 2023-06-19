public class SomaLinha {
        public static void main(String[] args) {
            int total1 = 0;
            int total2 = 0;
            int total3 = 0;
    
            int[][] matriz = { { 0, 0, 0 }, { 0, 0, 0, }, { 0, 0, 0, } };
            matriz[0][0]=1;
            matriz[0][1]=2;
            matriz[0][2]=3;
            matriz[1][0]=4;
            matriz[1][1]=5;
            matriz[1][2]=6;
            matriz[2][0]=7;
            matriz[2][1]=8;
            matriz[2][2]=9;

            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            total1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
            System.out.println("O valor da primeira linha é: "+total1);
            total2 = matriz[1][0] + matriz[1][1] + matriz[1][2];
            System.out.println("O valor da segunda linha é: "+total2);
            total3 = matriz[2][0] + matriz[2][1] + matriz[2][2];
            System.out.println("O valor da terceira linha é: "+total3);
        }
    }
    
    

