import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        float nota;
        System.out.printf("Informe o nome do aluno: ");
        nome = teclado.nextLine();
        System.out.printf("Informe a nota: ");
        nota = teclado.nextFloat();

        System.out.format("A nota do %s é %.1f", nome, nota);
    }
}
