package Pratica_java_IV;

import Pratica_2.Participante;
import Pratica_java_IV.Entidades.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class OEconomico {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>(Arrays.asList(
                new Cliente(1, "Joan", "Silva"),
                new Cliente(2, "Davi", "Santos"),
                new Cliente(3, "Késia", "Silva")
        ));
        System.out.println(clientes);
        clientes.remove(1);
        System.out.println(clientes);

        System.out.println("Informe o ID do cliente:");
        Scanner int_scanner = new Scanner(System.in);
        int cliente_id = int_scanner.nextInt();
        for (Cliente c : clientes) {
            if (c.getID() == cliente_id){
                System.out.println(c);
            }
        }

        Optional<Cliente> cliente = clientes.stream().filter(c -> c.getID() == cliente_id).findAny();
        if (cliente.isPresent()){
            //System.out.println(cliente.toString());
        }else{
            System.out.println("Cliente não encontrado");
        }

    }
}
