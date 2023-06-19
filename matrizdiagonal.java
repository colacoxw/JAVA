public class matrizdiagonal {
    public static void main(String[] args) {
    

        int[][] matriz = { { 0, 0, 0 }, { 0, 0, 0, }, { 0, 0, 0, } };
        matriz[0][0]=1;
        matriz[1][1]=1;
        matriz[2][2]=1;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

