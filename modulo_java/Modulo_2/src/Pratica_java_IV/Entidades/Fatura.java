package Pratica_java_IV.Entidades;

import java.util.List;

public class Fatura {
    Cliente cliente;
    List<Item> itens;
    Double total;

    public Fatura(Cliente cliente, List<Item> itens, Double total) {
        this.cliente = cliente;
        this.itens = itens;
        this.total = total;
    }
}
