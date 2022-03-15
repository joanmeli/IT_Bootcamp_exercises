package Pratica_1_java_III.exercicio_2.entities;

public class Relatorio {
    String conteudo;
    int numero_paginas;
    String autor;
    String revisor;

    public Relatorio(String conteudo, int numero_paginas, String autor, String revisor) {
        this.conteudo = conteudo;
        this.numero_paginas = numero_paginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String toString(){
        return "Conteudo: " + this.conteudo + "\n" +
                "Autor: " + this.autor + "\n" +
                "Revisor: " + this.revisor + "\n" +
                "Paginas: " + this.numero_paginas + "\n";
    }
}
