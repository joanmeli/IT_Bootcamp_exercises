package Pratica_1_java_III.exercicio_2;

import Pratica_1_java_II.Pessoa;
import Pratica_1_java_III.exercicio_2.entities.Curriculo;
import Pratica_1_java_III.exercicio_2.entities.GenerosLivro;
import Pratica_1_java_III.exercicio_2.entities.LivroPDF;
import Pratica_1_java_III.exercicio_2.entities.Relatorio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa joan = new Pessoa("Joan", 23, "aaa");
        ArrayList habilidades = new ArrayList<String>();
        habilidades.add("asas");
        habilidades.add("wssqswq");
        Curriculo joan_cv = new Curriculo(
                joan, habilidades
        );
        LivroPDF livro = new LivroPDF(23, "Joao", "Super livro", GenerosLivro.ACAO);
        Relatorio relatorio = new Relatorio("Conteudo de um relatorio super importante", 4, "Maria", "Gerdeson");

        MostraConteudo.mostrarConteudo(joan_cv);
        System.out.println();
        MostraConteudo.mostrarConteudo(livro);
        System.out.println();
        MostraConteudo.mostrarConteudo(relatorio);
    }
}
