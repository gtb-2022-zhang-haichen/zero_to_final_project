package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

public record Sections(String title, boolean flag) {

    public static final String TO_BE_DONE_TITLE = "# To be done";
    public static final boolean TO_BE_DONE_FLAG = false;
    public static final String COMPLETED_TITLE = "# Completed";
    public static final boolean COMPLETED_FLAG = true;

    static Sections completed() {
        return new Sections(COMPLETED_TITLE, COMPLETED_FLAG);
    }

    static Sections tbd() {
        return new Sections(TO_BE_DONE_TITLE, TO_BE_DONE_FLAG);
    }

    List<String> format(List<Task> tasks) {
        List<String> result = new ArrayList<>();
        result.add(title());
        tasks.stream()
            .filter(this::isTaskCompleted)
            .map(Task::format)
            .forEach(result::add);
        return result;
    }

    private boolean isTaskCompleted(Task task) {
        return flag() == task.isCompleted();
    }
}