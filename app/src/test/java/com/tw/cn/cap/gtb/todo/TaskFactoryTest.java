package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTest {
    @Test
    void should_parse_complete_field_of_task() {
        boolean isCompleted = TaskFactory.createTask(1, "+ foo").isCompleted();
        assertFalse(isCompleted);
    }

    @Test
    void should_support_name_with_multiple_white_space() {
        Task task = TaskFactory.createTask(1, "+    foo   bar   ");
        assertEquals("   foo   bar   ", task.name());
    }
}