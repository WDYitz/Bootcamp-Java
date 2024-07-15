package com.yitzhak.secondweek.CollectionsAPI.List;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
  private List<Task> tasks;

  public TaskList() {
    this.tasks = new ArrayList<>();
  }

  public void addTask(String description) {
    this.tasks.add(new Task(description));
  }

  public void deleteTask(String description) {
    List<Task> removedTasks = new ArrayList<>();
    for (Task task : this.tasks) {
      if (task.getDescription().equalsIgnoreCase(description)) {
        removedTasks.add(task);
      }
    }
    this.tasks.removeAll(removedTasks);
  }

  public int getTotalTasks() {
    return this.tasks.size();
  }

  public void getTasks() {
    System.out.println("Tasks: " + this.tasks);
  }

  public static void main(String[] args) {
    TaskList taskList = new TaskList();

    taskList.addTask("Buy groceries");
    taskList.addTask("Buy groceries");
    taskList.addTask("Clean the house");
    System.out.println("Total tasks: " + taskList.getTotalTasks());

    taskList.deleteTask("Buy groceries");
    System.out.println("Total tasks: " + taskList.getTotalTasks());
    taskList.getTasks();
  }
}
