import java.util.Scanner;
public class Main {
        static void calculoNota () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite as notas de cada bimestre para o cálculo da média: ");
            double nota = 0;
            for(int i = 1; i <= 4; i++) {
                System.out.println("Nota" + i);
                nota += scanner.nextDouble();
            }
            double media = nota /4;
            if (media >= 7) {
                System.out.println("Aprovado. Sua média é: " + media);
            } else if (media >= 5 && media < 7) {
                System.out.println("Sua média é: " + media + ". Você está de recuperação.");
            } else {
                System.out.println("Reprovado. Sua média é: " + media);
            }
        }
        public static void main (String[] args) {
            calculoNota();
        }
}

