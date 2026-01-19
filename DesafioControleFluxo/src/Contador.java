import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametroInvalidoException e) {
            System.err.println("O segundo parâmetro tem que ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {
        if (parametroUm > parametroDois) {
            throw new ParametroInvalidoException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
