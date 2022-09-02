import java.util.Scanner;

public class Exercicio4 {
    public static void main (String [] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = read.nextInt();

        if(numero > 20) {
            System.out.println("O número é maior do que 20");
        }else if (numero == 20 || numero < 20) {
            System.out.println("O número é igual ou menor que 20");
        }

    }
}
