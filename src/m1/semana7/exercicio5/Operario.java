package m1.semana7.exercicio5;

import m1.semana7.exercicio3.Empregado;

public class Operario extends Empregado {

    private double valorProducao;
    private double comissao;

    public Operario(int codigoSetor, double salarioBase, double imposto) {
        super(codigoSetor, salarioBase, imposto);
    }

    public Operario(int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        this.setSalarioBase(this.getSalarioBase() + (this.valorProducao * (this.comissao / 100)));
        return super.calcularSalario();
    }
}
