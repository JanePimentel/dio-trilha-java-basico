import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro.: ");
        //verificar se a próxima entrada é um inteiro antes de chamar nextInt()
        if (!terminal.hasNextInt()) {
            throw new InputMismatchException("Entrada inválida. Por favor, insira um número.");
        }
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro.: ");
        if (!terminal.hasNextInt()) {
            throw new InputMismatchException("Entrada inválida. Por favor, insira um número.");
        }
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm e Dois são números negativos e lançar a exceção
        if (parametroUm < 0 || parametroDois < 0) {
            throw new ParametrosInvalidosException("Parâmetros não podem ser negativos!");
        }
        // validar se parametroUm é maior que o dois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}