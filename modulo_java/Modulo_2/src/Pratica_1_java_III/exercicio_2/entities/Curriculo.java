package Pratica_1_java_III.exercicio_2.entities;

import Pratica_1_java_II.Pessoa;
import Pratica_1_java_III.exercicio_2.MostraConteudo;

import java.util.List;

public class Curriculo {
    Pessoa pessoa;
    List<String> habilidades;

    public Curriculo(Pessoa pessoa, List<String> habilidades) {
        this.pessoa = pessoa;
        this.habilidades = habilidades;
    }

    @Override
    public String toString(){
        return pessoa.toString() + "\n" +
                "Habilidades " + habilidades.toString();
    }
}
