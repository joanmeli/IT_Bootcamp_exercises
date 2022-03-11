package Pratica_1_java_II;

public class Pessoa {
    String nome;
    int idade;
    String ID;
    Double peso;
    int altura; // Altura em cm


    public Pessoa() {}

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(String nome, int idade, String ID, Double peso, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }
}
