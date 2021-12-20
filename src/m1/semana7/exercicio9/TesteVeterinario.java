package m1.semana7.exercicio9;

import m1.semana7.exercicio7.Animal;
import m1.semana7.exercicio7.Cachorro;
import m1.semana7.exercicio7.Cavalo;
import m1.semana7.exercicio7.Preguica;

import java.util.ArrayList;
import java.util.List;

public class TesteVeterinario {

    public static void main(String[] args) {


        Cachorro cachorro = new Cachorro("marley", 10);
        Cavalo cavalo = new Cavalo("spirit", 15);
        Preguica preguica = new Preguica("preguiça", 25);

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(cavalo);
        animais.add(preguica);

        Veterinario veterinario = new Veterinario();

        for(Animal animal: animais) {
            veterinario.examinar(animal);
        }

    }
}
