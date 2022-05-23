package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

public class ListCommand {
    final TaskRepository taskRepository = new TaskRepository();


    List<String> run() {
        List<Task> tasks = taskRepository.loadTasks();
        List<String> result = new ArrayList<>();
        result.addAll(Sections.tbd().format(tasks));
        result.addAll(Sections.completed().format(tasks));
        return result;
    }
}