package m1.semana7.exercicio6;

public class TesteVendedor {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor(
                1,
                2000,
                10,
                12000,
                5);

        System.out.println(vendedor.calcularSalario());

    }
}
