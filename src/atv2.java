import java.util.Scanner;

public class atv2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite qualquer número para iniciar a contagem regressiva: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Digite um número que não seja negativo.");
        } else {

            System.out.println("Contagem Regressiva:");
            while (numero >= 0) {
                System.out.println(numero);
                numero--;
            }
        }

        scanner.close();
    }
}
