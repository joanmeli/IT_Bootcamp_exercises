package Pratica_2_java_III.Entidades;

public class Veiculo {
    String modelo;
    Marca marca;
    Double preco;

    public Veiculo(Marca marca, String modelo,  Double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public Double getPreco() {
        return preco;
    }
}
