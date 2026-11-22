package br.com.exemplo.folha;

public class ColaboradorComissionado extends Colaborador {
    private double totalVendas;
    private double percentualComissao;

    public ColaboradorComissionado(String matricula, String nome, double salarioBase,
                                   double totalVendas, double percentualComissao) {
        super(matricula, nome, salarioBase);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalarioFinal() {
        double comissao = totalVendas * percentualComissao / 100;
        return getSalarioBase() + comissao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Total de vendas: R$ %.2f%n", totalVendas);
        System.out.printf("Percentual de comissão: %.2f%%%n", percentualComissao);
    }
}
