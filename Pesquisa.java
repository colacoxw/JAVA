public class Pesquisa {
    public static void main(String[] args) {
        // o total é utilizado para mostrar todos os numeros 2 no final
        int total = 0;
        // essa linha é utilizada para mostrar os vetores
        int[] valores = { 4, 5, 6, 7, 8, 2, 4, 5, 3, 6 };

        for (int i = 0; i < 10; i++) {  //for = para, isso é usado para o loop, no caso ele le as variaveis em cima 
            
            if (valores[i] == 5) { //if=se, nesse caso ele foi utilizado para separar todos os numeros 5
                
                total = total + 1; // o total, com o if de cima, toda vez que passa no numero 5 ele adiciona 1 no total, por isso total = 0

            }
        }
        System.out.println("Possui " + total + " numeros 5."); // essa linha é apenas para aprensentar no final, abaixo da chave do "for" para n repitir varias vezes
    }
}
