import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double valor, calculaImposto;
        int escolha;

        do {
            System.out.println();
            System.out.println("***********************MENU***********************");
            System.out.println("0 - SAIR");
            System.out.println("1 - CALCULAR IMPOSTO");
            escolha = read.nextInt();

            if (escolha == 0) {
                System.out.println("FINALIZANDO O PROGRAMA...");
                break;
            }

            if (escolha == 1) {
                System.out.println("Digite o valor a ser calculado: ");
                valor = read.nextDouble();

                System.out.println("Valor digitado: " + valor);

                if (valor <= 1200) {
                    System.out.println(valor + "é isento de imposto");
                }

                else if (valor >= 1201 && valor <= 2500) {
                    System.out.println("O imposto é de 10%");
                    calculaImposto = (valor * 10) / 100;
                    System.out.println("O valor de imposto a ser pago é de: " + calculaImposto);
                }

                else if (valor >= 2501 && valor <= 5000) {
                    System.out.println("O imposto é de 15%");
                    calculaImposto = (valor * 15) / 100;
                    System.out.println("O valor de imposto a ser pago é de: " + calculaImposto);
                }

                else if (valor > 5000) {
                    System.out.println("O imposto é de 20%");
                    calculaImposto = (valor * 20) / 100;
                    System.out.println("O valor de imposto a ser pago é de: " + calculaImposto);
                }
            }

        } while (escolha == 1);

    }
}
