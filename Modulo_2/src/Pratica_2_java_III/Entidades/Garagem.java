package Pratica_2_java_III.Entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garagem {
    int ID;
    List<Veiculo> veiculos;

    public Garagem(int ID, List<Veiculo> veiculos) {
        this.ID = ID;
        this.veiculos = veiculos;
    }

    public int getID() {
        return ID;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }
}
