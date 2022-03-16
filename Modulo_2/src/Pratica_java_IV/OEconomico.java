package Pratica_java_IV;

import Pratica_java_IV.Entidades.Cliente;

import java.util.ArrayList;
import java.util.Arrays;

public class OEconomico {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>(Arrays.asList(
                new Cliente(1, "Joan", "Silva"),
                new Cliente(2, "Davi", "Santos"),
                new Cliente(3, "Késia", "Silva")
        ));
        System.out.println(clientes);
    }
}
