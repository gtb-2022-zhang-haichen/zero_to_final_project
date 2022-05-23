package com.tw.cn.cap.gtb.todo;


public class TaskFactory {

    private TaskFactory(){}
    static Task createTask(int id, String line) {
        String[] fields = line.split(" ", 2);
        boolean isCompleted = fields[0].equals("x");
        String name = fields[1];
        return new Task(id, name, isCompleted);
    }
}