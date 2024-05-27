
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite seu nome!");
        String nome = scanner.next();
       
        System.out.println("Por favor, digite seu sobrenome!");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();
        while (saldo < 0){
            System.out.println("Não é permitido inserir saldo negativo! \nPor favor, Digite novo valor");
            saldo = scanner.nextDouble();
        }

        System.out.println("Olá, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + NumberFormat.getCurrencyInstance().format(saldo) + " já está disponível para saque.");
    }
}
