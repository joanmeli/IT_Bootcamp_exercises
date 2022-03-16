package Pratica_2_java_III.Entidades;

public class Veiculo {
    private String modelo;
    private Marca marca;
    private Double preco;

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

    @Override
    public String toString(){
        return "Modelo: " + this.modelo +
                " Marca: " + this.marca +
                " Preço: " + this.preco + "\n";
    }
}
