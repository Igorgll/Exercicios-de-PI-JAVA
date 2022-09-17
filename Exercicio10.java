import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String simbolo;
        int linhas;

        System.out.println("Digite um símbolo:");
        simbolo = input.nextLine();

        System.out.println("Digite o número de linhas para repetir");
        linhas = input.nextInt();

        System.out.println();
        for (int i = 0; i <= linhas; i++) {
            for (int j = 0; j <= i; j++) {
                String shape = simbolo + simbolo;
                System.out.print(shape);
            }
            System.out.println();
        }

        for (int i = linhas; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                String shape = simbolo + simbolo;
                System.out.print(shape);
            }
            System.out.println();
        }
    }
}
