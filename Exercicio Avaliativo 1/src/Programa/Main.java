package Programa;
import Entidades.Aluno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Aluno a1 = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.printf("\nDigite o nome do aluno: ");
        a1.setNome(sc.nextLine());

        System.out.printf("\nDigite a nota 1 do aluno %s: ", a1.getNome());
        a1.setNota1(sc.nextDouble());

        System.out.printf("\nDigite a nota 2 do aluno %s: ", a1.getNome());
        a1.setNota2(sc.nextDouble());

        System.out.printf("\nDigite a nota 3 do aluno %s: ", a1.getNome());
        a1.setNota3(sc.nextDouble());

        System.out.printf("\nA média do aluno %s é %.2f: ", a1.getNome());
        
        sc.close();
    }
}
