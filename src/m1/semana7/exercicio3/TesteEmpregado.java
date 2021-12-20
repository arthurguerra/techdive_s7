package m1.semana7.exercicio3;

import m1.semana7.exercicio1.Pessoa;

public class TesteEmpregado {

    public static void main(String[] args) {

        Empregado empregado = new Empregado(
                1,
                4000,
                20);

        System.out.println(empregado.calcularSalario());
    }
}
