/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

public class App {


    private final TaskRepository taskRepository = new TaskRepository();

    public static void main(String[] args) {
        throw new UnsupportedOperationException();
    }

    public List<String> run() {
        List<Task> tasks = taskRepository.loadTasks();
        List<String> result = new ArrayList<>();
        result.addAll(Sections.tbd().format(tasks));
        result.addAll(Sections.completed().format(tasks));
        return result;
    }

}
