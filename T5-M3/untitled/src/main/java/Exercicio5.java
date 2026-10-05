import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int limite = scanner.nextInt();

        for (int numero = 0; numero <= limite; numero += 2) {
            System.out.println(numero);
        }

        scanner.close();
    }
}