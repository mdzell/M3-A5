import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maioresDe18 = 0;

        for (int pessoa = 1; pessoa <= 5; pessoa++) {
            System.out.print("Digite a idade da pessoa " + pessoa + ": ");
            int idade = scanner.nextInt();

            if (idade > 18) {
                maioresDe18++;
            }
        }

        System.out.println("Pessoas com mais de 18 anos: " + maioresDe18);

        scanner.close();
    }
}