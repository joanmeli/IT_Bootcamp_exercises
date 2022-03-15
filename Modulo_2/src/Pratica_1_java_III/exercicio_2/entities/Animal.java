package Pratica_1_java_III.exercicio_2.entities;

import Pratica_1_java_III.interfaces.Carnivoro;
import Pratica_1_java_III.interfaces.Herbivoro;

public abstract class Animal {
    public  abstract void barulho();
    public void comerAnimal(Carnivoro obj){
        obj.comerCarne();
    }

    public void comerAnimal(Herbivoro obj){
        obj.comerPasto();
    }
}
