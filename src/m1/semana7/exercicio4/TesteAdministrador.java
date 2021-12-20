package m1.semana7.exercicio4;

public class TesteAdministrador {

    public static void main(String[] args) {

        Administrador admin = new Administrador(
                1,
                2000,
                10,
                500
        );

        System.out.println("Salário base: RS" + admin.getSalarioBase());
        System.out.println("Salário líquido: RS" + admin.calcularSalario());
        admin.setSalarioBase(3000);
        System.out.println("Salário líquido: RS" + admin.calcularSalario());
    }
}
