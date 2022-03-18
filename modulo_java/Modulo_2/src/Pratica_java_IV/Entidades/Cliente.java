package Pratica_java_IV.Entidades;

public class Cliente {
    int ID;
    String nome;
    String sobrenome;

    public Cliente(int ID, String nome, String sobrenome) {
        this.ID = ID;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString(){
        return "\n" + "ID: " + this.ID +
                " Nome: " + this.nome +
                " Sobrenome: " + this.sobrenome;
    }

    public int getID() {
        return ID;
    }
}
