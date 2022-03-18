package Pratica_1_java_III;

import Pratica_1_java_III.exercicio_2.entities.Cachorro;
import Pratica_1_java_III.exercicio_2.entities.Gato;
import Pratica_1_java_III.exercicio_2.entities.Vaca;

public class Exercicio_3 {
    public static void main(String[] args) {
        Cachorro rex = new Cachorro();
        rex.barulho();
        rex.comerCarne();
        rex.comerAnimal(rex);
        Gato chanin = new Gato();
        chanin.barulho();
        chanin.comerCarne();
        chanin.comerAnimal(chanin);
        Vaca futuro_hamburguer = new Vaca();
        futuro_hamburguer.barulho();
        futuro_hamburguer.comerPasto();
        futuro_hamburguer.comerAnimal(futuro_hamburguer);
    }
}
