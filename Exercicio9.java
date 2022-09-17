import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int linhas;

        System.out.println("Digite um símbolo:");
        String simbolo = input.nextLine();

        System.out.println("Digite o número de linhas para repetir:");
        linhas = input.nextInt();

        System.out.println();

        for (int i = 0; i <= linhas; i++) {
            for (int j = 0; j <= i; j++) {
                String resultado = simbolo + simbolo;
                System.out.print(resultado);
            }
            System.out.println();
        }
    }
}
