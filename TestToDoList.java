package TestToDoList.listaToDo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestToDoList {
    public static Scanner scanner = new Scanner(System.in);
    private static List<String> currentList = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menuItem = -1;
        while (menuItem != 0) {
            System.out.println("\n*======================*");
            System.out.println("*    Menu Principal    *");
            System.out.println("*======================*");
            System.out.println("* 1. Listar            *");
            System.out.println("* 2. Adicionar         *");
            System.out.println("* 3. Remover           *");
            System.out.println("* 0. Exit!             *");
            System.out.println("*======================*\n");
            System.out.print("* Entre com a opcao: ");
            int choice = scanner.nextInt();
            menuItem = choice;
            switch (menuItem) {
                case 1:
                    System.out.println();
                    System.out.println("*======================*");
                    System.out.println("*      Lista To-Do     *");
                    System.out.println("*======================*");
                    int number = 0;
                    for (String item : currentList) {
                        System.out.println("* " + ++number + " " + item);
                    }
                    System.out.println("*======================*");
                    break;
                case 2:
                    Scanner scan = new Scanner(System.in);
                    System.out.println("*======================*");
                    System.out.println("*    Adicionar item    *");
                    System.out.println("*======================*");
                    System.out.print("* Insira um item: ");
                    String item = scan.nextLine();
                    currentList.add(item);
                    break;
                case 3:
                    System.out.println("*======================*");
                    System.out.println("*     Remover Item     *");
                    System.out.println("*======================*");
                    System.out.print("* Qual deseja remover? ");
                    int index = scanner.nextInt();
                    if ((index - 1) < 0 || index > currentList.size()) {
                        System.out.println(
                                "* Numero inválido de index! Por favor, escolher dentre 1 a " + currentList.size());
                    } else {
                        currentList.remove(index - 1);
                    }
                    System.out.println("*======================*");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("* Entre com uma opcao valida!");
            }
        }
    }

}