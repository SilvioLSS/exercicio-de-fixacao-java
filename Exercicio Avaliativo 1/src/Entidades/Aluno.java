package Entidades;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (validar(nota1)) {
            this.nota1 = nota1;
        } else {
            throw new IllegalArgumentException("Nota inválida!");
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (validar(nota2)) {
            this.nota2 = nota2;
        } else {
            throw new IllegalArgumentException("Nota inválida!");
        }
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        if (validar(nota3)) {
            this.nota3 = nota3;
        } else {
            throw new IllegalArgumentException("Nota inválida!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private boolean validar(double valor) {
        if (valor >= 0 && valor <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public double calcularMedia() {
        return nota1 * 0.30 + nota2 * 0.35 + nota3 * 0.35;
    }

    public boolean aprovar(){
        if (calcularMedia() > 5.99)
            return true;
        else
            return false;
    }

}