import java.util.Scanner;

public class Exercicio6 {
    public static void main(String [] args) {
        
        Scanner read = new Scanner(System.in);

        System.out.println("Digite seu sexo: ");
        String sexo = read.nextLine();

        System.out.println("Digite sua altura: ");
        double altura = read.nextDouble();

        if (sexo == "Masculino") {
            double peso = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal de acordo com o sexo e altura é: " + peso + "kg");
        }else {
            double peso = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal de acordo com o sexo e altura é: " + peso + "kg");
        }

    }
}
