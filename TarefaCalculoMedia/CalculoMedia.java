import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("********Calculand a média********");

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a primeira nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a primeira nota: ");
        double nota3 = scan.nextDouble();
        System.out.println("Digite a primeira nota: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média é: " + media);


    }
}
