import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
    
        System.out.println("Digite um número: ");
        double num = read.nextDouble();
    
        if (num >= 20 && num <= 90) {
          System.out.println("O número está entre 20 e 90");
        } else {
          System.out.println("O número não está entre 20 e 90");
        }
      }
}
