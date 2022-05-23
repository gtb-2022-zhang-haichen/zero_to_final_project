package com.tw.cn.cap.gtb.todo;

public record Task(int id, String name) {
    String format() {
        return "%d %s".formatted(id(), name());
    }
}