package ui;

import java.util.ArrayList;

import task.Task;

public class Ui {
    private final int lineLength = 50;
    private final String horizontalLine = "\t" + "-".repeat(this.lineLength);

    public void printHorizontalLine() {
        System.out.println(this.horizontalLine);
    }

    public void greet(String name) {
        this.printHorizontalLine();
        System.out.println("\t" + "Hello, I'm " + name);
        System.out.println("\t" + "What can I do for you?");
        this.printHorizontalLine();
    }

    public void exit() {
        this.printHorizontalLine();
        System.out.println("\t" + "Bye. Hope to see you again soon!");
        this.printHorizontalLine();
    }

    public void printAddTask(Task t, int size) {
        this.printHorizontalLine();
        System.out.println("\tGot it. I've added this task:");
        System.out.println("\t\t" + t);
        System.out.println("\tNow you have " + size + " tasks in the list.");
        this.printHorizontalLine();
    }

    public void printDeleteTask(Task t, int size) {
        this.printHorizontalLine();
        System.out.println("\tNoted. I've removed this task:");
        System.out.println("\t\t" + t);
        System.out.println("\t Now your have " + size + " tasks in the list.");
        this.printHorizontalLine();
    }

    public void printTasks(ArrayList<Task> tasks) {
        this.printHorizontalLine();
        if (tasks.isEmpty()) {
            System.out.println("\tNo tasks yet");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("\t" + (i + 1) + "." + tasks.get(i).toString());
            }
        }
        this.printHorizontalLine();
    }

    /**
     * Prints tasks that matches the keyword
     *
     * @param tasks ArrayList of tasks that matches the keyword
     */
    public void printMatchingTasks(ArrayList<Task> tasks) {
        this.printHorizontalLine();
        if (tasks.isEmpty()) {
            System.out.println("\t No matching tasks found");
        } else {
            System.out.println("\tHere are the matching tasks in your list");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("\t" + (i + 1) + "." + tasks.get(i).toString());
            }
        }
        this.printHorizontalLine();
    }

    public void printSuccessfulMark(Task t) {
        this.printHorizontalLine();
        System.out.println("\tNice! I've marked this task as done:");
        System.out.println("\t\t" + t.toString());
        this.printHorizontalLine();
    }

    public void printSuccessfulUnmark(Task t) {
        this.printHorizontalLine();
        System.out.println("\tOK, I've marked this task as not done yet:");
        System.out.println("\t\t" + t.toString());
        this.printHorizontalLine();
    }

    public void printException(Exception e) {
        this.printHorizontalLine();
        System.out.println("\t" + e);
        this.printHorizontalLine();
    }
}