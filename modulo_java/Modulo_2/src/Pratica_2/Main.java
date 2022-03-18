package Pratica_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner int_scanner = new Scanner(System.in);
        Scanner str_scanner = new Scanner(System.in);
        List<Participante> lista_participantes = new ArrayList<Participante>();
        int option = 1;
        int participantes_count = 0;
        while (option != 0) {
            option = menu.show_menu(int_scanner);
            switch (option) {
                case 1:
                    System.out.println("RG:");
                    int rg = int_scanner.nextInt();
                    System.out.println("Idade:");
                    int idade = int_scanner.nextInt();
                    System.out.println("Nome:");
                    String nome = str_scanner.next();
                    System.out.println("Sobrenome:");
                    String sobrenome = str_scanner.nextLine();
                    System.out.println("Numero de celular:");
                    String celular = str_scanner.nextLine();
                    System.out.println("Numero de emergencia:");
                    String contato_emergencia = str_scanner.nextLine();
                    System.out.println("Grupo sanguíneo:");
                    String grupo_sangue = str_scanner.nextLine();
                    Participante participante = new Participante(
                            rg, idade, participantes_count, nome, sobrenome,
                            grupo_sangue, celular, contato_emergencia
                    );
                    participantes_count++;
                    lista_participantes.add(participante);
                    participante.showCategories();
                    int category = int_scanner.nextInt();
                    participante.setCategory(category);
                    participante.showFee();
                    break;
                case 2:
                    System.out.println("Selecione uma categoria:");
                    System.out.println("1 - Circuito pequeno");
                    System.out.println("2 - Circuito médio");
                    System.out.println("3 - Circuito avançado");
                    int category_filter = int_scanner.nextInt();
                    List<Participante> participantes = new ArrayList<Participante>();
                    for (Participante p : lista_participantes) {
                        if (p.getCategory() == category_filter){
                            participantes.add(p);
                        }
                    }
                    for (Participante p : participantes) {
                        p.showData();
                    }
                    break;
                case 3:
                    System.out.println("Forneça o id do participante:");
                    int id = int_scanner.nextInt();
                    for (
                            Iterator<Participante> iterator = lista_participantes.iterator();
                            iterator.hasNext();
                    ) {
                        Participante value = iterator.next();
                        if (value.id == id) {
                            iterator.remove();
                        }
                    }
                    break;
                default:
                    System.out.println("Número inválido");
            }
        }

    }

}
