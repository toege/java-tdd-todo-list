package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    // Add Task
    @Test
    public void addTaskTestReturnTrue() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        Assertions.assertTrue(result);
    }

    @Test
    public void addTaskTestReturnFalse() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        result = toDo.addTask("Clean");
        Assertions.assertFalse(result);
    }

    // See Tasks
    @Test
    public void displayTasksTestReturnTrue() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        result = toDo.displayTasks();
        Assertions.assertTrue(result);
    }

    @Test
    public void displayTasksTestReturnFalse() {
        TodoList toDo = new TodoList();
        boolean result = toDo.displayTasks();
        Assertions.assertFalse(result);
    }

    // update task status
    @Test
    public void taskStatusTest() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        result = toDo.taskStatus("Clean", true);
        Assertions.assertTrue(result);
        result = toDo.taskStatus("Clean", false);
        Assertions.assertFalse(result);
    }

    // Print Completed Tasks
    @Test
    public void displayCompletedTasksTestReturnTrue() {
        TodoList toDo = new TodoList();
        boolean result = toDo.addTask("Clean");
        result = toDo.taskStatus("Clean", true);
        result = toDo.displayCompletedTasks();
        Assertions.assertTrue(result);
    }
}
