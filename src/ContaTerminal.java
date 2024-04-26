import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o número da conta:");
    String numeroConta = scan.nextLine();


    System.out.println("Digite a agência:");
    String agenciaConta =  scan.nextLine();

    System.out.println("Digite o nome do cliente:");
    String clienteConta =  scan.nextLine();

    System.out.println("Digite o saldo da conta:");
    Float saldoConta =  scan.nextFloat();

    //TODO exibir os dados da conta

    System.out.println("Olá " + clienteConta + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + "," + "conta " +     numeroConta + " e seu saldo "  + saldoConta + "já está disponível para saque");


    }
}
