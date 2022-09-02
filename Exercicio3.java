import java.util.Scanner;

public class Exercicio3 {
    public static void main (String [] args) {
        Scanner read = new Scanner(System.in);

        int maxPrestacao = 30;

        System.out.println("Digite seu salário bruto: ");
        int salario = read.nextInt();

        System.out.println("Digite o valor da prestação: ");
        double prestacao = read.nextDouble();

        int calculo = (salario * maxPrestacao) / 100;

        if (prestacao > calculo) {
            System.out.println("O empréstimo não poderá ser concedido!");
        }else {
            System.out.println("O empréstimo poderá ser concedido!");
        }
    }
}
