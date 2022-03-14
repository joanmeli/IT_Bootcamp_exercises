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

    public int calcularIMC(){
        double altura = this.altura/100;
        double imc = this.peso/(altura*2);
        if(imc < 20){
            return -1;
        }
        if( imc > 25){
            return 1;
        }
        return 0;
    }

    public boolean ehMaiorIdade(){
        if (this.idade > 18){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n\nPessoa {" +
                "ID =" + this.ID +
                ", Nome =" + this.nome+
                ", Idade =" + this.idade+ " anos" +
                ", Peso =" + this.peso+
                ", Altura =" + this.altura+ " cm" +
                '}';
    }
}
