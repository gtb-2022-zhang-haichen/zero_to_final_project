/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void should_list_existed_tasks() {
        List<String> result = new App().run();
        assertEquals(List.of(
                "# To be done",
                "1 T01",
                "2 T02",
                "# Completed",
                "3 T03",
                "4 T04"
            ),
            result);
    }
}
