package m1.semana7.exercicio4;

import m1.semana7.exercicio3.Empregado;

public class Administrador extends Empregado {

    private double ajudaDeCusto;

    public Administrador(int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.ajudaDeCusto;
    }
}
