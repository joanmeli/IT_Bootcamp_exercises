package Pratica_2;

import java.util.Scanner;

public class Menu {
    public static int show_menu(Scanner in){
        System.out.println("Selecione uma das opcoes:");
        System.out.println("1 - Adcionar novo participante");
        System.out.println("2 - Listar participantes por categoria");
        System.out.println("3 - Cancelar inscricao de um participante");
        int option = in.nextInt();
        return  option;
    }
}
