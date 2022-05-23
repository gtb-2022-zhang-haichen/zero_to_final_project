package com.tw.cn.cap.gtb.todo;

import java.nio.file.Path;

public class Constants {
    private Constants(){}
    public static final String USER_HOME = System.getProperty("user.home");
    public static final String TASK_FILENAME = "tasks";
    public static final String TODO_CONFIG_PATH = ".todo";
    public static final Path TASK_PATH = Path.of(USER_HOME, TODO_CONFIG_PATH, TASK_FILENAME);
}