package m1.semana7.exercicio9;

import m1.semana7.exercicio7.Animal;

public class Veterinario {

    public void examinar(Animal animal) {
        System.out.println("Examinando " + animal.getClass().getSimpleName() + "...");
        animal.emitirSom();
    }
}
