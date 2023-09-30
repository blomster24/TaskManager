package view;

import controller.TaskHandler;
import model.Task;

import java.util.Scanner;

public class UIMenu {

    private static TaskHandler taskHandler = new TaskHandler();

    public static void showMenu() {

        System.out.println("Choose an option");

        Scanner sc = new Scanner(System.in);
        int response = 0;

        do {
            System.out.println("1. Add new task");
            System.out.println("2. Tasks list");
            System.out.println("3. Complete task");
            System.out.println("4. Uncompleted task");
            System.out.println("5. Delete task");
            System.out.println("0. Exit");
            System.out.print(">> ");

            int value = 0;
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                if (value > 5) {
                    System.out.println("Enter a number between 0-5\n");
                    UIMenu.showMenu();
                }
            } else {
                System.out.println("Enter a number between 0-5\n");
                UIMenu.showMenu();
            }
            response = value;

            switch (response) {
                case 1:
                    showAddTaskMenu();
                    break;
                case 2:
                    showTaskList();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    showDeleteTaskMenu();
                    break;
            }

        } while (response != 0);
    }

    private static void showAddTaskMenu() {
        Scanner sc = new Scanner(System.in);
        String title = "";
        String description = "";

        System.out.println("Title task");
        System.out.print(">> ");
        title = sc.nextLine();

        System.out.println("Description");
        System.out.print(">> ");
        description = sc.nextLine();

        taskHandler.addTask(title, description);
        if (taskHandler.getTasks().size() > 0) System.out.println("Task added");
    }

    private static void showTaskList() {
        int i = 1;
        if (taskHandler.getTasks().size() == 0) System.out.println("There are no tasks\n");

        for (Task task :
                taskHandler.getTasks()) {
            String state = "";
            if (task.getState()) state = "Completed";
            if (!task.getState()) state = "Uncompleted";
            System.out.println(i + ". " + task.getTitle() + "\n   Description: " + task.getDescription() + "\n   State: " + state + "\n");
        }
    }

    private static void showDeleteTaskMenu() {
        int taskSize = taskHandler.getTasks().size();
        if (taskSize == 0) {
            System.out.println("There are no tasks\n");
            showMenu();
        }
        System.out.println("Select the task to delete");
        showTaskList();
        System.out.println("0. Return");

        Scanner sc = new Scanner(System.in);
        int taskSelected = 0;
        if (sc.hasNextInt()) {
            taskSelected = sc.nextInt();
            if (taskSelected > taskSize) {
                System.out.println("Enter a number between 0-" + taskSize + "\n");
                showDeleteTaskMenu();
            }
        } else {
            System.out.println("Enter a number between 0-" + taskSize + "\n");
            showDeleteTaskMenu();
        }
        taskHandler.deleteTask(taskSelected - 1);
        System.out.println("Task deleted\n");
    }


}
