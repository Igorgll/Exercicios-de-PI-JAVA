// Faça um programa que oferece um menu com a opção 0 - Sair para terminar e opções 1 –
// Conversão. Caso a opção indicada pelo usuário seja inválida, é mostrada uma mensagem apropriada. Em
// todos os casos exceto 0 o menu é oferecido novamente. Na opção 1 o programa deve converter a
// temperatura Celsius para Fahrenheit usando a seguinte formula:
// O programa deve informa o valor convertido

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int escolha, celsius, fahrenheit;

        do {
            System.out.println();
            System.out.println("***********************MENU***********************");
            System.out.println("0 - SAIR");
            System.out.println("1 - CONVERSÃO");
            escolha = read.nextInt();

            if (escolha == 0) {
                System.out.println("FINALIZANDO PROGRAMA...");
                break;
            }

            if (escolha == 1) {
                System.out.println("Digite a temperatura em Celsius: ");
                celsius = read.nextInt();

                fahrenheit = (9 * celsius + 160) / 5;

                System.out.println("CONVERSÃO = " + celsius + "ºC em fahrenheit é: " + fahrenheit + "ºF");
            }
        } while (escolha != 0);

    }
}
