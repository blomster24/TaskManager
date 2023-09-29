package view;

import java.util.Scanner;

public class UIMenu {

    public static void showMenu() {
        System.out.println(">---TaskMaster---<");
        System.out.println("Choose an option");

        Scanner sc = new Scanner(System.in);
        int response = 0;

        do {
            System.out.println("1. Add new task");
            System.out.println("2. List tasks");
            System.out.println("3. Complete task");
            System.out.println("4. Uncomplete task");
            System.out.println("5. Delete task");
            System.out.println("0. Exit");
            System.out.print(">> ");
            response = Integer.valueOf(sc.nextLine());

        } while (response != 0);
    }
}
