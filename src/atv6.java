import java.util.Scanner;

public class atv6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a quantidade de números que você deseja inserir: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("A quantidade de números deve ser maior que 0.");
            scanner.close();
            return;
        }

        double soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        double media = soma / n;

         System.out.println("A média dos " + n + " números é: " + media);

        scanner.close();
    }

}
