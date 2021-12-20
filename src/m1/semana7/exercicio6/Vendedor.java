package m1.semana7.exercicio6;

import m1.semana7.exercicio3.Empregado;

public class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao;

    public Vendedor(int codigoSetor, double salarioBase, double imposto) {
        super(codigoSetor, salarioBase, imposto);
    }

    public Vendedor(int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas * (comissao / 100));
    }
}
