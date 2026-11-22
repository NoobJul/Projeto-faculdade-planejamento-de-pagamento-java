package br.com.exemplo.folha;

public class ColaboradorProducao extends Colaborador {
    private int quantidadePecas;
    private double valorPorPeca;

    public ColaboradorProducao(String matricula, String nome, double salarioBase,
                               int quantidadePecas, double valorPorPeca) {
        super(matricula, nome, salarioBase);
        this.quantidadePecas = quantidadePecas;
        this.valorPorPeca = valorPorPeca;
    }

    @Override
    public double calcularSalarioFinal() {
        double valorProducao = quantidadePecas * valorPorPeca;
        return getSalarioBase() + valorProducao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de peças: " + quantidadePecas);
        System.out.printf("Valor por peça: R$ %.2f%n", valorPorPeca);
    }
}
