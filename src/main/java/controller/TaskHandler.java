package controller;

import model.Task;

import java.util.ArrayList;

public class TaskHandler {

    private ArrayList<Task> tasks;

    public TaskHandler() {
        this.tasks = new ArrayList<>();
    }

    public TaskHandler(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }


    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    //Add task
    public void addTask(String title, String description) {
        Task task = new Task(title, description);
        tasks.add(task);
    }

    public void deleteTask(int index){
        tasks.remove(index);
    }



}
