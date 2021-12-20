package m1.semana7.exercicio8;

import m1.semana7.exercicio7.Animal;
import m1.semana7.exercicio7.Cachorro;
import m1.semana7.exercicio7.Cavalo;
import m1.semana7.exercicio7.Preguica;

import java.util.ArrayList;
import java.util.List;

public class TesteAnimais {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("marley", 10);

        cachorro.emitirSom();
        cachorro.correr();

        Cavalo cavalo = new Cavalo("spirit", 15);

        cavalo.emitirSom();
        cavalo.correr();

        Preguica preguica = new Preguica("preguiça", 25);

        preguica.emitirSom();
        preguica.subirArvore();
        
        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(cavalo);
        animais.add(preguica);

        for (Animal animal: animais) {
            animal.emitirSom();
        }
    }
}
