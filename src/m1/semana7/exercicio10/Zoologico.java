package m1.semana7.exercicio10;

import m1.semana7.exercicio7.Animal;
import m1.semana7.exercicio7.Cachorro;
import m1.semana7.exercicio7.Cavalo;
import m1.semana7.exercicio7.Preguica;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    public static void main(String[] args) {

        List<Animal> jaulas = new ArrayList<Animal>();

        for (int i = 0; i < 10; i++) {
            if (i < 3) {
                Cachorro cachorro = new Cachorro("marley", 10);
                jaulas.add(cachorro);
            } else if (i < 6) {
                Cavalo cavalo = new Cavalo("spirit", 15);
                jaulas.add(cavalo);
            } else {
                Preguica preguica = new Preguica("preguiça", 25);
                jaulas.add(preguica);
            }
        }

        for (Animal animal: jaulas) {
            animal.emitirSom();
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).correr();
            } else if (animal instanceof Cavalo) {
                ((Cavalo) animal).correr();
            }
        }
    }

}
