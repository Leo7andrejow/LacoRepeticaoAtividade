import java.util.Scanner;

public class avt5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroParaAdivinhar = 23;

        int palpite = 0;
        System.out.println("Bem-vindo ao jogo do adivinha");
        System.out.println("Existe um número surpresa entre 1 e 100, adivinhae qual é");

        while (palpite != numeroParaAdivinhar) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroParaAdivinhar) {
                System.out.println("O número escolhido é maior que " + palpite + ". Tente novamente.");
            } else if (palpite > numeroParaAdivinhar) {
                System.out.println("O número escolhido é menor que " + palpite + ". Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número: " + numeroParaAdivinhar);
            }
        }
        scanner.close();
    }
}
