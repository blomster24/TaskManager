import view.UIMenu;

public class Main {
    /*
    Proyecto: TaskMaster

    Descripción: Crea un programa de gestión de tareas que permita a los usuarios crear, listar,
    marcar como completadas y eliminar tareas. Utiliza programación orientada a objetos para modelar
    las tareas y la aplicación en sí.

    Características del programa:

    Clase Tarea: Crea una clase Tarea que tenga atributos como título, descripción y estado (pendiente o completada).

    Clase GestorTareas: Crea una clase GestorTareas que sea responsable de almacenar y gestionar todas las tareas.
    Debe tener métodos para agregar, listar, marcar como completadas y eliminar tareas.

    Interfaz de Consola: Implementa una interfaz de consola que permita a los usuarios interactuar con el gestor de tareas.
    Por ejemplo, podrían ingresar comandos como "agregar tarea", "listar tareas", "marcar tarea como completada",
    "eliminar tarea", etc.

    */
    public static void main(String[] args) {
        UIMenu.showMenu();
    }
}
