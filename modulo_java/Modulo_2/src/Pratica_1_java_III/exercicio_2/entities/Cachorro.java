package Pratica_1_java_III.exercicio_2.entities;

import Pratica_1_java_III.interfaces.Carnivoro;

public class Cachorro extends Animal implements Carnivoro {
    @Override
    public void barulho() {
        System.out.println("Auau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo carne ...");
    }
}
