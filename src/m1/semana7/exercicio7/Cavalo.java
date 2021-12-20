package m1.semana7.exercicio7;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cavalo emitindo som...");
    }

    public void correr() {
        System.out.println("Cavalo correndo...");
    }
}
