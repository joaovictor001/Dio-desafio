import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero: ");
        int numero = Integer.parseInt(sc.next());

        System.out.print("agencia: ");
        String agencia = sc.next();

        System.out.print("Nome: ");
        String nome = sc.next();

        System.out.print("Saldo: ");
        Double saldo = sc.nextDouble();


        Conta c1 = new Conta (numero,agencia,nome,saldo);

        System.out.println(c1);





    }
}