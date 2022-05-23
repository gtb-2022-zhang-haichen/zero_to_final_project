package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    List<Task> loadTasks() {
        List<String> lines = readTasks();
        List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            int id = i + 1;
            String name = lines.get(i);
            Task task = new Task(id, name);
            tasks.add(task);
        }
        return tasks;
    }

    List<String> readTasks() {
        try {
            return Files.readAllLines(Constants.TASK_PATH, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new AppCannotReadFileException(e);
        }
    }
}