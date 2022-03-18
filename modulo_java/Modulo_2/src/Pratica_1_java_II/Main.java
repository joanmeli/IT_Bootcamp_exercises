package Pratica_1_java_II;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa_empty = new Pessoa();
        Pessoa pessoa_half = new Pessoa("Joan", 23, "aaa");
        Pessoa pessoa_full = new Pessoa("Joaozinho", 60, "bbb", 90.0, 168);
        //Pessoa pessoa_unknow = new Pessoa("Desconhecido", 90); // Ocorre o erro no suitable constructor found for Pessoa
    }
}
