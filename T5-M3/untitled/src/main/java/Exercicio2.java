import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;

        do {
            System.out.print("Digite um número de 1 a 100: ");
            tentativa = scanner.nextInt();

            if (tentativa < numeroSecreto) {
                System.out.println("MAIOR");
            } else if (tentativa > numeroSecreto) {
                System.out.println("MENOR");
            } else {
                System.out.println("Você acertou!");
            }
        } while (tentativa != numeroSecreto);

        scanner.close();
    }
}
