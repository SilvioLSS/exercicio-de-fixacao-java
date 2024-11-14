package Programa;
import Entidades.Aluno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Aluno a1 = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.printf("\nDigite o nome do aluno: ");
        a1.setNome(sc.nextLine());

        System.out.printf("\nDigite a nota 1 do aluno %s (De 0 a 10): ", a1.getNome());
        a1.setNota1(sc.nextDouble());

        System.out.printf("\nDigite a nota 2 do aluno %s (De 0 a 10): ", a1.getNome());
        a1.setNota2(sc.nextDouble());

        System.out.printf("\nDigite a nota 3 do aluno %s (De 0 a 10): ", a1.getNome());
        a1.setNota3(sc.nextDouble());

        double media = a1.getNota1() * 0.30 + a1.getNota2() * 0.35 + a1.getNota3() * 0.35;

        System.out.printf("\nA média do aluno %s é: %.2f\n\n", a1.getNome(), media);
        
        sc.close();
    }
}
