package Pratica_2_java_III;

import Pratica_1_java_III.exercicio_2.entities.Vaca;
import Pratica_2_java_III.Entidades.Garagem;
import Pratica_2_java_III.Entidades.Marca;
import Pratica_2_java_III.Entidades.Veiculo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> carros = new ArrayList<Veiculo>(Arrays.asList(
                new Veiculo(Marca.FORD, "Fiesta", 1000.00),
                new Veiculo(Marca.FORD, "Focus", 1200.00),
                new Veiculo(Marca.FORD, "Explorer", 2500.00),
                new Veiculo(Marca.FIAT, "Uno", 500.00),
                new Veiculo(Marca.FIAT, "Cronos", 1000.00),
                new Veiculo(Marca.FIAT, "Torino", 1250.00),
                new Veiculo(Marca.CHEVROLET, "Aveo", 1250.00),
                new Veiculo(Marca.CHEVROLET, "Spin", 2500.00),
                new Veiculo(Marca.TOYOTA, "Corola", 1200.00),
                new Veiculo(Marca.TOYOTA, "Fortuner", 3000.00),
                new Veiculo(Marca.RENAULT, "Logan", 950.00)
        ));
        Garagem super_garagem = new Garagem(123, carros);
        System.out.println(super_garagem.getVeiculos());
        System.out.println("-------------------------------------");
        super_garagem.getVeiculos().sort((a,b) -> a.getPreco().compareTo(b.getPreco()));
        System.out.println(super_garagem.getVeiculos());
        System.out.println("-------------------------------------");
        super_garagem.getVeiculos().sort((a,b) -> a.getMarca().compareTo(b.getMarca()));
        System.out.println(super_garagem.getVeiculos());

    }
}
