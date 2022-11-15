import java.util.Scanner;

public class Tarefa_Wrappers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        Integer idade2 = idade;
        System.out.println("Sua idade é " + idade2);
    }
}
