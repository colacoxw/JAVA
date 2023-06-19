import java.util.Scanner;

public class maioridade {
    public static void main(String[] args) {
        Scanner total = new Scanner(System.in);
        int idade = 0;
        int i = 1;
        int maior = 0;
        do {
            System.out.println("Qual é a idade: ");
            idade = total.nextInt();
            if (idade > maior) {
                maior = idade;
            }

            i++;
        } while (i <= 5);
        System.out.println("A maior idade é: " + maior);

    }
}
