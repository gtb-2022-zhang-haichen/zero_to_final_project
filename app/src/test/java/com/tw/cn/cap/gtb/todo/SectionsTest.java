package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.*;

class SectionsTest {
    @Test
    void should_show_proper_message_when_each_section_has_no_task() {
        Sections tbd = Sections.tbd();
        Sections cpl = Sections.completed();
        assertEquals(List.of("# To be done", "Empty"), tbd.format(emptyList()));
        assertEquals(List.of("# Completed", "Empty"), cpl.format(emptyList()));
    }
}