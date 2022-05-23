package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTest {
    @Test
    void should_parse_complete_field_of_task() {
        boolean isCompleted = TaskFactory.createTask(1, "+ foo").isCompleted();
        assertFalse(isCompleted);
    }
}