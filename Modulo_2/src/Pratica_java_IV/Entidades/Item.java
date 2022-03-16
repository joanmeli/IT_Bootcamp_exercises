package Pratica_java_IV.Entidades;

public class Item {
    String codigo;
    String nome;
    int quantidade;
    Double custo;


    public Item(String codigo, String nome, int quantidade, double custo) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.custo = custo;
    }
}
