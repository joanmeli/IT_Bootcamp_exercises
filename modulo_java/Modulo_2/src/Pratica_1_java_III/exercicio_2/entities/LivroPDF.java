package Pratica_1_java_III.exercicio_2.entities;

import Pratica_1_java_III.exercicio_2.MostraConteudo;

public class LivroPDF implements MostraConteudo {
    int numero_paginas;
    String autor;
    String titulo;
    GenerosLivro genero;

    public LivroPDF(int numero_paginas, String autor, String titulo, GenerosLivro genero) {
        this.numero_paginas = numero_paginas;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString(){
        return "Titulo: " + this.titulo + "\n" +
                "Autor: " + this.autor + "\n" +
                "Gênero: " + this.genero + "\n" +
                "Paginas: " + this.numero_paginas + "\n";
    }
}
