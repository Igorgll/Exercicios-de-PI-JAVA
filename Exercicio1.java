import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int num1 = read.nextInt();

    System.out.println("Digite um número: ");
    int num2 = read.nextInt();

    int resultado = (num1 + num2);

    if (resultado > 20) {
      resultado = (resultado + 8);
      System.out.println(resultado);
    } else if (resultado <= 20) {
      resultado = (resultado - 5);
      System.out.println(resultado);
    }

  }
}
