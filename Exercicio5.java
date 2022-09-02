import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite a sigla do seu estado: ");
        String sigla = read.nextLine();

        switch (sigla) {
            case "RJ":
                sigla = "Carioca";
                System.out.println(sigla);
                break;

            case "SP":
                sigla = "Paulista";
                System.out.println(sigla);
                break;

            case "MG":
                sigla = "Mineiro(a)";
                System.out.println(sigla);
                break;

            case "BH":
                sigla = "Bahiano";
                System.out.println(sigla);
                break;

            case "PR":
                sigla = "Paranaense";
                System.out.println(sigla);
                break;
        }

    }
}
