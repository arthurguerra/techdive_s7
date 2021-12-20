package m1.semana7.exercicio7;

public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Preguiça emitindo som...");
    }

    public void subirArvore() {
        System.out.println("Preguiça subindo a árvore...");
    }
}
