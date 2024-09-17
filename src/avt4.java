import java.util.Scanner;

public class avt4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idade = 0;

        do {
            System.out.print("Digite sua idade : ");
            idade = scanner.nextInt();

            if (idade <= 0) {
                System.out.println("Idade inválida, insira um número maior que 0");
            }
        } while (idade <= 0);

        System.out.println("Idade válida fornecida: " + idade);

        scanner.close();
    }

}
