package m1.semana7.exercicio7;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro emitindo som...");
    }

    public void correr() {
        System.out.println("Cachorro correndo...");
    }
}
