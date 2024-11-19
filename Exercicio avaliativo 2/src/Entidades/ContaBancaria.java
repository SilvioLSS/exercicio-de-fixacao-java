package Entidades;

public class ContaBancaria {
    private String nome;
    private int numero;
    private double saldo;

    public ContaBancaria(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if (saldo < 0){
            System.out.println("Você não pode abrir uma conta com um saldo negativo.");
        } else{
            this.saldo = saldo;
        }
    }

    

    
}
