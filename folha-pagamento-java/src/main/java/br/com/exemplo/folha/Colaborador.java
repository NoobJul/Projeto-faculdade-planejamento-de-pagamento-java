package br.com.exemplo.folha;

public class Colaborador {
    private String matricula;
    private String nome;
    private double salarioBase;

    public Colaborador(String matricula, String nome, double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalarioFinal() {
        return salarioBase;
    }

    public void exibirDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.printf("Salário-base: R$ %.2f%n", salarioBase);
        System.out.printf("Salário final: R$ %.2f%n", calcularSalarioFinal());
    }
}
