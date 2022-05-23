package com.tw.cn.cap.gtb.todo;

import java.io.IOException;

public class AppCannotReadFileException extends RuntimeException {
    public AppCannotReadFileException(IOException e) {
        super(e);
    }
}
