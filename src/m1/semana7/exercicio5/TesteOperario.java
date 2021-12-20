package m1.semana7.exercicio5;

public class TesteOperario {

    public static void main(String[] args) {

        Operario operario = new Operario(
                1,
                2000,
                20,
                10000,
                10);

        System.out.println(operario.calcularSalario());
    }

}
