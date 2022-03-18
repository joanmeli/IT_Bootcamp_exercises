package Pratica_1_java_III.exercicio_2.entities;

import Pratica_1_java_III.interfaces.Herbivoro;

public class Vaca extends Animal implements Herbivoro {
    @Override
    public void barulho() {
        System.out.println("Mu");
    }

    @Override
    public void comerPasto() {
        System.out.println("Comendo capim ...");
    }
}
