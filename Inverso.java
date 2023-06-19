import java.util.Scanner;
public class Inverso {
    public static void main(String[] Args) {
        Scanner user = new Scanner(System.in);
        int total; 
        System.out.println("Qual é o numero que você deseja?");
        total=user.nextInt();
        
        for (int i = total; i>=0; i--){
            System.out.println("O resultado é: " + i);
        }
        
    }

}
