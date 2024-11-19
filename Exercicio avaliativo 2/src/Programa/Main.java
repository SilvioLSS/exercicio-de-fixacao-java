package Programa;
import Entidades.ContaBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da sua nova conta: ");
        int numConta = sc.nextInt();

        sc.nextLine();

        ContaBancaria c1 = new ContaBancaria(numConta, 0);

        System.out.println("Digite o nome do titular: ");
        c1.setNome(sc.nextLine());

        System.out.println("Deseja fazer um depósito inicial?");
        System.out.println("Digite o valor desejado ou '0' para pular:");
        c1.setSaldo(sc.nextDouble());

        sc.close();
    }
}
