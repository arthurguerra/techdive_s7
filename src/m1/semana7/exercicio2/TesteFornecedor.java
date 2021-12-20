package m1.semana7.exercicio2;

public class TesteFornecedor {

    public static void main(String[] args) {

        Fornecedor fornecedor1 = new Fornecedor("nome", "endereço", "telefone");

        Fornecedor fornecedor2 = new Fornecedor(
                "nome",
                "endereço",
                "telefone",
                100,
                200);


        System.out.println(fornecedor1.getNome() + " " + fornecedor1.obterSaldo());
        fornecedor2.setNome("Fornecedor 2");
        System.out.println(fornecedor2.getNome() + " " + fornecedor2.obterSaldo());
    }
}
